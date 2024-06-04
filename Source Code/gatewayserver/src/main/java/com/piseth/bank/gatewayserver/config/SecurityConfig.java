package com.piseth.bank.gatewayserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.server.SecurityWebFilterChain;

import reactor.core.publisher.Mono;


//ដោយសារយើងប្រើ Spring cloud វា build on top of spring web flux ចឹងយយើងត្រូវថែម WebfluxSecurity ទៀត
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
	
	@Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity serverHttpSecurity) {
        serverHttpSecurity.authorizeExchange(exchanges -> exchanges.pathMatchers(HttpMethod.GET).permitAll()
                .pathMatchers("/vibolbank/account/**").hasRole("ACCOUNT")
                .pathMatchers("/vibolbank/card/**").hasRole("CARD")
                .pathMatchers("/vibolbank/loan/**").authenticated())
                .oauth2ResourceServer(oAuth2ResourceServerSpec -> oAuth2ResourceServerSpec
//                        .jwt(Customizer.withDefaults()));
                		.jwt(t -> t.jwtAuthenticationConverter(grantedAuthorityExtractor())));
        serverHttpSecurity.csrf(csrfSpec -> csrfSpec.disable());
        return serverHttpSecurity.build(); 
    }
	
	private Converter<Jwt, Mono<AbstractAuthenticationToken>> grantedAuthorityExtractor(){
		
		JwtAuthenticationConverter authenticationConverter = new JwtAuthenticationConverter();
		authenticationConverter.setJwtGrantedAuthoritiesConverter(new KeyclockJwtConverter());
		return new ReactiveJwtAuthenticationConverterAdapter(authenticationConverter);
	}
	
}

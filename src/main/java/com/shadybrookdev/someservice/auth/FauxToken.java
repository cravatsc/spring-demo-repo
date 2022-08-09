package com.shadybrookdev.someservice.auth;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
public class FauxToken implements OAuthIntf{
    int num = 1;
    @Override
    public Token retrieveToken() {
        return Token.builder()
                .accessToken("Token Number: " + num++)
                .expirationTime(LocalDateTime.now().plus(10, ChronoUnit.SECONDS))
                .build();
    }
}

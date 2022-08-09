package com.shadybrookdev.someservice.auth;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Token {
    String accessToken;

    LocalDateTime expirationTime;

    public boolean isExpired(){
        return LocalDateTime.now().isAfter(expirationTime);
    }
}

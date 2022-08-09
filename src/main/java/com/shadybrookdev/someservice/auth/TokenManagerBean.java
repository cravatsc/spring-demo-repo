package com.shadybrookdev.someservice.auth;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class TokenManagerBean {
    final OAuthIntf authIntf;
    Token authToken;

    public TokenManagerBean(OAuthIntf authIntf) {
        this.authIntf = authIntf;
    }

    public String getAccessToken(){
        if(null == authToken || authToken.isExpired()){
            authToken = authIntf.retrieveToken();
        }
        return authToken.getAccessToken();
    }
}

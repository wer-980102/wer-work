package com.wer.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OauthRefreshToken {
    private String tokenId;

    private byte[] token;

    private byte[] authentication;

}
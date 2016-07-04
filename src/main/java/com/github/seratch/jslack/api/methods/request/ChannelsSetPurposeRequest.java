package com.github.seratch.jslack.api.methods.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChannelsSetPurposeRequest {

    private String token;
    private String channel;
    private String purpose;
}
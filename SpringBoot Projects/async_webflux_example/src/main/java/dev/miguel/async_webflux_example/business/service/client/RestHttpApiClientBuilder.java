package dev.miguel.async_webflux_example.business.service.client;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RestHttpApiClientBuilder {

    @Value("${service.client.base-url}")
    private String apiUrl;

    public RestHttpApiClient buildRestHttpApiClient() {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logLevel(Logger.Level.FULL)
                .target(RestHttpApiClient.class, apiUrl);
    }
}

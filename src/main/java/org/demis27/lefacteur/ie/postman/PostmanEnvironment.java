package org.demis27.lefacteur.ie.postman;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@Jacksonized
public record PostmanEnvironment (UUID id, String name, List<Value> values) {

    @Builder(toBuilder = true)
    @Jacksonized
    public static record Value (String key, String value) {
    }
}

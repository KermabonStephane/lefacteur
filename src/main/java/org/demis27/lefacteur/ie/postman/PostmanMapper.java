package org.demis27.lefacteur.ie.postman;

import org.demis27.lefacteur.environment.Environment;

import java.util.UUID;

public class PostmanMapper {

    private PostmanMapper() {}

    public static Environment toEnvironment(PostmanEnvironment postmanEnvironment) {
        return Environment.builder()
                .id(UUID.randomUUID())
                .name(postmanEnvironment.name())
                .elements(postmanEnvironment.values().stream().map(PostmanMapper::toEnvironmetElement).toList())
                .build();
    }

    private static Environment.Element toEnvironmetElement(PostmanEnvironment.Value value) {
        return Environment.Element.builder()
                .key(value.key())
                .value(value.value())
                .build();
    }
}

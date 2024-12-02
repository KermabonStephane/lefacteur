package org.demis27.lefacteur.environment;

import lombok.Builder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder(toBuilder = true)
public record Environment(
        UUID id,
        String name,
        List<Element> elements) {

    public Optional<Environment.Element> getElement(String key) {
        return elements.stream().filter(element -> element.key.equals(key)).findFirst();
    }

    @Builder(toBuilder = true)
    public static record Element(
            String key,
            String value) {
    }
}

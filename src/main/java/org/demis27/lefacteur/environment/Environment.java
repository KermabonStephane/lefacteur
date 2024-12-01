package org.demis27.lefacteur.environment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Getter
@Setter
@Builder(toBuilder = true)
public class Environment {

    private UUID id;

    private String name;

    private List<Element> elements;

    public Optional<Environment.Element> getElement(String key) {
        return elements.stream().filter(element -> element.key.equals(key)).findFirst();
    }

    @Getter
    @Setter
    @Builder(toBuilder = true)
    public static class Element {

        private String key;

        private String value;

    }
}

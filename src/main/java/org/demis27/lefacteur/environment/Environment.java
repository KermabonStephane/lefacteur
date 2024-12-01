package org.demis27.lefacteur.environment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder(toBuilder = true)
public class Environment {

    private UUID id;

    private String name;

    private List<Element> elements;

    @Getter
    @Setter
    @Builder(toBuilder = true)
    public static class Element {

        private String key;

        private String value;

    }
}

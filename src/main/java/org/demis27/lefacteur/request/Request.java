package org.demis27.lefacteur.request;

import java.util.UUID;

public record Request(
        UUID id,
        String name
) {
}

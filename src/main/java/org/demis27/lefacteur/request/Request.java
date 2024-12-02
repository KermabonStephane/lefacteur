package org.demis27.lefacteur.request;

import lombok.Builder;

import java.util.UUID;

@Builder(toBuilder = true)
public record Request(
        UUID id,
        String name,
        RequestMethod method,
        String url,
        Header header
) {
}

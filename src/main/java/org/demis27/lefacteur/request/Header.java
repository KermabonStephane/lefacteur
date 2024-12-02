package org.demis27.lefacteur.request;

import lombok.Builder;

@Builder(toBuilder = true)
public record Header(String key, String value, String description) {
}

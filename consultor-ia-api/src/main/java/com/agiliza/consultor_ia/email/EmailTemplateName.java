package com.agiliza.consultor_ia.email;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmailTemplateName {

    ACTIVATION_ACCOUNT("activation-account");

    private final String templateName;
}

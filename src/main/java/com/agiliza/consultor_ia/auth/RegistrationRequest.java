package com.agiliza.consultor_ia.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Primeiro nome não pode ser vazio")
    @Size(min = 2, max = 50, message = "Primeiro nome deve ter entre 2 e 50 caracteres")
    private String firstName;

    @NotEmpty(message = "Sobrenome não pode ser vazio")
    @Size(min = 2, max = 50, message = "Sobrenome deve ter entre 2 e 50 caracteres")
    private String lastName;

    @Email(message = "Email inválido")
    @NotEmpty(message = "Email não pode ser vazio")
    private String email;

    @NotEmpty(message = "Senha não pode ser vazia")
    @Size(min = 6, message = "Senha deve ter mais de 6 caracteres")
    private String password;
}

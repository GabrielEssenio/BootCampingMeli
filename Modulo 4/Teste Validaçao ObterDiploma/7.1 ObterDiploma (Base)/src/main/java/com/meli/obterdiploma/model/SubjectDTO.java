package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotBlank(message = "O campo nome nao pode estar vazio")
    @Size(message = "O tamanho maximo de caracteres é 30" , max = 30)
    @Pattern(message = "O nome tem que começar com a primeira letra minuscula", regexp = "[a-zà-ù][A-z À-ù]*")
    String name;

    @NotNull(message = "O campo de score nao pode estar vazio")
    @Min(message = "O valor minimo é 0", value = 0)
    @Max(message = "O valor maximo é 10", value = 10)
    Double score;
}

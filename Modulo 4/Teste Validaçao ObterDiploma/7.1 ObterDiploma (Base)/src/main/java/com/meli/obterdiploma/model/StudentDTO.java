package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotBlank(message = "Nao e permitido nome do estudante em branco")
    @Pattern(message = "A primeira letra do nome precisa ser maiuscula", regexp = "[A-ZÀ-Ú][A-z À-ú]*" )
    @Size(message = "O tamanho do nome nao pode ter mais do que 50 caracteres", max = 50)
    String studentName;


    String message;
    Double averageScore;

    @Valid
    @NotEmpty(message = "A lista de subjects nao pode estar vazia")
    List<SubjectDTO> subjects;
}

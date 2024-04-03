package br.com.devsouto.dev_heaven.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class VerifyIfHasCertificationDTO {

    private String email;

    private String technology;
}

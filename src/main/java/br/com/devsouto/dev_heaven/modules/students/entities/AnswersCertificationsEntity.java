package br.com.devsouto.dev_heaven.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertificationsEntity {
    private UUID id;
    private UUID certificationId;
    private UUID studentiId;
    private UUID questionId;
    private UUID answerId;
    private Boolean isCorrect;
}

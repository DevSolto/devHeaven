package br.com.devsouto.dev_heaven.modules.students.controllers;

import br.com.devsouto.dev_heaven.modules.students.dto.VerifyIfHasCertificationDTO;
import br.com.devsouto.dev_heaven.modules.students.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    @GetMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO){
        if(this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO)){
            return "Usuario não pode fazer a prova";
        }
        return "Usuario pode fazer a prova";
    }
}

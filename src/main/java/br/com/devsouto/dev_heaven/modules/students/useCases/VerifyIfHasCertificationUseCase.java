package br.com.devsouto.dev_heaven.modules.students.useCases;

import br.com.devsouto.dev_heaven.modules.students.dto.VerifyIfHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
    public boolean execute(VerifyIfHasCertificationDTO dto){
        if (dto.getEmail().equals("santiago@example.com") && dto.getTechnology().equals("Java")){
            return true;
        }
        return false;
    }
}

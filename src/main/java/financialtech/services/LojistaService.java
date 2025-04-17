package financialtech.services;


import financialtech.entities.Lojista;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LojistaService {

    private List<Lojista> lojistas = new ArrayList<>();

    public Lojista createLojista(Lojista lojista) {
        for(Lojista l : lojistas) {
            if(l.getEmail().equalsIgnoreCase(lojista.getEmail())) {
                throw new RuntimeException("Email já cadastrado!");
            }
        }

        for(Lojista l : lojistas) {
            if(l.getCnpj().equals(lojista.getCnpj())){
                throw new RuntimeException("CNPJ já existe");
            }
        }
        lojistas.add(lojista);
        return lojista;
    }
}

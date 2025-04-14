package Services;

import Usuarios.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();
    public Cliente createCliente(Cliente cliente) {

        for(Cliente c : clientes) {
            if(c.getEmail().equalsIgnoreCase(cliente.getEmail())) {
                throw new RuntimeException("E-mail já cadastrado!");
            }
        }

        for(Cliente c : clientes) {
            if(c.getCpf().equals(cliente.getCpf())) {
                throw new RuntimeException("CPF já cadastrado!");
            }
        }
        clientes.add(cliente);
        return cliente;
    }
}

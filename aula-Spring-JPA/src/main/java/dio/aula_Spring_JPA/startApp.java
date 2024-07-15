package dio.aula_Spring_JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.aula_Spring_JPA.model.User;
import dio.aula_Spring_JPA.repository.UserRepository;

@Component
public class startApp implements CommandLineRunner {

    @Autowired
    private UserRepository Repositorio;

    @Override
    public void run(String... args) throws Exception {

        User usuario = new User();
        usuario.setNome("Ronaldo");
        usuario.setPassword("W@schensh1ky");
        usuario.setUsername("RonaldoGameplays");


        Repositorio.save(usuario);

        for(User a : Repositorio.findAll()){
            System.out.println(a);
        }
       
       
    }

}

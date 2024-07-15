package dio.aula_Spring_JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula_Spring_JPA.model.User;



//JpaRepository<Classe e está sendo referenciada,Tipo do Id>
//JpaRepository classe no qual possui os metodos de inserção, de listagem e varias outras funcionalidades
public interface UserRepository extends JpaRepository<User,Integer>{

}

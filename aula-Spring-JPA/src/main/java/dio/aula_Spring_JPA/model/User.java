package dio.aula_Spring_JPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//indicar ao jpa que isto é uma entidade
@Entity
@Table(name = "Usuarios")
public class User {

    //faz o auto incremento do Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_User")
    private Integer id;
    @Column(name = "Nome",length = 50,nullable = false )
    private String nome;
    @Column(length = 20,nullable = false,unique = true)
    private String username;
    @Column(length = 100,nullable = false)
    private String password;

    public String getNome() {
        return nome;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
       
        return "User{"+
                "id" + id + '\'' + 
                ", name = " + nome + '\'' +
                ", Username = " + username + '\''+
                ", Password = " + password + '\''+
                '}';
    }


}

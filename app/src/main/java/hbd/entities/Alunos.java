package hbd.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "alunos")
public class Alunos {

    @Id
    @GeneratedValue //nao lembro se precisa disso aq pq eu troquei para UUID
    @Column(name = "aluno_id")
    private UUID id;

    @Column(name = "nome_aluno", length = 100)
    private String nome;

    @Column(name = "data_nascimento")
    private Date Date;

    @Column(name = "cidade_natal", length = 50)
    private String cidadeNatal;

    public Alunos(String nome, Date date, String cidadeNatal) {
        this.nome = nome;
        Date = date;
        this.cidadeNatal = cidadeNatal;
    }
    public Alunos() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

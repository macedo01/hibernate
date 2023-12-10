package hbd.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tbl_alunos")
public class Alunos {

    @Id
    @GeneratedValue //nao lembro se precisa disso aq pq eu troquei para UUID
    @Column(name = "aluno_id")
    private UUID id;

    @Column(name = "aluno_nome", length = 100)
    private String nome;

    @Column(name = "aluno_data_nascimento")
    private Date Date;

    @Column(name = "aluno_cidade_natal", length = 50)
    private String cidadeNatal;

    public Alunos(String nome, Date date, String cidadeNatal) {
        this.nome = nome;
        Date = date;
        this.cidadeNatal = cidadeNatal;
    }
}

package hbd.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "disciplinas")
public class Disciplinas {

    @Id
    @GeneratedValue //nao lembro se precisa disso aq pq eu troquei para UUID
    @Column(name = "id_disciplina")
    private UUID id;

    @Column(name = "nome_disciplina", length = 100)
    private String nome;
}

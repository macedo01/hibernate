package hbd.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
@Table(name = "disciplinas")
public class Disciplinas {

    @Id
    @GeneratedValue //nao lembro se precisa disso aq pq eu troquei para UUID
    @Column(name = "disciplina_id")
    private UUID id;

    @Column(name = "disciplina_nome", length = 100)
    private String nome;
}

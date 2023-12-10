package hbd.entities;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "matriculas")
public class Matriculas {

    @Id
    @GeneratedValue //nao lembro se precisa disso aq pq eu troquei para UUID
    @Column(name = "matricula_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Alunos aluno;

    @ManyToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplinas disciplina;

    @Column(name = "disciplina_data_matricula")
    private String Date;
}

package hbd.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public class Matriculas {

    @Id
    @GeneratedValue //nao lembro se precisa disso aq pq eu troquei para UUID
    @Column(name = "matricula_id")
    private UUID id;

    private UUID idAluno;
    private UUID idDisciplina;
    @Column(name = "disciplina_data_matricula")
    private String Date;
}

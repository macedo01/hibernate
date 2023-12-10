package hbd;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hbd.entities.Alunos;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.w3c.dom.events.Event;


public class App {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Alunos.class)
                    .buildMetadata()
                    .buildSessionFactory();
            sessionFactory.inTransaction(session -> {
                session.persist(new Alunos("Matheus Barreto", new Date(), "Salvador"));
            });
//            UPDATE
            sessionFactory.inTransaction(
                    session -> {
                        Alunos aluno = session.createQuery("from Alunos", Alunos.class ).setMaxResults(1).getSingleResult();
                        aluno.setNome("Jose");
                        session.merge(aluno);
                    }
            );
            sessionFactory.inTransaction(
                    session -> {
                        List<Object[]> alunos = session.createQuery("SELECT nome, Date from Alunos ", Object[].class).getResultList();
                        for ( Object[] alunoObj : alunos ){
                            System.out.println("Nome:" + alunoObj[0]+ ", data de nascimneto: " + alunoObj[1]);
                        }

                    }
            );

        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
            e.printStackTrace();
        }
        System.out.println("Fim!");
    }
}

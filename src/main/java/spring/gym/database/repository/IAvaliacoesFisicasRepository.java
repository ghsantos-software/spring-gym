package spring.gym.database.repository;

import spring.gym.database.model.AvaliacaoesFisicasEntity;
import spring.gym.dto.AvaliacoesFisicasProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;

public interface IAvaliacoesFisicasRepository
        extends JpaRepository<AvaliacaoesFisicasEntity, Integer> {

    @NativeQuery(value = """
        SELECT a.id AS "idAluno",
               a.nome AS "nomeAluno",
               af.id AS "idAvaliacao",
               af.peso AS "peso",
               af.altura AS "altura",
               af.percentual_gordura_corporal AS "percentualGorduraCorporal"
        FROM avaliacoes_fisicas af
        INNER JOIN alunos a
            ON a.avaliacao_fisica_id = af.id
        """)
    List<AvaliacoesFisicasProjection> getAllAvaliacoes();

    @NativeQuery(
            value = """
            SELECT a.id AS "idAluno",
                   a.nome AS "nomeAluno",
                   af.id AS "idAvaliacao",
                   af.peso AS "peso",
                   af.altura AS "altura",
                   af.percentual_gordura_corporal AS "percentualGorduraCorporal"
            FROM avaliacoes_fisicas af
            INNER JOIN alunos a
                ON a.avaliacao_fisica_id = af.id
            """,
            countQuery = """
            SELECT COUNT(*)
            FROM avaliacoes_fisicas af
            INNER JOIN alunos a
                ON a.avaliacao_fisica_id = af.id
            """
    )
    Page<AvaliacoesFisicasProjection> getAllAvaliacoesPageable(
            Pageable pageable
    );
}

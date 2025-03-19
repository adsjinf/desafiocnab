package spring.boot.desafio.cnab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.boot.desafio.cnab.model.Transacao;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    // Método para buscar as transações do tipo 'FINANCIAMENTO'
    @Query("SELECT t FROM Transacao t WHERE t.tipo = :tipo")
    List<Transacao> findByTipo(@Param("tipo") String tipo);
}

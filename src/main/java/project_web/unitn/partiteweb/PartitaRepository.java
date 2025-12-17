package project_web.unitn.partiteweb;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartitaRepository {
    private final JdbcTemplate jdbcTemplate;

    public PartitaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void storePartita(Partita partita) {
        String sql = "INSERT INTO Partite VALUES (DEFAULT, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, partita.getSquadraCasa().getId(), partita.getSquadraTrasferta().getId(), partita.getGolCasa(), partita.getGolTrasferta());
    }

    public List<Partita> getPartite() {
        String sql = "SELECT *, sc.nome AS casa_nome, sc.citta AS casa_citta, " +
                "st.nome AS trasferta_nome, st.citta AS trasferta_citta " +
                "FROM Partite " +
                "JOIN Squadre sc ON p.squadra_casa_id = sc.id " +
                "JOIN Squadre st ON p.squadra_trasferta_id = st.id";
        return jdbcTemplate.query(sql, new PartitaRowMapper());
    }
}

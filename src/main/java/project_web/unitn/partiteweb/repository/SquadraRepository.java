package project_web.unitn.partiteweb.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project_web.unitn.partiteweb.model.Squadra;

import java.util.List;

@Repository
public class SquadraRepository {
    private final JdbcTemplate jdbcTemplate;

    public SquadraRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Squadra> getSquadre() {
        String sql = "SELECT * FROM Squadre";
        return jdbcTemplate.query(sql, new SquadraRowMapper());
    }
}

package project_web.unitn.partiteweb;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

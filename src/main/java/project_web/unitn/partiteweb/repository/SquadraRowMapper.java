package project_web.unitn.partiteweb.repository;

import org.springframework.jdbc.core.RowMapper;
import project_web.unitn.partiteweb.model.Squadra;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SquadraRowMapper implements RowMapper<Squadra> {
    public Squadra mapRow(ResultSet r, int i) throws SQLException {
        return new Squadra(r.getInt("id"), r.getString("nome"), r.getString("citta"));
    }
}

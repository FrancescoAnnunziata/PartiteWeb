package project_web.unitn.partiteweb;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SquadraRowMapper implements RowMapper<Squadra> {
    public Squadra mapRow(ResultSet r, int i) throws SQLException {
        Squadra s = new Squadra();

        //Setto l'ID
        s.setId(r.getInt("id"));
        //Setto il nome
        s.setNome(r.getString("nome"));
        //Setto la città
        s.setCitta(r.getString("citta"));

        return s;
    }
}

package project_web.unitn.partiteweb;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PartitaRowMapper implements RowMapper<Partita> {
    public Partita mapRow(ResultSet r, int i) throws SQLException {
        Partita p = new Partita();

        //Setto l'ID
        p.setId(r.getInt("id"));

        //Costruisco l'oggetto della squadra di casa (tabelle joinate)
        Squadra squadraCasa = new Squadra();
        squadraCasa.setId(r.getInt("squadra_casa_id"));
        squadraCasa.setNome(r.getString("casa_nome"));
        squadraCasa.setCitta(r.getString("casa_citta"));
        p.setSquadraCasa(squadraCasa);

        //Costruisco l'oggetto della squadra in trasferta (tabelle joinate)
        Squadra squadraTrasferta = new Squadra();
        squadraTrasferta.setId(r.getInt("squadra_trasferta_id"));
        squadraTrasferta.setNome(r.getString("trasferta_nome"));
        squadraTrasferta.setCitta(r.getString("trasferta_citta"));
        p.setSquadraTrasferta(squadraTrasferta);

        //Setto il risultato
        p.setGolCasa(r.getInt("gol_casa"));
        p.setGolTrasferta(r.getInt("gol_trasferta"));

        return p;
    }
}

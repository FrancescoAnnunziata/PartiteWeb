package project_web.unitn.partiteweb;

import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CalendarService {

    private final SquadraRepository sr;
    private List<Partita> calendario;

    public CalendarService(SquadraRepository sr) {
        this.sr = sr;
        this.calendario = generateCalendar();
    }

    private List<Partita> generateCalendar() {
        List<Squadra> squadre = new ArrayList<>(sr.getSquadre());
        List<Partita> partite = new ArrayList<>();
        int numSquadre = squadre.size();
        int numGiornate = numSquadre - 1;

        for(int giornata = 1; giornata <= numGiornate; giornata++) {
            for(int i = 0; i < numSquadre / 2; i++) {
                Squadra casa = squadre.get(i);
                Squadra trasferta = squadre.get(numSquadre - 1 - i);

                Partita partita = new Partita();
                partita.setGiornata(giornata);
                partita.setSquadraCasa(casa);
                partita.setSquadraTrasferta(trasferta);
                partite.add(partita);
            }
            squadre.add(1, squadre.remove(numSquadre - 1));
        }

        int numPartiteAndata = partite.size();
        for (int i = 0; i < numPartiteAndata; i++) {
            Partita partitaAndata = partite.get(i);
            Partita partitaRitorno = new Partita();
            partitaRitorno.setGiornata(partitaAndata.getGiornata() + numGiornate);
            partitaRitorno.setSquadraCasa(partitaAndata.getSquadraTrasferta());
            partitaRitorno.setSquadraTrasferta(partitaAndata.getSquadraCasa());
            partite.add(partitaRitorno);
        }

        return partite;
    }

    public List<Partita> getCalendario() {
        return calendario;
    }

    public List<Partita> getTodayMatch(int giornata) {
        List<Partita> partite = new ArrayList<>();
        for(Partita p : calendario) {
            if(p.getGiornata() == giornata) {
                partite.add(p);
            }
        }
        return partite;
    }

    public List<Partita> getTodayResults(int giornata) {
        List<Partita> partite = getTodayMatch(giornata);
        Random r = new Random();

        for(Partita p : partite) {
            p.setGolCasa(r.nextInt(20));
            p.setGolTrasferta(r.nextInt(20));
        }
        return partite;
    }
}

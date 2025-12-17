package project_web.unitn.partiteweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Servizio che fornisce il calendario delle partite di Campionato

@Service
public class CalendarService {

    private final SquadraRepository sr;
    private final PartitaRepository pr;
    private List<Partita> calendario;

    public CalendarService(SquadraRepository sr, PartitaRepository pr) {
        this.sr = sr;
        this.pr = pr;
        this.calendario = generateCalendar();
    }

    public List<Partita> generateCalendar() {
        List<Squadra> squadre = sr.getSquadre();
        List<Partita> partite = new ArrayList<>();
        int giornata;

        for(Squadra casa : squadre) {
            giornata = 1;
            for(Squadra trasferta : squadre) {
                if(!casa.equals(trasferta)) {
                    Partita partita = new Partita();
                    partita.setGiornata(giornata);
                    partita.setSquadraCasa(casa);
                    partita.setSquadraTrasferta(trasferta);
                    partite.add(partita);
                    giornata +=1;
               }
           }
        }

        return partite;
    }

    public List<Partita> getCalendario() {
        return calendario;
    }
}

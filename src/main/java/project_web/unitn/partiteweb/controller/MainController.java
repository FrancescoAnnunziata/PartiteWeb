package project_web.unitn.partiteweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project_web.unitn.partiteweb.model.Partita;
import project_web.unitn.partiteweb.service.CalendarService;

import java.util.List;

/*
TODO:
    - Calendario partite campionato
    - Partite giornata corrente
    - Risultati partite giornata corrente
 */
@RestController
public class MainController {

    private final CalendarService calendarService;

    public MainController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping("/calendar")
    public List<Partita> getCalendar() {
        return calendarService.getCalendario();
    }

    @GetMapping("/today_matches")
    public List<Partita> getTodayMatches(@RequestParam int giornata) {
        return calendarService.getTodayMatch(giornata);
    }

    @GetMapping("/today_results")
    public List<Partita> getTodayResults(@RequestParam int giornata) {
        return calendarService.getTodayResults(giornata);
    }

}

package project_web.unitn.partiteweb;

public class Partita {
    private int id;
    private int giornata;
    private Squadra squadraCasa;
    private Squadra squadraTrasferta;
    //Li metto Integer così posso renderli nulli finchè la partita non viene giocata, in modo da differenziarli da un pareggio 0-0
    private Integer golCasa;
    private Integer golTrasferta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGiornata() {
        return giornata;
    }

    public void setGiornata(int giornata) {
        this.giornata = giornata;
    }

    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(Squadra squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public Squadra getSquadraTrasferta() {
        return squadraTrasferta;
    }

    public void setSquadraTrasferta(Squadra squadraTrasferta) {
        this.squadraTrasferta = squadraTrasferta;
    }

    public Integer getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(Integer golCasa) {
        this.golCasa = golCasa;
    }

    public Integer getGolTrasferta() {
        return golTrasferta;
    }

    public void setGolTrasferta(Integer golTrasferta) {
        this.golTrasferta = golTrasferta;
    }
}

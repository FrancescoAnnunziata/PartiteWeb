package project_web.unitn.partiteweb.model;

public class Partita {
    private int giornata;
    private Squadra squadraCasa;
    private Squadra squadraTrasferta;
    //Li metto Integer così posso renderli nulli finchè la partita non viene giocata, in modo da differenziarli da un pareggio 0-0
    private Integer golCasa;
    private Integer golTrasferta;

    public Partita(int giornata, Squadra squadraCasa, Squadra squadraTrasferta) {
        this.giornata = giornata;
        this.squadraCasa = squadraCasa;
        this.squadraTrasferta = squadraTrasferta;
        this.golCasa = null;
        this.golTrasferta = null;
    }

    public int getGiornata() {
        return giornata;
    }
    public Squadra getSquadraCasa() {
        return squadraCasa;
    }
    public Squadra getSquadraTrasferta() {
        return squadraTrasferta;
    }
    public Integer getGolCasa() {
        return golCasa;
    }
    public Integer getGolTrasferta() {
        return golTrasferta;
    }

    public void setGolCasa(Integer golCasa) {
        this.golCasa = golCasa;
    }
    public void setGolTrasferta(Integer golTrasferta) {
        this.golTrasferta = golTrasferta;
    }
}

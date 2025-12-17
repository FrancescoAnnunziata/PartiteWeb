package project_web.unitn.partiteweb;

public class Partita {
    private int id;
    private Squadra squadraCasa;
    private Squadra squadraTrasferta;
    private int golCasa;
    private int golTrasferta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolTrasferta() {
        return golTrasferta;
    }

    public void setGolTrasferta(int golTrasferta) {
        this.golTrasferta = golTrasferta;
    }
}

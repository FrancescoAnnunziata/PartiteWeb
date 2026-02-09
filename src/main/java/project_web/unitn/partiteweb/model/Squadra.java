package project_web.unitn.partiteweb.model;

//TODO: L'elenco delle squadre sono registrate in-memory, capire se è ok

public class Squadra {
    private final int id;
    private final String nome;
    private final String citta;
    private final Sport sport;

    public Squadra(int id, String nome, String citta) {
        this.id = id;
        this.nome = nome;
        this.citta = citta;
        this.sport = Sport.Pallanuoto;
    }

    public String getNome() {
        return nome;
    }
    public String getCitta() {
        return citta;
    }
    public Sport getSport() {
        return sport;
    }
}

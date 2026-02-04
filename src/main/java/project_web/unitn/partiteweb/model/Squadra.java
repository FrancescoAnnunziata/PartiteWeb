package project_web.unitn.partiteweb.model;

//TODO: L'elenco delle squadre sono registrate in-memory, capire se è ok

public class Squadra {
    private final int id;
    private final String nome;
    private final String citta;

    public Squadra(int id, String nome, String citta) {
        this.id = id;
        this.nome = nome;
        this.citta = citta;
    }

    public String getNome() {
        return nome;
    }
    public String getCitta() {
        return citta;
    }
}

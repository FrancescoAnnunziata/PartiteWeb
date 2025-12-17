DROP TABLE IF EXISTS Partite;
DROP TABLE IF EXISTS Squadre;

CREATE TABLE IF NOT EXISTS Squadre (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    citta VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Partite (
    id INT PRIMARY KEY AUTO_INCREMENT,
    squadra_casa_id INT NOT NULL,
    squadra_trasferta_id INT NOT NULL,
    gol_casa INT DEFAULT 0,
    gol_trasferta INT DEFAULT 0,
    FOREIGN KEY (squadra_casa_id) REFERENCES Squadre(id),
    FOREIGN KEY (squadra_trasferta_id) REFERENCES Squadre(id)
);
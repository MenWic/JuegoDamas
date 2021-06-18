package src.players;

public class Jugador {
    private String name;
    private int score;
    private int champion;
    private int loser;

    public Jugador(String name,int score,int champion,int loser){
        this.name=name;
        this.score=score;
        this.champion=champion;
        this.loser=loser;
    }

    //Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getChampion() {
        return champion;
    }
    public void setChampion(int champion) {
        this.champion = champion;
    }

    public int getLoser() {
        return loser;
    }
    public void setLoser(int loser) {
        this.loser = loser;
    }

    //Metodo para imprimir info del jugador
    public String getInformacion(){
        return "Nombre: "+name+". Puntuacion: "+score+". Partidas Ganadas: "+champion+". Partidas Perdidas: "+loser;
    }
    
}

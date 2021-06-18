package src.tableboard;

public class Ficha {
    //Variables globales de clase
    private String ficha1;
    private String ficha2;
    private Tablero tablero;
    private String lettWhite; //
    private String lettReset;
    private String lettRed;
    
    public Ficha(Tablero tablero){
        //Variables locales del constructor
        ficha1=" Q ";
        ficha2=" O ";
        lettWhite = "\u001B[37m";
        lettRed = "\u001B[31m";
        lettReset ="\u001B[0m";
        this.tablero=tablero;
    }

    //Getters y Setters
    public Tablero getTablero(){
        return tablero;
    }
    public void setTablero(Tablero tablero){
        this.tablero=tablero;
    }

    //Metodo para asignar fichas a lugares correspondientes
    public void addFichaEnTablero(){
        for(int i=1;i<4;i++){
            for(int j=1;j<9;j++){
                if((i%2)!=0 && (j%2)==0){
                    this.tablero.getTablero()[i][j]=lettWhite+ficha1+lettReset;
                }
                if((i%2)==0 && (j%2)!=0){
                    this.tablero.getTablero()[i][j]=lettWhite+ficha1+lettReset;
                }
            }
        }
        for(int i=6;i<9;i++){
            for(int j=1;j<9;j++){
                if((i%2)==0 && (j%2)!=0){
                    this.tablero.getTablero()[i][j]=lettRed+ficha2+lettReset;
                }
                if((i%2)!=0 && (j%2)==0){
                    this.tablero.getTablero()[i][j]=lettRed+ficha2+lettReset;
                }
            }
        }
        System.out.println("\n\n");
        this.tablero.imprimirTablero(); //Imprime tablero ya seteado con las fichas en el
    }
}

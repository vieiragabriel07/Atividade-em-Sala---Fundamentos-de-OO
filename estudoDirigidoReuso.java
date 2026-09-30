/*
 Estou tendo muita dificuldade ainda de criar um contexto e entender o objetivo do que estou
tentando realmente fazer.
 Estou achando muito dificil entender também da onde puxar cada coisa, e algo que é bem
confuso no java é essa repeticao que fica acontecendo por exemplo nos variaveis.
*/



public class estudoDirigidoReuso {

public static void main(String[] args){

    Jogador Gabriel = 
        new Jogador(1);
        Gabriel.nome = "AK47";

    Jogador Daniel = 
        new Jogador(0);
        Daniel.nome = "M4A4";

}

}

class Jogador{
    
    String nome;
    Boolean tipoDeArma;
    
    public Jogador(Boolean tipoDeArma){
        this.tipoDeArma = tipoDeArma;
    }
}

class Terrorista extends Jogador{

    public Terrorista(Boolean tipoDeArma){
        super(tipoDeArma);
    }
}

class Contraterrorista extends Jogador{

public Contraterrorista(Boolean tipoDeArma){
        super(tipoDeArma);
    }
}



/*
 * Plano
 * Dominio: Cafeteria e Cafes
 * Classes e atributos:
 * -GraoCafe: nome (String), precoPorKg (double)
 * -PacoteCafe: grao (GraoCafe), pesoGramas (int)
 * Validacoes pretendidas:
 * -GraoCafe: precoPorKg deve ser positivo(> 0); nome nao pode ser vazio.
 * -PacoteCafe: pesoGramas deve estar entre 100g e 1000g.
 * Uso da Ia: Usar para ajudar na criação da sintaxe do codigo e no manejo
 * passo a passo do que deve ser feito.
 */
class GraoCafe{
    private String nome = "";
    private double precoPorKg = 0.0;

    public GraoCafe(String nome, double precoPorKg){
        setNome(nome);
        setPrecoPorKg(precoPorKg);
    }

    public String getNome(){
        return nome;
    }

    public double getPrecoPorKg(){
        return precoPorKg;
    }

    public void setNome(String n){
        if(n != null && !n.isEmpty()){
            nome = n;
        } else{
            System.out.println("Nome Invalido");
        }
    }

    public void setPrecoPorKg(double preco){
        if(preco > 0){
            precoPorKg = preco;
        } else{
            System.out.println("Preco Invalido: " + preco);
        }
    }
}

class PacoteCafe{
    private GraoCafe grao;
    private int pesoGramas = 250;
    
    public PacoteCafe(GraoCafe grao, int pesoGramas){
        setGrao(grao);
        setPesoGramas(pesoGramas);
    }

    public PacoteCafe(GraoCafe grao){
        this(grao, 250);
    }

    public GraoCafe getGrao(){
        return grao;
    }

    public int getPesoGramas(){
        return pesoGramas;
    }

    public void setGrao(GraoCafe g){
        if(g != null){
            grao = g;
        } else{
            System.out.println("Grao Invalido");
        }
    }

    public void setPesoGramas(int peso){
        if(peso >= 100 && peso <= 1000){
            pesoGramas = peso;
        } else{
            System.out.println("Peso Invalido" + peso + "g (deve ser entre 100g e 1000g");
        }
    }

    public double calcularPreco(){
        if(grao == null) return 0.0;
        return (grao.getPrecoPorKg() / 1000.0) * pesoGramas;
    }
    
    public String ficha(){
        String nomeGrao = (grao != null) ? grao.getNome() : "Sem grao";
        return "Pacote: " + nomeGrao + "(" + pesoGramas + "g) - R$" + String.format("%.2f", calcularPreco());
    }
}

public class atividadeAssincrona{
    public static void main(String[] args){
        System.out.println("Construtor Completo");
        GraoCafe bourbon = new GraoCafe("Bourbon Amarelo", 80.0);
        PacoteCafe pacote1 = new PacoteCafe(bourbon, 500);
        System.out.println(pacote1.ficha());
        System.out.println();

        System.out.println("Sobrecarga (Padrao 250g)");
        GraoCafe catuai = new GraoCafe("Catuai", 60.0);
        PacoteCafe pacote2 = new PacoteCafe(catuai);
        System.out.println(pacote2.ficha());
        System.out.println();

        System.out.println("Teste de Validacao");
        // preco negativo
        bourbon.setPrecoPorKg(-15.0);

        // nome vazio
        bourbon.setNome("");

        // peso fora da faixa, como 50g
        pacote2.setPesoGramas(50);
        System.out.println();

        System.out.println("Estado apos tentativos invalidas");
        System.out.println(pacote1.ficha());
        System.out.println(pacote2.ficha());
    }
}
/*
 * Passo 3: Autoavaliacao
 * -Criterios atingidos: Todos (duas classes associadas, atributos private com getters/setters,
 *  validacao nos setters reaproveitada no construtor, sobrecarga de construtor e demonstracao funcional).
 * -Trecho que deu mais trabalho: Nao foi um trecho, mas sim, como cada coisa se conecta, ainda achei
 * bem confuso
 * -Uso de IA: Usei para entender como codar em Java, e acabei achando muito
 * diferente do que C, mas ao mesmo tempo fui percebendo um certo "padrao"
 * nessa linguagem. Tambem pedi para ela me ajudar a idealizar e criar um passo
 * a passo do que eu ir fazendo por vez, e tambem como cada coisa se conecta.
 */

package pokesimulator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LucasSpizzica
 */
public class Pokemon {
    //Atributos ENCAPSULADOS
    private String nome;
    private String tipo ;
    private int levelUser, levelBot;
    private int vida;
    private int ataque;
    private int defesa, escolhaUser, escolhaBot;
    Scanner leitor = new Scanner(System.in);
    Random random = new Random();

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    //MÉTODOS
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void EscolhendoPokemonUser() {
        System.out.println("Seja bem vindo ao simlulador de batalhas pokemons!");
        System.out.println("");
        System.out.println("Escolha seu pokemon para a batalha: "
                + "\n"
                + "---------------------------------------------------"
                + "\n1 - Pikachu"
                + "\n2 - Charmander"
                + "\n3 - Bulbasaur"
                + "\n4 - Gengar"
                + "\n---------------------------------------------------");
        escolhaUser = leitor.nextInt();
    }
public void EscolhendoPokemonBot() {
     
        System.out.println("\nEscolha seu adversário para a batalha:");
        System.out.println(""
                + "\n"
                + "\n"
                + "---------------------------------------------------"
                + "\n1 - Pikachu"
                + "\n2 - Charmander"
                + "\n3 - Bulbasaur"
                + "\n4 - Gengar"
                + "\n---------------------------------------------------");
       escolhaBot = leitor.nextInt();
       
       }
            
            
    
public void EscolhendoLevelUser() {
       
        System.out.println("\nEscolha o level do seu pokemon(somente número): "
                + "\n"
                + "\nLevel 1"
                + "\nLevel 2"
                + "\nLevel 3"
                + "\nLevel 4"
                + "\nLevel 5"
                + "\nLevel 6"
                + "\nLevel 7"
                + "\nLevel 8"
                + "\nLevel 9"
                + "\nLevel 10"
                + "\n---------------------------------------------------");
        levelUser = leitor.nextInt();
        System.out.println("---------------------------------------------------");
    }
public void EscolhendoLevelBot() {
       
        System.out.println("\nEscolha o level do seu pokemon(somente número): "
                + "\n"
                + "\nLevel 1"
                + "\nLevel 2"
                + "\nLevel 3"
                + "\nLevel 4"
                + "\nLevel 5"
                + "\nLevel 6"
                + "\nLevel 7"
                + "\nLevel 8"
                + "\nLevel 9"
                + "\nLevel 10"
                + "\n---------------------------------------------------");
        levelBot = leitor.nextInt();
        
    }
public void DefinindoPokemonUser(){
    switch (escolhaUser) {
        case 1:
            nome = "Pikachu";
            tipo = "Eletrico";
            vida = 285;
            ataque = random.nextInt(50)+50;
            defesa = 40;
            calcularAtributos();
            calculaBonusUser();
            break;
        case 2:
            nome = "Charmander";
            tipo = "Fogo";
            vida = 290;
            ataque = random.nextInt(50)+50;
            defesa = 65;
            calcularAtributos();
            calculaBonusUser();
            break;
        case 3:
            nome = "Bulbasaur";
            tipo = "Agua";
            vida = 260;
            ataque = random.nextInt(50)+50;
            defesa = 60;
            calcularAtributos();
            calculaBonusUser();
            break;
        case 4:
            nome = "Gengar";
            tipo = "Fantasma";
            vida = 250;
            ataque = random.nextInt(50)+50;
            defesa = 75;
            calcularAtributos();
            calculaBonusUser();
            break;    
        default:
            throw new AssertionError();
    }
}
public void DefinindoPokemonBot(){
    switch (escolhaBot) {
        case 1:
            nome = "Pikachu";
            tipo = "Eletrico";
            vida = 285;
            ataque = random.nextInt(50)+50;
            defesa = 40;
            calcularAtributos();   
            calculaBonusBot();
            break;
        case 2:
            nome = "Charmander";
            tipo = "Fogo";
            vida = 290;
            ataque = random.nextInt(50)+50;
            defesa = 65;
            calcularAtributos();

            calculaBonusBot();
            break;
        case 3:
            nome = "Bulbasaur";
            tipo = "Agua";
            vida = 260;
            ataque = random.nextInt(50)+50;
            defesa = 60;
            calcularAtributos();
            calculaBonusBot();
            break;
        case 4:
            nome = "Gengar";
            tipo = "Fantasma";
            vida = 250;
            ataque = random.nextInt(50)+50;
            defesa = 75;
            calcularAtributos();
            calculaBonusBot();
            break;    
        default:
            throw new AssertionError();
    }
}
     
    public void imprimePokemonUser(){
        System.out.println("\n---------------------------------------------------");
        System.out.println("\n\nATRIBUTOS DE PODER do seu POKEMON");
        System.out.println(" Nome: " + nome + " \n " +
                           "Tipo: " + tipo + " \n " +
                           "Level: " + levelUser + " \n " +
                           "Vida: " + vida + " \n " +
                           "Ataque: " + ataque + " \n " +
                           "Defesa: " + defesa + " \n "
        );
        System.out.println("\n\nATRIBUTOS DE PODER do seu POKEMON adversário");
    System.out.println("Nome: " + nome + " \n " +
                           "Tipo: " + tipo + " \n " +
                           "Level: " + levelBot + " \n " +
                           "Vida: " + vida + " \n " +
                           "Ataque: " + ataque + " \n " +
                           "Defesa: " + defesa + " \n "
        );

    
    }
    
    public void calcularAtributos(){
    switch(this.tipo){
        case "Fogo":
            this.vida = vida + 60;
            this.ataque = ataque + 40;
            this.defesa = defesa + 50;
            break;
        case "Agua":
            this.vida = vida + 45;
            this.ataque = ataque + 50;
            this.defesa = defesa + 55;
            break;
        case "Fantasma":
            this.vida = vida + 60;
            this.ataque = ataque + + 25;
            this.defesa = defesa + 60;
            break;
        case "Eletrico":
            this.vida = vida + 50;
            this.ataque = ataque + 75;
            this.defesa = defesa + 35;
            break;
    
    }
    }
    
    
    
    public void calculaBonusUser(){
    vida = vida + (levelUser / 5);
    ataque = ataque + (levelUser/3);
    defesa = defesa + (levelUser/4);
    }
 public void calculaBonusBot(){
    vida = vida + (levelBot / 5);
    ataque = ataque + (levelBot/3);
    defesa = defesa + (levelBot/4);
    
    }
    
 
 }
   
    
 


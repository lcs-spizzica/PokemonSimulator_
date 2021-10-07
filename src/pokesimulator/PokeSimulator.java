package pokesimulator;

import java.util.Scanner;


public class PokeSimulator {
 
    public static void main(String[] args) {
     
        
      Pokemon meuPokemon = new Pokemon();
      Pokemon botPokemon = new Pokemon();
      
      meuPokemon.EscolhendoPokemonUser();
      meuPokemon.EscolhendoLevelUser();
      meuPokemon.DefinindoPokemonUser();
     
      botPokemon.EscolhendoPokemonBot();
      botPokemon.EscolhendoLevelBot();
      botPokemon.DefinindoPokemonBot();
    
      //Pegando vida dos pokemons
      int vidaMeuPokemon = meuPokemon.getVida();
      int vidaPokemonBot = botPokemon.getVida();
      //Pegando ataque dos pokemons
      int ataqueMeuPokemon = meuPokemon.getAtaque();
      int ataquePokemonBot = botPokemon.getAtaque();
      //Pegando defesa pokemom
      int defesaMeuPokemon = meuPokemon.getDefesa();
      int defesaPokemonBot = botPokemon.getDefesa();
      
       //variavel para contar atributos dos pokemons
      int contadorMeuPokemon = 0, contadorPokemonBot =0;
      
        System.out.println("\n---------------------------------------------------"
                + "\nRelátorio de luta: "
                + "\n");
        
        if( vidaMeuPokemon > vidaPokemonBot){
            System.out.println(meuPokemon.getNome() + " venceu no atributo vida!");
            contadorMeuPokemon++;
        } else{
            System.out.println(botPokemon.getNome() + " venceu no atributo vida!");
            contadorPokemonBot++;
        }
     
        if( ataqueMeuPokemon > ataquePokemonBot){
            System.out.println(meuPokemon.getNome() + " venceu no atributo ataque!");
            contadorMeuPokemon++;
        } else{
            System.out.println(botPokemon.getNome() + " venceu no atributo ataque!");
            contadorPokemonBot++;
        }
        
        if( defesaMeuPokemon > defesaPokemonBot){
            System.out.println(meuPokemon.getNome() + " venceu no atributo defesa!");
            contadorMeuPokemon++;
        } else{
            System.out.println(botPokemon.getNome() + " venceu no atributo defesa!");
            contadorPokemonBot++;
        }
         if( contadorMeuPokemon > contadorPokemonBot){
            System.out.println(meuPokemon.getNome() + " venceu essa BATALHA!");
           
        } else{
            System.out.println(botPokemon.getNome() + " venceu essa BATALHA!");
            
        }
        
    }
    
}

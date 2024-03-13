
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FullGame
{
    private WordGuessingGame game;
    private InputReader reader;
    
    public void main (String[] args){
        this.game = new WordGuessingGame();
        this.reader = new InputReader();
        
    }
    
    private void play(){
        char choice;
        do{
            game.play();
            game.reset();
            choice = reader.getChar("Quer continuar a jogar(S/N)");
        }while((""+choice).toUpperCase() != "N");
    }
}


/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator wordGen;
    
    public WordGuessingGame(){
        hiddenWord = "abc";
        numberOfTries = 0;
        reader = new InputReader();
        wordGen = new WordGenerator();
        hiddenWord = wordGen.generateWord();
        initializeGuessedWord();
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    public void showGuessedWord(){
        System.out.println(guessedWord);
    }
    
    public void initializeGuessedWord(){
        guessedWord = "";
        while(guessedWord.length() != hiddenWord.length()){
            guessedWord = guessedWord.concat("_");
        }
    }
    
    public void play(){
        showWelcome();
        while (!guessedWord.equals(hiddenWord)){
            if(guess(reader.getChar("Escreva a letra que pretende adivinhar:"))){
                System.out.println("Letra correta");
            }else
                System.out.println("Letra incorreta");
            showGuessedWord();
            numberOfTries++;
        }
        showResult();
    }
    
    private void showWelcome(){
        System.out.println("-----------------");
        System.out.println("Jogo do Enforcado");
        System.out.println("----Boa Sorte----");
        System.out.println("-----------------");
    }
    
    private boolean guess(char letra){
        char[] guessedWordArray = new char[guessedWord.length()];
        for(int c = 0; c < guessedWordArray.length; c++){
            guessedWordArray[c] = guessedWord.charAt(c);
        }
        int position = -1;
        boolean returnValue = false;
        for(int i = 0; i < hiddenWord.length(); i++){
            if (hiddenWord.charAt(i) == letra){
                position = i;
                for(int b = 0; b < guessedWord.length(); b++){
                    if(guessedWord.charAt(b) != letra){
                        guessedWordArray[i] = letra;
                        returnValue = true;
                    }
                }
            }
            
            if(returnValue){
                guessedWord = new String(guessedWordArray);
            }
        }
        return returnValue;
    }
    
    private void showResult(){
        System.out.println("A palavra foi adivinhada em " + numberOfTries + ".");
    }
}

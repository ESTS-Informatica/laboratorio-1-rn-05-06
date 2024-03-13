
/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;
import java.util.Random;
public class WordGenerator
{
    private ArrayList<String> words;
    private Random rand;
    public WordGenerator(){
        words = new ArrayList();
        rand = new Random();
        fillArrayList();
    }
    
    private void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord(){
        return(words.get(rand.nextInt(words.size())));
    }
    
    public void addWord(String word){
        if(word != null)
            words.add(word);
    }
}

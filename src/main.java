import java.util.HashMap;
import java.util.Scanner;

public class main {
    Scanner scan = new Scanner(System.in);
    HashMap<Integer, String> userInputSplit = new HashMap<>();


    public static void main(String[] args){

        main m = new main();
        m.goTo();

    }

    public void goTo(){
        String input = scan.next();
        encode(addToArray(input));


    }

    public static String[] addToArray(String userInput){
        String[] array = userInput.split("");
        return array;

    }
    public void encode(String[] userArray){
        for (int i = 0; i < userArray.length; i++){
            if(userArray[i] == userInputSplit.get(userArray[i])){
                
            } else {
                userInputSplit.put(i,userArray[i]);
            }
            System.out.println(userInputSplit);

        }


    }
}

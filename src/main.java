import java.util.HashMap;
import java.util.Scanner;

public class main {
    Scanner scan = new Scanner(System.in);
    HashMap<Integer, String> initialDictionary = new HashMap<>();
    public static int counter = 0;


    public static void main(String[] args){
        main m = new main();
        m.goTo();


    }

    public void goTo(){
        String input = scan.next();
        mainDictionary(setInitialDictionary(addToArray(input)));

    }

    public static String[] addToArray(String userInput){
        String[] array = userInput.split("");
        return array;
    }
    public String[] setInitialDictionary(String[] userArray){

        for (int i = 0; i < userArray.length; i++){
            if (!(initialDictionary.containsValue(userArray[i]))){
                initialDictionary.put(counter, userArray[i]);
                counter += 1;

            }
        }
        System.out.println(initialDictionary);
        return userArray;
    }

    public void mainDictionary(String[] userArray){
        for (int z = 0; z < userArray.length; z++) {
            String userString = userArray[z];
            int counter1 = z;
            while (initialDictionary.containsValue(userString)) {
                System.out.println(userString);
                if (!(counter1 == userArray.length+1)) {
                    userString = userString + userArray[counter1 + 1];
                    counter1 += 1;
                } else {
                    break;
                }
            }
            initialDictionary.put(counter, userString);
        }
    }
}

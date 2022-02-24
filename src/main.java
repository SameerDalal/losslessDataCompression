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

    public void mainDictionary(String[] userArray) {
        for (int z = 0; z < userArray.length-2; z++) {
            String userString = userArray[z];
            int counter1 = z+1;
            while (initialDictionary.containsValue(userString)) {
                userString = userString + userArray[counter1-1];
                System.out.println(userString);
                counter1 += 1;
            }
            initialDictionary.put(counter, userString);
            counter += 1;

        }
        System.out.println(initialDictionary);
    }
}

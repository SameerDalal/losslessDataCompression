import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

public class main {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> initialDictionary = new ArrayList<>();
    HashMap<Integer, String> dictionary = new HashMap<>();
    public static int counter = 0;


    public static void main(String[] args){
        main m = new main();
        m.goTo();


    }

    public void goTo(){
        String input = scan.next();
        mainDictionary(setInitialDictionary(addToArray(input)));
        getEmbeddedOutput();

    }

    public static String[] addToArray(String userInput){
        String[] array = userInput.split("");
        return array;
    }
    public String[] setInitialDictionary(String[] userArray){

        for (int i = 0; i < userArray.length; i++){
            if (!(dictionary.containsValue(userArray[i]))){
                dictionary.put(counter, userArray[i]);
                initialDictionary.add(userArray[i]);
                counter += 1;

            }
        }
        System.out.println(dictionary);
        return userArray;
    }

    public void mainDictionary(String[] userArray) {
        for (int z = 0; z < userArray.length-1; z++) {
            String userString = userArray[z];
            if (!(z >= userArray.length + 1)) {
            int counter1 = z + 1;
            while (dictionary.containsValue(userString)) {
                userString = userString + userArray[counter1];
                System.out.println(userString);
                counter1 += 1;
            }
        }
            dictionary.put(counter, userString);
            counter += 1;

        }
        System.out.println(dictionary);
    }

    public void getEmbeddedOutput(){
        for (int u = dictionary.size() + 1; u < counter; counter++){
            String temporaryString = initialDictionary.get(u);
            String[] splitString  = temporaryString.split("");
            for (int r = splitString.length; r > 0; r--){
                StringJoiner join = new StringJoiner("");
                for (int q = 0; q < r; q++){
                    join.add(splitString[q]);
                }
                String str = join.toString();
                    if (dictionary.containsValue(str)){
                        System.out.println(dictionary.get(str));
                }
            }
        }

    }
}

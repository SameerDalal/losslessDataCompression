import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;


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

    public static ArrayList<String> addToArray(String userInput){
        String[] array = userInput.split("");
        ArrayList<String> list = new ArrayList<>();
        for(int q = 0; q < array.length; q++){
            list.add(array[q]);
        }
        return list;
    }
    public ArrayList<String> setInitialDictionary(ArrayList<String> userArray){

        for (int i = 0; i < userArray.size(); i++){
            if (!(dictionary.containsValue(userArray.get(i)))){
                dictionary.put(counter, userArray.get(i));
                initialDictionary.add(userArray.get(i));
                counter += 1;

            }
        }
        System.out.println(dictionary);
        return userArray;
    }

    public void mainDictionary(ArrayList<String> userArray) {
        for (int z = 0; z < userArray.size()-1; z++) {
            String userString = userArray.get(z);
            int counter1 = z + 1;
                while (dictionary.containsValue(userString)) {
                    if (counter1 != userArray.size()) {
                        userString = userString + userArray.get(counter1);
                        System.out.println(userString);
                        counter1 += 1;

                        String[] array = userString.split("");
                        ArrayList<String> minList = new ArrayList<>();
                        for(int q = 0; q < array.length; q++) {
                            minList.add(array[q]);
                        }
                        if(minList.size() > 2){
                            int subtractBy = minList.size() - 2;
                            z = z+subtractBy;
                        }
            } else {
                        break;
                    }

        }
            dictionary.put(counter, userString);
            counter += 1;

        }
        System.out.println(dictionary);
    }

    public void getEmbeddedOutput() {
        for (int i = 0; i < dictionary.size(); i++) {
            String indexValue = dictionary.get(i);
            String[] entryArray = indexValue.split("");
            ArrayList<String> entryArrayList = new ArrayList<>();
            for (int q = 0; q < entryArray.length; q++) {
                entryArrayList.add(entryArray[q]);
            }
            if (entryArrayList.size() == 1) {
                System.out.println("null1");
            } else {
                String newString = "";
                for (int t = 0; t < entryArrayList.size() - 1; t++) {
                    newString = newString + entryArrayList.get(t);
                }
                System.out.println(newString);
                if (dictionary.containsValue(newString)) {
                    for (Entry<Integer, String> entry : dictionary.entrySet()) {

                        // if give value is equal to value from entry
                        // print the corresponding key
                        if (entry.getValue() == newString) {
                            System.out.println(entry.getKey());
                            break;
                        }
                    }
                }

                // clear entry array list
            }
        }
    }
}

package mthree_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAna {
    public static void GrpAnagram(String[] arr) {
        HashMap<String, List<String>> mymap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            // i want to sort each string, cat and tac =act  act i want to create key for hashmap

            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // calculate hashcode of string
            if (mymap.containsKey(newWord)) {
                mymap.get(newWord).add(word);
            } else {
                // This is the first time it is adding a word for a specific hashcode
                List<String> list = new ArrayList<>();
                list.add(word);
                mymap.put(newWord, list);
            }
        }
        //print all the values where size is > 1, If you want to print non-anagrams, just print the values having size = 1
        for (String s : mymap.keySet()) {
            List<String> values = mymap.get(s);
            if (values.size() > 1) {
                System.out.println(values);
            }
        }
    }

    public static void main(String[] args) {
        String wordArr[]
                = {"cat", "dog", "tac", "god", "act", "CARS", "REPAID", "DUES", "NOSE", "SIGNED", "LANE", "PAIRED", "ARCS"
                , "GRAB", "USED", "ONES", "BRAG", "SUED", "LEAN", "SCAR", "DESIGN", "Barn", "arnB"};

        GrpAnagram(wordArr);
    }
}

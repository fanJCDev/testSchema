package Workwith.Toronto_interview;

import java.util.Vector;

public class StringChallenge {
    public static boolean ThreeNumbers(String str){
        String temp="";
        for (int x = 0; x < str.length(); x++){
            temp += str.charAt(x);
            int count=0;
            if (str.charAt(x) == ' ' || x == str.length()-1){
                for (int y = 0; y < temp.length(); y++){
                    if (temp.charAt(y) >= '0' && temp.charAt(y) <= '9'){
                        count++;
                    }
                    if (count > 3)
                    {
                        //System.out.println("number of digit is grater than 3 in each word");
                        return false;
                    }
                }
                Vector<Character> result = new Vector<Character>();
                for(int i =0;i<temp.length();i++) {
                    result.add(temp.charAt(i));
                }
                int n=result.size();
                for(int i=1;i<n-1;i++) {
                    if (
                            (result.get(i - 1) >= '0' && result.get(i - 1) <= '9') &&
                                    (result.get(i) >= '0' && result.get(i) <= '9')&&
                                    (result.get(i+1) >= '0' && result.get(i+1) <= '9')
                    ) {
                        //int n1=i;
                        //for (int j=n1-1;j<=n1+1;j++) System.out.print(result.get(j));
                        //System.out.println();
                        //System.out.println("adjacency problem");
                        return false;
                    }
                }
                //System.out.println(result);
                temp="";
            }
            //temp="";
        }

        //The 3nd rules follow the priority from left to right , so Loop to iterate over the characters of the string,

        return true;
    }

    public static void main(String[] args) {
        System.out.println(ThreeNumbers("2hell6o3 wor6l3d1") ); // true/*
        System.out.println(ThreeNumbers("hell268o w1or2l4d") ); // false
    }
}


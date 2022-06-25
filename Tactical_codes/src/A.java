import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class A {
    static SortedMap<String, Integer> map1  = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    public static void main(String args[])
    {
        String[] a={"Tucson","Albaney","smith","Westford","berkley"};
        int[] b={102,95,114,1421,50};
        for(int i=0;i<b.length;i++){
            // putting values in the Map
            map1.put(a[i], b[i]);
        }

        // Calling the function to sortbyKey
        //sortbykey();
        int i=0;
        for (Map.Entry<String, Integer> entry :
                map1.entrySet()) {
            a[i]=entry.getKey();
            b[i]=entry.getValue();
            i++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        /*String a1="Ali";
        String b1=new String("Ali");
        System.out.println(a1.equals(b1));
        System.out.println(a1==b1);

        String[] bb={"Ali","b"};
        System.out.println(a1==bb[0]);
        System.out.println(a1.equals(bb[0]));*/
    }
}




package mthree_interview;

import java.util.HashMap;
import java.util.List;

public class Trading {
    public static String mostPopularTicker(List<ModelingTrade> lst, String key) {
        HashMap<String, Integer> map = new HashMap<>();
        for (ModelingTrade t : lst) {

            if (map.containsKey(key)) {
                map.put(t.getmTicker(), (map.get(t.getmTicker())) + 1);
            } else
                map.put(t.getmTicker(), 1);//business
        }

        return map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }
}


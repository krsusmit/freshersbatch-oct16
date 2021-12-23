package question7;

import java.security.Key;
import java.util.HashMap;
import java.util.Map.Entry;

public class Convert {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        map.put(1," hello ");
        map.put(2," How are u? ");
        for (Entry<Integer,String> m :map.entrySet() )
        {
            sb.append(m);
        }
        System.out.println(sb);
    }
}

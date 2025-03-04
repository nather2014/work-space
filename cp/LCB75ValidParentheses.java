import java.util.HashMap;
import java.util.Map;

public class LCB75ValidParentheses {

    public boolean isValid(String s) {
        String[] sArray = s.split(""); 
        Map<String,String> map = new HashMap<>();
        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");
        boolean flag = false;
        for (int i = 1; i < sArray.length; i=i+2) {
            if (map.get(sArray[i])==sArray[i-1]) {
                flag = true;
            }
            flag = false;
        }
    }

    public static void main(String[] args) {
        LCB75ValidParentheses vp = new LCB75ValidParentheses();
        System.out.println(vp.isValid(null));
    }

}

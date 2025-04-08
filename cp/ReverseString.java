public class ReverseString {

    public static void main(String[] args) {
        String str = "hello";

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        sb.setLength(0);

        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}

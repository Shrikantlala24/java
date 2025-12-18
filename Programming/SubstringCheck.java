public class SubstringCheck {
    public static void main(String[] args) {
        String s = "programming";
        String sub = "gram";

        boolean found = false;

        for (int i = 0; i <= s.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (s.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}

package javaapplication186;

import java.util.HashSet;
import java.util.Set;

public class JavaApplication186 {

    static Set<Integer> alphabet = new HashSet<>(26);

    public static void main(String[] args) {

        int cnt = 0;
        String str = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком , как и я";
        for (char c : str.toCharArray()) {
            int n = c - 'a';
            if (n >= 0 && n < 33) {
                if (alphabet.add(n)) {
                    cnt += 1;
                    if (cnt == 33) {
                        System.out.println("нашел все буквы");
                        break;

                    }
                }
            }
        }
    }
}

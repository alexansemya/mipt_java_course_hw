import java.util.HashMap;
import java.lang.*;

public class CaesarCodec implements Coder {
    private int key;
    public CaesarCodec(int key) {
        setKey(key);
    }
    public String encode(String str)
    {
        HashMap<Character, Character> alphabet = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabet.put((char)(97 + i), (char)(97 + ((i + getKey())) % 26));
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (Character.isAlphabetic(cur))
            {
                if (Character.isUpperCase(cur))
                {
                    result += Character.toUpperCase(alphabet.get(Character.toLowerCase(cur)));
                }
                else
                {
                    result += alphabet.get(cur);
                }
            }
            else result += Character.toString(cur);
        }
        return result;
    }
    public String decode(String str) {
        HashMap<Character, Character> alphabet = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabet.put((char) (97 + ((i + getKey()) % 26)), (char) (97 + i));
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (Character.isAlphabetic(cur))
            {
                if (Character.isUpperCase(cur))
                {
                    result += Character.toUpperCase(alphabet.get(Character.toLowerCase(cur)));
                }
                else
                {
                    result += alphabet.get(cur);
                }
            }
            else result += Character.toString(cur);
        }
        return result;
    }
    
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}

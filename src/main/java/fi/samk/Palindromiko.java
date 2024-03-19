package fi.samk;

public class Palindromiko {
    public boolean isPalindrome(String sentence) {
        String test_sentence = sentence.replaceAll("\\s", "");
        test_sentence = test_sentence.toLowerCase();

        StringBuilder new_sentence = new StringBuilder();
        for (int i = test_sentence.length() -1; i >= 0; i--) {
            new_sentence.append(test_sentence.charAt(i));
        }
        String str_sentence = new_sentence.toString();
        if (test_sentence.equals(str_sentence)){
            return true;
        } else {
            return false;
        }
    }
}

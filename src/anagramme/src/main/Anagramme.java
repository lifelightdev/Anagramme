package anagramme.src.main;

import java.util.Arrays;

public class Anagramme {
    public static boolean isAnagramme(String premier, String second){
        return Arrays.equals(premier.toUpperCase().chars().sorted().toArray(), second.toUpperCase().chars().sorted().toArray());
    }
}

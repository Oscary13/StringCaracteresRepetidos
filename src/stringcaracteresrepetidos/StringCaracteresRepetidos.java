/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcaracteresrepetidos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class StringCaracteresRepetidos {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa una cadena de caracteres");
        String cadena = scanner.nextLine().toLowerCase().replaceAll("\\s", "");

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        HashMap<Character, Integer> duplicatedCharsMap = new HashMap<>();
        char[] stringToCharArray = cadena.toCharArray();
        for (char character : stringToCharArray) {
            if (charCountMap.containsKey(character)) {
                charCountMap.put(character, charCountMap.get(character) + 1);
            } else {
                charCountMap.put(character, 1);
            }
        }

        System.out.println("Caracteres repetidos");
        System.out.println("--------------------");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                duplicatedCharsMap.put(entry.getKey(), entry.getValue());
            }
        }

    }

}

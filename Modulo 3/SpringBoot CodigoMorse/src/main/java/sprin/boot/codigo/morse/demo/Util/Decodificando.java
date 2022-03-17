package sprin.boot.codigo.morse.demo.Util;

public class Decodificando {

            public static String morseToEnglish(String[] code,
                                              String morseCode)
            {
                String[] array = morseCode.split(" ");
                StringBuilder result = new StringBuilder();
                for (String s : array) {
                    for (int j = 0; j < code.length; j++) {
                        if (s.compareTo(code[j]) == 0) {
                            result.append((char) (j + 'a')).append(" ");
                            break;
                        }
                    }
                }
                return result.toString();
            }
//            public static void englishToMorse(String[] code,
//                                              String englishLang,
//                                              char[] letter)
//            {
//                System.out.print("Morse code of " + englishLang
//                        + " is ");
//                for (int i = 0; i < englishLang.length(); i++) {
//                    for (int j = 0; j < letter.length; j++) {
//                        if (englishLang.charAt(i) == letter[j]) {
//                            System.out.print(code[j] + " ");
//                            break;
//                        }
//                    }
//                }
//            }
}
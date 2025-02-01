package Nivel1.Ejercicio3.Model;

import java.io.*;
import java.util.*;


public class GameLogic {
    private HashMap<String, String> countriesMap;
    private String player;
    private int score;
    private static final Scanner sc = new Scanner(System.in);

    public GameLogic() {
        countriesMap = new HashMap<>();
        score = 0;
    }

    private void loadCountries() {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Nivel1/Ejercicio3/resources/countries.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                int firstSpaceIndex = line.indexOf(" ");
                if (firstSpaceIndex != -1) {
                    String country = line.substring(0, firstSpaceIndex).trim();
                    String capital = line.substring(firstSpaceIndex + 1).trim();
                    countriesMap.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura de archivo" + e.getMessage());
        }
    }

    private void getPlayer() {
        System.out.println("Hola introduce tu nombre para jugar a las capitales (están en inglés): ");
        player = sc.nextLine();

    }

    private void playGame() {
        Random random = new Random();
        String randomCountry, playerAnswer, normalizedPlayerAnswer, normalizedCorrectAnswer;
        List<String> countries = new ArrayList<>(countriesMap.keySet());

        for (int i = 1; i <= 10; i++) {
            randomCountry = countries.get(random.nextInt(countries.size()));
            System.out.println("¿Cuál es la capital de " + randomCountry.replace("_", " ") + " ?");
            playerAnswer = sc.nextLine();
            normalizedPlayerAnswer = normalizeText(playerAnswer);
            normalizedCorrectAnswer = normalizeText(countriesMap.get(randomCountry));

            if (normalizedPlayerAnswer.equals(normalizedCorrectAnswer)) {
                System.out.println("Correcto");
                score++;
            } else {
                System.out.println("Incorrecto, la capital es " + countriesMap.get(randomCountry).replace("_", " "));
            }

        }
        System.out.println("Juego terminado. Tu puntuación es: " + score + " /10");
    }

    private String normalizeText(String text) {
        return text.replace("_", "")
                .replace("-", "")
                .replace(" " , "")
                .toUpperCase();
    }

    private void saveScore() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/Nivel1/Ejercicio3/Resources/topScores.txt", true))) {
            bw.write(player + " : " + score + " puntos\n");
        } catch (IOException e) {
            System.out.println("Error al guardar resultado: " + e.getMessage());
        }
    }

    public void startGame() {
        loadCountries();
        getPlayer();
        playGame();
        saveScore();
    }
}

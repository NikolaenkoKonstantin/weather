package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp, wind, rain;
        Scanner scanner = new Scanner(System.in);
        String prompt = null;

        System.out.print("Введите температуру на улице: ");
        temp = scanner.nextInt();
        System.out.print("Если на улице сильный ветер, введите 1, иначе 0: ");
        wind = scanner.nextInt();
        System.out.print("Если на улице дождь, введите 1, иначе 0: ");
        rain = scanner.nextInt();

        if (rain == 1){
            prompt = "На улице дождь, поэтому лучше остаться дома";
        }else{
            if(wind == 1){
                if(temp > 20) {
                    prompt = "На улице ветер, но тепло, нужно надеть какую нибудь желетку";
                }else{
                    prompt = "На улице холодно и сильный ветер, нужно надеть куртку и шапку";
                }
            }else {
                if(temp > 20){
                    prompt = "На улице ни дождя, ни ветра, ещё и тепло!!!";
                }else{
                    prompt = "На улице ни дождя, ни ветра, но холодновато, нужно надеть что-нибудь";
                }
            }
        }

        System.out.println("\nPrompt: " + prompt);

    }
}
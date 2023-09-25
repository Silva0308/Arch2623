package RewardGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import RewardGenerator.Fabrics.CoinGenerator;
import RewardGenerator.Fabrics.CopperGenerator;
import RewardGenerator.Fabrics.CristalGenerator;
import RewardGenerator.Fabrics.GemGenerator;
import RewardGenerator.Fabrics.GoldGenerator;
import RewardGenerator.Fabrics.ItemGenerator;
import RewardGenerator.Fabrics.LeatherGenerator;
import RewardGenerator.Fabrics.PlatinumGenerator;
import RewardGenerator.Fabrics.SilverGenerator;

public class Main {
   
    public static void main(String[] args) {
        GoldGenerator f1 = new GoldGenerator();
        GemGenerator f2 = new GemGenerator();
        SilverGenerator f3 = new SilverGenerator();
        CoinGenerator f4 = new CoinGenerator();
        CopperGenerator f5 = new CopperGenerator();
        CristalGenerator f6 = new CristalGenerator();
        LeatherGenerator f7 = new LeatherGenerator();
        PlatinumGenerator f8 = new PlatinumGenerator();

        // Вариант 1

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemGeneratorList.add(f3);
            itemGeneratorList.add(f5);
            itemGeneratorList.add(f4);
            itemGeneratorList.add(f6);
            itemGeneratorList.add(f7);
            itemGeneratorList.add(f8);
        }
        for (int i = 0; i < 3; i++) {
            itemGeneratorList.add(f1);
        }
        itemGeneratorList.add(f2);

        Random rnd = ThreadLocalRandom.current();
        for (int index = 0; index < 20; index++) {
            itemGeneratorList.get(rnd.nextInt(itemGeneratorList.size())).openReward();

        }

    System.out.println("************");

    // Вариант 2
    // Задаем частоты выпадения каждого приза, но тут я только с тремя сделала. Больше неудобно уже
    int frequencyPrize1 = 21; // 21%
    int frequencyPrize2 = 71; // 71%

    Random random = new Random();for(
    int index = 0;index<20;index++)
    {
        // Получаем случайное число от 0 до 99
        int randomNumber = random.nextInt(100);
        // Проверяем, к какому промежутку выпадения относится случайное число
        if (randomNumber < frequencyPrize1) {
            f1.openReward();
        } else if (randomNumber < frequencyPrize1 + frequencyPrize2) {
            f3.openReward();
        } else {
            f2.openReward();
        }
    }
}}

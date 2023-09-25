package RewardGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import RewardGenerator.Fabrics.GemGenerator;
import RewardGenerator.Fabrics.GoldGenerator;
import RewardGenerator.Fabrics.ItemGenerator;
import RewardGenerator.Fabrics.SilverGenerator;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        GoldGenerator f1 = new GoldGenerator();
        GemGenerator f2 = new GemGenerator();
        SilverGenerator f3 = new SilverGenerator();

        // Задаем частоты выпадения каждого приза
        int frequencyPrize1 = 21; // 21%
        int frequencyPrize2 = 71; // 71%

        
        Random random = new Random();
        for (int index = 0; index < 20; index++) {
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
        // Вариант 2
        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        System.out.println("*******");
        // добавление 10 экземпляров SilverGenerator, 3 экземпляров GoldGenerator и 1
        // экземпляра GemGenerator в список
        for (int i = 0; i < 10; i++) {
            itemGeneratorList.add(f3);
        }
        for (int i = 0; i < 3; i++) {
            itemGeneratorList.add(f1);
        }
        itemGeneratorList.add(f2);

        Random rnd = ThreadLocalRandom.current();
        for (int index = 0; index < 20; index++) {
            itemGeneratorList.get(rnd.nextInt(itemGeneratorList.size())).openReward();

        }

    }
}

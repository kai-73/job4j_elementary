package exercises.arrays;
/**
 * 5.8. Четные vs Нечетные
 * Вам даны очки игроков. Игроки разделись таким образом,
 * что под четными индексами находятся очки первой команды, под нечетными второй.
 * Ваша задача определить, кто выиграл. Выигрывает та команда,
 * которая набрала наибольшее число очков. Если выиграла первая команда,
 * то нужно вернуть 1, если вторая, то 2, если ничья то 0.
 */
public class EvenVsOdd58 {
    public static int whoWin(int[] players) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1 += players[i];
            } else {
                sum2 += players[i];
            }
        }
        return sum1 > sum2 ? 1 : (sum1 == sum2 ? 0 : 2);
    }
}

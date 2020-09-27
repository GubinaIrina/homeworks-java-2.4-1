package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж: "+ service.calculateSum(purchases));
    }

    @Test
    void shouldCalculateAverageAmount() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Средняя сумма продаж: "+ service.calculateAverageAmount(purchases));
    }

    @Test
    void findMaxSales() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Максимальные продажи: "+ service.findMaxSales(purchases));
    }

    @Test
    void findMinSales() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Минимальные продажи: "+ service.findMinSales(purchases));
    }

    @Test
    void monthsUnderAverageAmount() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Количество месяцев с продажами выше среднего: "+ service.monthsUnderAverageAmount(purchases));
    }

    @Test
    void monthsBeforeAverageAmount() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        System.out.println("Количество месяцев с продажами ниже среднего: "+ service.monthsUnderAverageAmount(purchases));
    }
}
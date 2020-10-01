package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long averageAmount(long[] purchases) {
       return calculateSum(purchases) / purchases.length;
        }


    public long findMaxSales(long[] purchase) {
        long max = purchase[0];
        long monthNumber = 0;
        int i;
        for (i=0; i< purchase.length; i++) {
            if (max <= purchase[i]) {
                max = purchase[i];
                monthNumber = i + 1;
            }
        }
            return monthNumber;
        }

    public long findMinSales(long[] purchase) {
        long min = purchase[0];
        long monthNumber = 0;
        int i;
        for (i=0; i < purchase.length; i++) {
            if (purchase[i] <= min) {
                min = purchase[i];
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }

    public long monthsUnderAverageAmount(long[] purchases) {
        long month = 0;
        for (long purchase : purchases) {
            if (purchase > averageAmount (purchases)) {
                month++;
            }
        }
        return month;
    }

    public long monthsBeforeAverageAmount(long[] purchases) {
        long month = 0;
        for (long purchase : purchases) {
            if (purchase < averageAmount (purchases)) {
                month++;
            }
        }
        return month;
    }
}

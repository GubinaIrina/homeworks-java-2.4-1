package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageAmount(long[] purchases) {
        long averageAmount = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
            averageAmount = sum / purchases.length;
        }
        return averageAmount;
    }

    public long findMaxSales(long[] purchases) {
        long max = purchases[0];
        long monthNumber = 0;
        for (long purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
            monthNumber ++;
        }
        return max;
    }

    public long findMinSales(long[] purchases) {
        long min = purchases[0];
        long monthNumber = 0;
        for (long purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
            monthNumber ++;
        }
        return min;
    }

    public long monthsUnderAverageAmount(long[] purchases) {
        long month = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averageAmount = sum / purchases.length;
        for (long purchase : purchases) {
            if (purchase > averageAmount) {
                month++;
            }
        }
        return month;

    }

    public long monthsBeforeAverageAmount(long[] purchases) {
        long month = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averageAmount = sum / purchases.length;
        for (long purchase : purchases) {
            if (purchase < averageAmount) {
                month++;
            }
        }
        return month;

    }
}

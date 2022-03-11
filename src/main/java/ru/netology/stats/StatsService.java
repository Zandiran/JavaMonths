package ru.netology.stats;

public class StatsService {

    public int calculateAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateMiddleSales(long[] sales) {
        return calculateAllSales(sales) / sales.length;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long belowMiddle(long[] sales) {
        long month = 0;
        long middle = calculateMiddleSales(sales);
        for (long sale : sales)
            if (sale < middle)
                month++;

        return month;
    }

    public long underMiddle(long[] sales) {
        long month = 0;
        long middle = calculateMiddleSales(sales);
        for (long sale : sales)
            if (sale < middle)
                month++;

        return month;
    }
}

package com.codecool.forum;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Util {


    public static int getRandom(int min, int max) {
        Random random = new Random();
        int result = random.nextInt((max - min) + 1) + min;
        return result;
    }

//        public static LocalDate getRandomBirthDate() {
//            LocalDate randomDate = createRandomDate(1950, 2001);
//            return randomDate;
//        }
//
//        public static LocalDate createRandomDate(int startYear, int endYear) {
//            int day = getRandom(1, 28);
//            int month = getRandom(1, 12);
//            int year = getRandom(startYear, endYear);
//            return LocalDate.of(year, month, day);
//        }
}

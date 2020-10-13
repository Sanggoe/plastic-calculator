package com.yeonji.sanggoe.plastic.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String[] getScoreStrings(int score) {
        String[] imagesName = new String[2];
        imagesName[0] = "/images/scoreStemp/stamp";
        imagesName[1] = "/images/scoreComment/comment";

        if (score <= 7) {
            imagesName[0] += "A+.png";
            imagesName[1] += "A+.png";
        } else if (score <= 33) {
            imagesName[0] += "A0.png";
            imagesName[1] += "A0.png";
        } else if (score <= 46) {
            imagesName[0] += "B+.png";
            imagesName[1] += "B+.png";
        } else if (score <= 57) {
            imagesName[0] += "B0.png";
            imagesName[1] += "B0.png";
        } else if (score <= 75) {
            imagesName[0] += "C+.png";
            imagesName[1] += "C+.png";
        } else if (score <= 102) {
            imagesName[0] += "C0.png";
            imagesName[1] += "C0.png";
        } else if (score <= 130) {
            imagesName[0] += "C-.png";
            imagesName[1] += "C-.png";
        } else {
            imagesName[0] += "F0.png";
            imagesName[1] += "F0.png";
        }

        return imagesName;
    }

    public int[] getResultPerYears(int pet1, int pet2, int contain, int eggPlt, int glove, int bagSmall,
                                   int bagMiddle, int bagBig, int deliveFood, int spoon, int straw, int cup,
                                   int clean1, int shampoo, int toothBrush, int toothPaste, int clean2, int cosmetic) {
        int[] results = new int[3];
        double sum = (pet1 * 132 + pet2 * 300 + contain * 132 + eggPlt * 870.07 + glove * 540
                + bagSmall * 690 + bagMiddle * 1705 + bagBig * 2919 + deliveFood * 380
                + spoon * 29.7 + straw * 12.6 + cup * 135.8 + clean1 * 252 + shampoo * 232
                + toothBrush * 22.2 + toothPaste * 96 + clean2 * 103 + cosmetic * 59.6);

        results[0] = (int) (sum * 12 / 12.5);
        results[1] = (int) (sum * 12 * 20 / 84);
        results[2] = (int) (sum * 12 * 100 / 84 / 40);

        return results;
    }

    public String[][] getResultStrings(String s1, String s2, String s3, String s4, String s5, String s6,
                                       String r1, String r2, String r3, String r4, String r5, String r6,
                                       String r7, String r8, String r9, String r10, String r11, String r12) {

        String[] group = new String[2];
        String[][] products = {{"1", s1}, {"2", s2}, {"3", s3}, {"4", s4}, {"5", s5}, {"6", s6}};
        String[][] replaces = {{"1", r1}, {"1", r2}, {"1", r3}, {"1", r4}, {"2", r5}, {"2", r6},
                {"3", r7}, {"4", r8}, {"5", r9}, {"6", r10}, {"6", r11}, {"6", r12}};
        String[][] list = new String[2][3];
        int str = 0;
        int rep1 = 1;
        int rep2 = 1;

        for (int i = 0; i < products.length; i++) {
            if (!products[i][1].equals("")) {
                list[str][0] = products[i][1];
                group[str++] = products[i][0];
            }
        }


        for (int i = 0; i < replaces.length; i++) {
            if (!replaces[i][1].equals("")) {
                if (group[0].equals(replaces[i][0])) {
                    list[0][rep1++] = replaces[i][1];
                } else {
                    list[1][rep2++] = replaces[i][1];
                }
            }
        }

        return list;
    }

}

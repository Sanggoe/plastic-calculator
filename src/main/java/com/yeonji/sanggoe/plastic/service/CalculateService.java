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

        System.out.println(sum);

        results[0] = (int)(sum * 12 / 12.5);
        results[1] = (int)(sum * 12 * 20 / 84);
        results[2] = (int)(sum * 12 * 100 / 84 / 40);

        System.out.println(results[0]);
        System.out.println(results[1]);
        System.out.println(results[2]);

        return results;
    }

}

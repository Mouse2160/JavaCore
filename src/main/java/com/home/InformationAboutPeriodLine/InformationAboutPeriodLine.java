package com.home.InformationAboutPeriodLine;

import java.util.ArrayList;
import java.util.List;

public class InformationAboutPeriodLine {

    public int countMinimumLinePeriod(String line) {
        char[] chars = line.toCharArray();
        int minPeriod = chars.length;
        int currentPeriod = 0;
        int firstIndex = 0;
        for (int nextIndex = 0; nextIndex < chars.length; nextIndex++){
            if (nextIndex != 0 && chars[firstIndex] == chars[nextIndex]){
                if (currentPeriod < minPeriod) minPeriod = currentPeriod;
                currentPeriod = 0;
            }
            currentPeriod++;
        }
        return minPeriod;
    }

    public List<String> parsingSimilarLine(String line) {
        List <String> words = new ArrayList <>();
        char[] chars = line.toCharArray();
        int firstCharIndex = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++){
            if (i != 0 && chars[firstCharIndex] == chars[i]){
                words.add(builder.toString());
                firstCharIndex = i;
                builder.delete(0, builder.length());
            }
            builder.append(chars[i]);
        }
        words.add(builder.toString());
        return words;
    }
}

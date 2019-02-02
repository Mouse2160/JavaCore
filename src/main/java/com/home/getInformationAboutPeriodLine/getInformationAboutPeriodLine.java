package com.home.getInformationAboutPeriodLine;

import java.util.ArrayList;
import java.util.List;

public class getInformationAboutPeriodLine {

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

    public List<String> getLinePeriodList(String line) {
        List <String> ListLinePeriod = new ArrayList <String>();
        char[] chars = line.toCharArray();
        int firstCharIndex = 0;
        StringBuilder builder = new StringBuilder();
        for (int nextCharIndex = 0; nextCharIndex < chars.length; nextCharIndex++){
            if (nextCharIndex != 0 && chars[firstCharIndex] == chars[nextCharIndex]){
                ListLinePeriod.add(builder.toString());
                firstCharIndex = nextCharIndex;
                builder.delete(0, builder.length());
            }
            builder.append(chars[nextCharIndex]);
        }
        ListLinePeriod.add(builder.toString());
        return ListLinePeriod;
    }
}

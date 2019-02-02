package com.home.InformationAboutPeriodLine;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class InformationAboutPeriodLineTest {

    @Test
    @Parameters(method = "testRequestLoan_Parameters_countMin")
    public void countMinimumLinePeriodTest(String line, int expectedPeriod){
        InformationAboutPeriodLine informationAboutPeriodline = new InformationAboutPeriodLine();
        int minLinePeriod = informationAboutPeriodline.countMinimumLinePeriod(line);
        Assert.assertEquals(expectedPeriod, minLinePeriod);
    }

    @Test
    @Parameters(method = "testRequestLoan_Parameters_getList")
    public void getLinePeriodListTest(String line, List<String> expectedList) {
        InformationAboutPeriodLine informationAboutPeriodline = new InformationAboutPeriodLine();
        List<String> listPeriodLine = informationAboutPeriodline.parsingSimilarLine(line);
        Assert.assertEquals(expectedList, listPeriodLine);
    }

    @SuppressWarnings("unused")
    private static Object[][] testRequestLoan_Parameters_countMin() {
        return new Object[][]{
                {"abcabcabcabc", 3},
                {"abcdefg", 7},
                {"qwertyqwertyqwerty", 6}
        };

    }

    @SuppressWarnings("unused")
    private static Object[][] testRequestLoan_Parameters_getList() {

        List<String> firstList = new ArrayList<String>();
        firstList.add("abc");
        firstList.add("abc");
        firstList.add("abc");

        List<String> secondList = new ArrayList<String>();
        secondList.add("qwerty");

        List<String> thirdList = new ArrayList<String>();
        thirdList.add("qwerty");
        thirdList.add("qwerty");

        return new Object[][]{
                {"abcabcabc", firstList},
                {"qwerty", secondList},
                {"qwertyqwerty", thirdList}
        };

    }
}
package com.markoconnor.unittesting.business;

import com.markoconnor.unittesting.business.SomeBusinessImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessTest {

    @Test
    public void calculateSum_Basic(){
        SomeBusinessImpl someBusinessimpl = new SomeBusinessImpl();
        int actualResult = someBusinessimpl.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl someBusinessimpl = new SomeBusinessImpl();
        int actualResult = someBusinessimpl.calculateSum(new int[] {});
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSum_oneValue(){
        SomeBusinessImpl someBusinessimpl = new SomeBusinessImpl();
        int actualResult = someBusinessimpl.calculateSum(new int[] {6});
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);

    }
}

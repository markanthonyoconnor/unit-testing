package com.markoconnor.unittesting.business;

import com.markoconnor.unittesting.data.SomeDataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SomeDataServiceStub_basic implements SomeDataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3};
    }
}

class SomeDataServiceStubOneValue implements SomeDataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{1};
    }
}


class SomeDataServiceStubEmptyValue implements SomeDataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{0};
    }
}


public class SomeBusinessStubTest {


    @Test
    public void calculateSumUsingDataService_empty(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStubEmptyValue());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStubOneValue());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSumUsingDataService_basic(){
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub_basic());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);

    }
}

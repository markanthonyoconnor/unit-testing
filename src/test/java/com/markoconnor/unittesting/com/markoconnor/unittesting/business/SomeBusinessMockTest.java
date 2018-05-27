package com.markoconnor.unittesting.com.markoconnor.unittesting.business;

import com.markoconnor.unittesting.business.SomeBusinessImpl;
import com.markoconnor.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl business = new SomeBusinessImpl();

    @Mock
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    // Mockito does thia part for you by initialising the fields that have @Mock and inject in the object so no need for @Before
    //@Before
    //public void before() {
    //  business.setSomeDataService(dataServiceMock);
    //}


    @Test
    public void calculateSumUsingDataService_Basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        assertEquals(6, business.calculateSumUsingDataService());

    }

    @Test
    public void calculateSumUsingDataService_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calculateSumUsingDataService());

    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1});
        assertEquals(1, business.calculateSumUsingDataService());

    }
}

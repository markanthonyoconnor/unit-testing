package com.markoconnor.unittesting.business;

import com.markoconnor.unittesting.data.ItemRepository;
import com.markoconnor.unittesting.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;

    @Mock
    ItemRepository repository;


    @Test
    public void calculateSumUsingDataService_Basic() {
        when(repository.findAll()).thenReturn(Arrays.asList(new Item(2, "Item2", 10, 10)));
        List<Item> items = business.retrieveAllItems();
        assertEquals(100, items.get(0).getValue());

    }

}

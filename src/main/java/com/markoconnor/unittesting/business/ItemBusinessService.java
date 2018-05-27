package com.markoconnor.unittesting.business;

import com.markoconnor.unittesting.data.ItemRepository;
import com.markoconnor.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ItemBusinessService {

    @Autowired
    private ItemRepository repository;

    public Item retrieveHardcodedItem() {

        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems(){

        List<Item> items = repository.findAll();  // test this method (findAll) in ItemBusinessServiceTest class

        for (Item item: items) {
            item.setValue(item.getPrice() * item.getQuantity());

        }
        return items;
    }

}

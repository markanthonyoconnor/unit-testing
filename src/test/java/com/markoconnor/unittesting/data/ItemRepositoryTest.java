package com.markoconnor.unittesting.data;

import com.markoconnor.unittesting.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    public void testFindAll() {
        List<Item> items = repository.findAll();
        assertEquals(3, items.size());
    }

    @Test
    public void testFindById() {
        Item items = repository.getOne(1000);
        assertEquals("item1", items.getName());
    }

    @Test
    public void testFindByName() {
      Item item = repository.getOne(1002);
      assertEquals("item3", item.getName());
    }

    @Test
    public void testFindByPrice() {
        Item item = repository.getOne(1002);
        assertEquals(15, item.getPrice());
    }
}
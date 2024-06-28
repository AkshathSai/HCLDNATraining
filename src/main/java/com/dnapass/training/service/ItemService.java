package com.dnapass.training.service;

import com.dnapass.training.entity.Item;
import com.dnapass.training.entity.ItemDetails;
import com.dnapass.training.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item addNewItem(Item item) {
        return itemRepository.save(item);
    }

    public List<ItemDetails> getAllItems() {
        return itemRepository.findAllItems();
    }

    public List<Item> getAllItemById(Integer userId) {
        return itemRepository.findAllByUserId(userId);
    }

    public void deleteItemDetails(Integer itemId) {
        itemRepository.deleteById(itemId);
    }

    public Item getItemById(Integer itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    public List<ItemDetails> searchItem(String city) {
        return itemRepository.getItemDetailsBasedCity(city);
    }

}

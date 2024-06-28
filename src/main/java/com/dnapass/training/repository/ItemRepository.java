package com.dnapass.training.repository;

import com.dnapass.training.entity.Item;
import com.dnapass.training.entity.ItemDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findAllByUserId(Integer userId);

    @Query("SELECT new com.dnapass.training.entity.ItemDetails(i.itemId, i.itemName, i.itemDescription, i.itemQuantity, i.user.username, i.user.mobileNumber, i.user.id) FROM Item i")
    List<ItemDetails> findAllItems();

    @Query("SELECT i FROM Item i WHERE i.user.id = :userId")
    List<Item> findAllItem(@Param("userId") Integer userId);

    @Query("SELECT new com.dnapass.training.entity.ItemDetails(i.itemId, i.itemName, i.itemDescription, i.itemQuantity, i.user.username, i.user.mobileNumber, i.user.id) FROM Item i WHERE i.user.city = :city")
    List<ItemDetails> getItemDetailsBasedCity(@Param("city") String city);

    List<Item> findAll();
}

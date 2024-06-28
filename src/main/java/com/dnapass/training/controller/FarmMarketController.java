package com.dnapass.training.controller;

import com.dnapass.training.entity.Equipment;
import com.dnapass.training.entity.Item;
import com.dnapass.training.entity.ItemDetails;
import com.dnapass.training.entity.Login;
import com.dnapass.training.entity.User;
import com.dnapass.training.service.EquipmentService;
import com.dnapass.training.service.ItemService;
import com.dnapass.training.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmmarket")
public class FarmMarketController {

    @Autowired
    private UserService userService;

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private ItemService itemService;

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody Login login) {
        User user = userService.findUser(login.getUserid());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/newuser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Equipment>> searchEquipment(@RequestParam String city) {
        List<Equipment> equipments = equipmentService.searchEquipment(city);
        return new ResponseEntity<>(equipments, HttpStatus.OK);
    }

    @GetMapping("/getAllEquipment")
    public ResponseEntity<List<Equipment>> getAllEquipment() {
        List<Equipment> equipments = equipmentService.getAllEquipment();
        return new ResponseEntity<>(equipments, HttpStatus.OK);
    }

    @GetMapping("/getAllEquipmentById/{id}")
    public ResponseEntity<List<Equipment>> getAllEquipmentById(@PathVariable Integer id) {
        List<Equipment> equipments = equipmentService.getAllEquipmentById(id);
        return new ResponseEntity<>(equipments, HttpStatus.OK);
    }

    @GetMapping("/getAllItemById/{id}")
    public ResponseEntity<List<Item>> getAllItemById(@PathVariable Integer id) {
        List<Item> items = itemService.getAllItemById(id);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @PutMapping("/book/{equipId}/{userId}/{quantityCount}")
    public ResponseEntity<Equipment> bookEquipment(@PathVariable Integer equipId, @PathVariable Integer userId, @PathVariable int quantityCount) {
        Equipment equipment = equipmentService.getEquipmentById(equipId);
        equipment.setCount(equipment.getCount() - quantityCount);
        Equipment updatedEquipment = equipmentService.addEquipment(equipment);
        return new ResponseEntity<>(updatedEquipment, HttpStatus.OK);
    }

    @PostMapping("/addNewItem/{id}")
    public ResponseEntity<Item> addNewItem(@PathVariable Integer id, @RequestBody Item item) {
        Item newItem = itemService.addNewItem(item);
        return new ResponseEntity<>(newItem, HttpStatus.CREATED);
    }

    @GetMapping("/getAllItems")
    public ResponseEntity<List<ItemDetails>> getAllItems() {
        List<ItemDetails> items = itemService.getAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @DeleteMapping("/deleteItemDetails/{itemId}")
    public ResponseEntity<Void> deleteItemDetails(@PathVariable Integer itemId) {
        itemService.deleteItemDetails(itemId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/itemDetails/{uid}")
    public ResponseEntity<Item> updateItemDetails(@PathVariable Integer uid, @RequestBody Item updatedItem) {
        userService.findUser(uid);
        Item item = itemService.getItemById(updatedItem.getItemId());
        Item newItem = itemService.addNewItem(updatedItem);
        return new ResponseEntity<>(newItem, HttpStatus.OK);
    }

    @PostMapping("/addNewEquipment/{id}")
    public ResponseEntity<Equipment> addNewEquipment(@PathVariable Integer id, @RequestBody Equipment equipment) {
        userService.findUser(id);
        Equipment newEquipment = equipmentService.addEquipment(equipment);
        return new ResponseEntity<>(newEquipment, HttpStatus.CREATED);
    }

    @GetMapping("/getAllEquipments")
    public ResponseEntity<List<Equipment>> getAllEquipments() {
        List<Equipment> equipments = equipmentService.getAllEquipment();
        return new ResponseEntity<>(equipments, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEquipmentDetails/{equipId}")
    public ResponseEntity<Void> deleteEquipmentDetails(@PathVariable Integer equipId) {
        equipmentService.deleteEquipmentDetail(equipId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/equipmentDetails/{uid}")
    public ResponseEntity<Equipment> updateEquipmentDetails(@PathVariable Integer uid, @RequestBody Equipment updatedEquipment) {
        userService.findUser(uid);
        Equipment equipment = equipmentService.getEquipmentById(updatedEquipment.getEquipmentId());
        Equipment newEquipment = equipmentService.addEquipment(updatedEquipment);
        return new ResponseEntity<>(newEquipment, HttpStatus.OK);
    }

    @GetMapping("/getFarmer/{id}")
    public ResponseEntity<User> getFarmerDetails(@PathVariable Integer id) {
        User user = userService.findUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/searchItem")
    public ResponseEntity<List<ItemDetails>> searchItem(@RequestParam String city) {
        List<ItemDetails> items = itemService.searchItem(city);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @PutMapping("/orderItem/{itemId}")
    public ResponseEntity<Item> orderItem(@PathVariable Integer itemId) {
        Item item = itemService.getItemById(itemId);
        item.setItemQuantity(item.getItemQuantity() - 1);
        Item newItem = itemService.addNewItem(item);
        return new ResponseEntity<>(newItem, HttpStatus.OK);
    }
}

package com.dnapass.training.service;

import com.dnapass.training.entity.Equipment;
import com.dnapass.training.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    public Equipment addEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public List<Equipment> searchEquipment(String city) {
        return equipmentRepository.findByEcity(city);
    }

    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findEquipmentByCount();
    }

    public List<Equipment> getAllEquipmentById(Integer userId) {
        return equipmentRepository.findAllByUserId(userId);
    }

    public void deleteEquipmentDetail(Integer equipmentId) {
        equipmentRepository.deleteById(equipmentId);
    }

    public Equipment getEquipmentById(Integer equipmentId) {
        return equipmentRepository.findById(equipmentId).orElse(null);
    }

}
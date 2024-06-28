package com.dnapass.training.repository;

import com.dnapass.training.entity.Equipment;
import com.dnapass.training.entity.EquipmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

    List<Equipment> findByEcity(String ecity);

    List<Equipment> findAllByUserId(Integer userId);

    @Query("SELECT e FROM Equipment e WHERE e.user.id = ?1")
    List<Equipment> findAllEquipment(Integer userId);

    @Query("SELECT e FROM Equipment e")
    List<Equipment> findEquipmentByCount();

    @Query("SELECT new com.dnapass.training.entity.EquipmentDetails(e.equipmentId, e.name, eu.quantity) FROM Equipment e JOIN EquipmentUser eu ON e.equipmentId = eu.equipment.equipmentId WHERE eu.user.id = :userId")
    List<EquipmentDetails> findHiredEquipment(Integer userId);
}

package com.ParkingManagement.ParkingMgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ParkingManagement.ParkingMgmt.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.hotelbooking.springBoot.repository;

import com.hotelbooking.springBoot.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,Long> {
}

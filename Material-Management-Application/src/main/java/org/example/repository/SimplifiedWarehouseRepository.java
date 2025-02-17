package org.example.repository;

import org.example.model.SimplifiedWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SimplifiedWarehouseRepository extends JpaRepository<SimplifiedWarehouse, UUID> {
}

package database.repositories;

import database.entities.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import javax.transaction.Transactional;

//@Repository
@Transactional
public interface PaymentRepository extends JpaRepository<Payment, UUID> {
	boolean existsByType(String type);
	Long deleteByType(String name);
}

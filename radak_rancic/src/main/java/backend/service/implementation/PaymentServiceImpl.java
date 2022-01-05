package backend.service.implementation;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.service.PaymentService;
import database.entities.Payment;
import database.repositories.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository payments;
	
	public List<Payment>findAllPayments(){
		return payments.findAll();
	}
	public boolean ifPaymentExist(String name) {
		return payments.existsByType(name);
	}
	public void addPayment(Payment p) {
		payments.save(p);
	}
	public void deletePaymentByName(String name) {
		payments.deleteByType(name);
	}
	public Optional<Payment> findPaymentById(UUID id) {
		return payments.findById(id);
	}
}

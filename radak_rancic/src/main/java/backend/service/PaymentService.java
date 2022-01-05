package backend.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import database.entities.Payment;

public interface PaymentService {
	public List<Payment>findAllPayments();
	public boolean ifPaymentExist(String name);
	public void addPayment(Payment p);
	public void deletePaymentByName(String name);
	public Optional<Payment> findPaymentById(UUID id);
}

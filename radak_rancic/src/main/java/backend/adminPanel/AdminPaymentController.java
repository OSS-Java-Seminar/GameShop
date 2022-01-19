package backend.adminPanel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.service.PaymentService;
import backend.service.implementation.PaymentServiceImpl;
import database.entities.Payment;

@RestController
@RequestMapping("/admin/payment")
public class AdminPaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/getall")
	public List<Payment>findAll(){
		return paymentService.findAllPayments();
	}
	@PostMapping("/add")
	public String addNew(@RequestBody Payment p) {
		String pName=p.getType();
		if(paymentService.ifPaymentExist(pName)) {
			return "Payment already exist";
		}
		paymentService.addPayment(p);
		return "Payment added";
	}
	@DeleteMapping("/delete")
	public String deleteOne(@RequestParam String type) {
		String pName=type;
		if(paymentService.ifPaymentExist(pName)) {
			paymentService.deletePaymentByName(pName);
			return "Payment deleted";
		}
		return "Payment not exist";
	}
	@PutMapping("/update/{id}")
	public String updatePayment(@PathVariable UUID id) {
		Payment p=paymentService.findPaymentById(id).get();
		//Ode triba dodat da se iz forme skupe podatci i onda priko settera postave
		return "Measure succesfully updated";
	}
}

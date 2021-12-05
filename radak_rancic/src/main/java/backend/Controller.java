package backend;
import database.repositories.*;
import database.entities.*;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	UserRepository u1;
	@SuppressWarnings("null")
	@RequestMapping("/")
	public String dummy() {
		User u=new User(null, null, null, null, 0, 0);
		u1.save(u);
		return "Hi";
	}
}

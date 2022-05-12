package in.brainupgrade.dynamodb;


import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan	//this is used tp specify that it is a repository
public interface UserRepository extends CrudRepository<User, UserKey> { //<main class, key attribute>
	List<User> findByLastName(String lastName);
	List<User> findAll();
}
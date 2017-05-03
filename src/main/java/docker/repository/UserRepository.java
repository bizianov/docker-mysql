package docker.repository;

import docker.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by viacheslav on 5/3/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}

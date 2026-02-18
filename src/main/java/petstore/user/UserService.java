package petstore.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserModel add(UserModel user) {
		return userRepository.add(user);
	}

	public UserModel searchByUsername(String username) {
		return userRepository.search(username);
	}

	public UserModel update(String username, UserModel user) {
		return userRepository.update(username, user);
	}

	public UserModel delete(String username) {
		return userRepository.delete(username);
	}

	public UserModel login(String username, String password) {
		UserModel user = userRepository.search(username);
		if (user.getPassword().equals(password)) {
			return user;
		}
		System.out.println("パスワードが違います");
		return null;
	}
}

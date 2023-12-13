package builder;

import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
		User user = createUser();
		UserDtoBuilder builder = new UserWebDtoBuilder();
		UserDto dto = directBuild(user, builder);
		System.out.println(dto);
	}

	private static UserDto directBuild(User user, UserDtoBuilder builder) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthDate()).withAddress(user.getAddress()).build();
	}

	public static User createUser() {
		User user = new User();
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setBirthDate(LocalDate.of(1980, 1, 1));
		Address address = new Address();
		address.setHouseNumber("123");
		address.setStreet("Main Street");
		address.setCity("New York");
		address.setState("NY");
		address.setZipCode("10010");
		user.setAddress(address);
		return user;
	}
}

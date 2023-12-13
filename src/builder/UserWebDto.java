package builder;

public class UserWebDto implements UserDto {

	private String name;
	private String address;
	private String age;

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getAddress() {
		return null;
	}

	@Override
	public String getAge() {
		return null;
	}

	public UserWebDto(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserWebDto {" +
			"name='" + name + '\'' +
			", address='" + address + '\'' +
			", age='" + age + '\'' +
			'}';
	}
}

package builder;

import java.time.LocalDate;

public interface UserDtoBuilder {

	UserDtoBuilder withFirstName(String fname);

	UserDtoBuilder withLastName(String lname);

	UserDtoBuilder withBirthday(LocalDate birthday);

	UserDtoBuilder withAddress(Address address);

	UserDto build();

	UserDto getUserDto();
}

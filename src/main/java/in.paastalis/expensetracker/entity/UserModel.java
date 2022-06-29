package in.paastalis.expensetracker.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserModel {

    @NotBlank(message = "Name can not be empty")
    private String name;

    @NotNull(message = "Email can not be empty")
    @Email(message = "Enter a valid email")
    private String email;

    @NotNull(message = "Password can not be empty")
    @Size(min = 5, message = "Password should be at least 5 characters long")
    private String password;

    private Long age = 0L;
}

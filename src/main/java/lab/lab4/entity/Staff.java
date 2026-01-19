package lab.lab4.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Staff {

    @NotBlank
    @Email
    private String id;

    @NotBlank
    private String fullname;

    @Default
    private String photo = "photo.jpg";

    @NotNull
    private Boolean gender;

    @NotNull
    @Past
    @Default
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date birthday = new Date();

    @NotNull
    @Min(1000)
    @Default
    private Double salary = 12345.6789;

    @Default
    private Integer level = 0;
}

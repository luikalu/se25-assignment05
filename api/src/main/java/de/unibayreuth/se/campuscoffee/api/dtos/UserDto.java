package de.unibayreuth.se.campuscoffee.api.dtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for user metadata.
 *
 */
@Data
@Builder(toBuilder = true)
public class UserDto {
    private Long id;

    @Pattern(regexp = "\\w+")
    @NotBlank
    private String loginName;

    @Email
    @NotBlank
    private String email;

    @Size(min = 1, max = 255)
    @NotBlank
    private String firstName;

    @Size(min = 1, max = 255)
    @NotBlank
    private String lastName;
}

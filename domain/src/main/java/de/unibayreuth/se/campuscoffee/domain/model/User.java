package de.unibayreuth.se.campuscoffee.domain.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.*;

/**
 * Domain class that stores the user metadata.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // ID can be null before persistence
    @Nullable
    private Long id;

    // Must be set by JPA on creation
    @NotNull
    @CreationTimestamp
    private LocalDateTime createdAt;

    // Must be set by JPA on creation or update
    @NotNull
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @NotBlank
    @Pattern(regexp = "\\w+", message = "Login name must contain only word characters.")
    private String loginName;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 1, max = 255)
    private String firstName;

    @NotBlank
    @Size(min = 1, max = 255)
    private String lastName;
}

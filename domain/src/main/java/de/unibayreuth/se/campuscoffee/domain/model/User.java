package de.unibayreuth.se.campuscoffee.domain.model;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalDateTime;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.ZoneId;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.*;

/**
 * Domain class that stores the user metadata.
 */

@Data
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id; // null when the user has not been created yet
    private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("UTC")); // set on user creation
    private LocalDateTime updatedAt = createdAt; // set on user creation and update

    @NonNull
    private String loginName;

    @NonNull
    private String email;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;
}

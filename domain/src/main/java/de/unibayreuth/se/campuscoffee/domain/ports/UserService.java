package de.unibayreuth.se.campuscoffee.domain.ports;

import de.unibayreuth.se.campuscoffee.domain.exceptions.UserNotFoundException;
import de.unibayreuth.se.campuscoffee.domain.model.User;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * Interface for the implementation of the user service that the domain module provides as a port and implements itself.
 */

public interface UserService {
    void clear();
    @NonNull
    List<User> getAll();
    @NonNull
    User getById(@NonNull Long id) throws UserNotFoundException;
    @NonNull
    User getByLoginName(@NonNull String loginName) throws UserNotFoundException;
    @NonNull
    User upsert(@NonNull User user) throws UserNotFoundException;
}
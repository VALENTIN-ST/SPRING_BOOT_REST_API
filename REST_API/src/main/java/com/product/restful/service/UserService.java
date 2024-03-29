package com.product.restful.service;

import com.product.restful.dto.user.CreateUserRequest;
import com.product.restful.dto.user.UpdateUserRequest;
import com.product.restful.dto.user.UserDTO;
import com.product.restful.dto.user.UserIdentityAvailability;
import com.product.restful.entity.user.User;

public interface UserService {

    UserIdentityAvailability checkUsernameAvailability(String username);

    UserIdentityAvailability checkEmailAvailability(String email);

    void checkUsernameIsExists(String username);

    void checkEmailIsExists(String email);

    UserDTO getUserByUsername(String username);

    UserDTO createAdmin(CreateUserRequest createUserRequest);

    UserDTO createUser(CreateUserRequest createUserRequest);

    void addRoleToUser(String username, String roleName);

    UserDTO getUserById(Long id);

    void deleteUser(String username);

    UserDTO updateUser(String username, UpdateUserRequest updateUserRequest);

    void verifyUserByUsernameOrEmail(String usernameOrEmail);

    User getUser(Long userId);

}

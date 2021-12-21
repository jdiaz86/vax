package com.demosoft.vax.service;

/**
 *
 * @author jdiaz
 */
import com.demosoft.vax.dto.UserDto;
import com.demosoft.vax.model.User;

import java.util.List;

public interface UserService {

    UserDto save(UserDto user);
    List<UserDto> findAll();
    User findOne(long id);
    void delete(long id);
}
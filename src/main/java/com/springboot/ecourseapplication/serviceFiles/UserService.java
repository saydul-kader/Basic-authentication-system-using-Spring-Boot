package com.springboot.ecourseapplication.serviceFiles;

import com.springboot.ecourseapplication.dataModel.User;
import com.springboot.ecourseapplication.webFiles.dto.UserRegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO registrationDto);
}

package com.spring.repository;


import com.spring.Exeptions.UserExists;
import com.spring.player.RegisteredUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisteredUserService {
    @Autowired
    private RegisteredUserRepository registeredUserRepository;

    public void addRegisteredUser(RegisteredUser player) throws UserExists {
        if(getRegisteredUser(player.getUsername()) != null) {
            throw new UserExists("User With this name already exists");
        }
        registeredUserRepository.save(player);

    }
    public void updateRegisteredUser(RegisteredUser player)  throws UserExists {
        if(getRegisteredUser(player.getUsername()) != null) {
            throw new UserExists("User With this name already exists");
        }
        registeredUserRepository.save(player);

    }
    public void deleteRegisteredUser(String username) {
        registeredUserRepository.delete(username);

    }
    public RegisteredUser getRegisteredUser(String username) {
        return registeredUserRepository.findOne(username);

    }
}

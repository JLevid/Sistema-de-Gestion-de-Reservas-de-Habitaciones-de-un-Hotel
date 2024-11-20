package com.API.JLevid.crud.services;

import com.API.JLevid.crud.models.UserModel;
import com.API.JLevid.crud.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;
    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }
    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }
    public UserModel updateById(UserModel request, Long id){
        UserModel userModel = userRepository.findById(id).get();
        userModel.setNombre_cliente(request.getNombre_cliente());
        userModel.setFecha_inicio(request.getFecha_inicio());
        userModel.setFecha_fin(request.getFecha_fin());
        userModel.setTipo_habitacion(request.getTipo_habitacion());
        userRepository.save(userModel);
        return userModel;
    }
    public Boolean deleteUser (Long id){
        try{
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

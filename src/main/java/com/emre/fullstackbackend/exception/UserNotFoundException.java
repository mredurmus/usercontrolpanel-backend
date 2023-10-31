package com.emre.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super(id +" id'sine sahip bir kullanıcı bulunamadı!");
    }
}

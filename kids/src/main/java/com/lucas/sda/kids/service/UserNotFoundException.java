package com.lucas.sda.kids.service;

public class UserNotFoundException extends RuntimeException {
        public UserNotFoundException (String message) {
            super(message);
        }
}

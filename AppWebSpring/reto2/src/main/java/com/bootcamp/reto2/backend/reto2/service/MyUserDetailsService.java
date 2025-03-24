// package com.bootcamp.reto2.backend.reto2.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.bootcamp.reto2.backend.reto2.models.UserEntity;
// import org.springframework.security.core.userdetails.User;

// import com.bootcamp.reto2.backend.reto2.repository.UserRepository;

// @Service
// public class MyUserDetailsService implements UserDetailsService {

//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         UserEntity user = userRepository.findByUsername(username)
//             .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

//         return User.withUsername(user.getUsername())
//             .password(user.getPassword()) 
//             .roles(user.getRole()) // Asegurar que tiene rol adecuado
//             .build();
        
//     }
// }




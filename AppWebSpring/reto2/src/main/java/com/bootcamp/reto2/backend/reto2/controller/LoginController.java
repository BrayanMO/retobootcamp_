// package com.bootcamp.reto2.backend.reto2.controller;

// import java.io.IOException;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.servlet.ModelAndView;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// @Controller
// public class LoginController {

//     @GetMapping("/login")
//     public ModelAndView login() {
//         return new ModelAndView("login");
//     }

//     @PostMapping("/authenticate")
//     public void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException {
//         response.sendRedirect("/api/hospitales/listar");
//     }

// }

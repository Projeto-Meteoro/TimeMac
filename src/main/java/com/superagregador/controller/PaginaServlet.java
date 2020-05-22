package com.superagregador.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;



@Controller
@WebServlet("/login")
public class PaginaServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    public PaginaServlet(){
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String clienteNome = request.getParameter("nome");
        System.out.println("CLIENTE NOME: " + clienteNome);
        String clienteIdade = request.getParameter("idade");

        Cookie nomeCookie = new Cookie("nomeCookie", clienteNome);
        nomeCookie.setMaxAge(60*60*24*2);
        nomeCookie.setPath("/");
        response.addCookie(nomeCookie);

        Cookie idadeCookie = new Cookie("idadeCookie", clienteIdade);
        nomeCookie.setMaxAge(60*60*24*2);
        nomeCookie.setPath("/");
        response.addCookie(idadeCookie);

        String url ="redirect:/index";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
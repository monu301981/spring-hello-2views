package com.guruapp1.springboot.student_service.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/books")
public class BookController {

    /* 
    @Autowired
    public BookServiceInterface bookService;

    public BookController(BookServiceInterface bookService) {
        this.bookService = bookService;
    }
    

    @GetMapping("/viewbooks1")
    public String viewBooks(Model model) throws IOException {
        //model.addAttribute("books", bookService.getBooks());
        return "view-books";
    }
    */

    @GetMapping("/viewbooks")
    public String viewBooks(Model model) throws IOException {
        model.addAttribute("msg",
                          "a jar packaging example");
        return "view-books";
    }
    
}

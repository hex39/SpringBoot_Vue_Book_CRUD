package com.miku.springboot.controller;

import com.miku.springboot.entity.Book;
import com.miku.springboot.repository.BookRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/book")
public class BookHandler {
    @Resource
    private BookRepository bookRepository;

    @RequestMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page,
                              @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page, size);
        return bookRepository.findAll(request);
    }

    @PostMapping("/save")//前端用json格式传来数据加上了@RequestBody才能转成java对象
    public String save(@RequestBody Book book) {
        Book result = bookRepository.save(book);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id") Integer id) {
        return bookRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book) {
        Book result = bookRepository.save(book);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }

}

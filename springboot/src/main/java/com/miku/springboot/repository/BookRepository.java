package com.miku.springboot.repository;

import com.miku.springboot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
//只需要继承Jpa泛型里面有各种数据库操作方法
public interface BookRepository extends JpaRepository<Book,Integer>{

}

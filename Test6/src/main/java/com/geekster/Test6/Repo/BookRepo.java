package com.geekster.Test6.Repo;

import com.geekster.Test6.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,String> {
}

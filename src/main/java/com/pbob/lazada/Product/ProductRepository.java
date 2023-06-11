package com.pbob.lazada.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//sebagai turunan dari kelas JPA repositury
//dependency string jpa digunakan di sini

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

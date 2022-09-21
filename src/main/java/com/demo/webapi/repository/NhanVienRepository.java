package com.demo.webapi.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.demo.webapi.model.NhanVien;

public interface NhanVienRepository extends MongoRepository<NhanVien, String>{
    // CRUD
    }

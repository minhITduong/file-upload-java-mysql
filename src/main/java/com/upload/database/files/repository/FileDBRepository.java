package com.upload.database.files.repository;

import com.upload.database.files.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB, String> {

}

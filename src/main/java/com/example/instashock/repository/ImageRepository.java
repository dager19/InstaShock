package com.example.instashock.repository;

import com.example.instashock.entity.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository  extends JpaRepository<ImageModel, Long> {

    Optional<ImageModel> findByUserID(Long userID);

    Optional<ImageModel> findByPostID(Long postID);

}

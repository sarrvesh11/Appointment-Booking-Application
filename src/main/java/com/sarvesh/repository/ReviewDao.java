package com.sarvesh.repository;

import com.sarvesh.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDao extends JpaRepository<Review, Integer> {

}

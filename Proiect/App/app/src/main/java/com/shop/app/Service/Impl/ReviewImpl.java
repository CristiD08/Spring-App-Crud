package com.shop.app.Service.Impl;

import com.shop.app.Entity.review;
import com.shop.app.Repository.ReviewRepo;
import com.shop.app.Service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewImpl implements ReviewService {

    ReviewRepo reviewRepo;

    public ReviewImpl(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public String createReview(review review){
        reviewRepo.save(review);
        return "Ok";
    }

    @Override
    public String updateReview(review review){
        reviewRepo.save(review);
        return "Updated";
    }

    @Override
    public String deleteReview(int id_review){
        reviewRepo.deleteById(id_review);
        return "Deleted";
    }

    @Override
    public review getReview(int id_review) {
        return reviewRepo.findById(id_review).get();
    }

    @Override
    public List<review> getAllReviews() {
        return reviewRepo.findAll();
    }
}

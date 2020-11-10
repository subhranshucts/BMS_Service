package com.bms.api.apibms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.api.apibms.entities.LoanDetail;

@Repository
public interface LoanDetailRepository extends JpaRepository<LoanDetail, Long>{

}

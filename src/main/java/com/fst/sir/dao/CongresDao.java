package com.fst.sir.dao;

import com.fst.sir.bean.Congres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongresDao extends JpaRepository<Congres,Long> {
}
package com.companyabc.repository;

import com.companyabc.model.Heading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeadingRepository extends JpaRepository<Heading, Long> {
}

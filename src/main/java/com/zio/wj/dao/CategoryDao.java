package com.zio.wj.dao;

import com.zio.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryDao extends JpaRepository<Category, Integer>, JpaSpecificationExecutor<Category> {
}

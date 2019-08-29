package com.dao;

import com.model.IntermediateTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * jpa接口实现数据库的操作
 *
 * @author dell
 * @date 2019-08-28 14:16
 */
@Transactional
public interface IintermediateTableDao extends JpaRepository<IntermediateTable,Integer>, JpaSpecificationExecutor<IntermediateTable> {
}

package com.dao;

import com.model.OtherPub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * mysql5.5数据测试
 *
 * @author dell
 * @date 2019-08-30 10:17
 */
@Transactional
public interface IotherPubDao extends JpaRepository<OtherPub,Integer>, JpaSpecificationExecutor<OtherPub> {
}

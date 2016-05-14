/**
 *
 */
package com.dmm.framework.modules.gen.dao;

import com.dmm.framework.common.persistence.CrudDao;
import com.dmm.framework.common.persistence.annotation.MyBatisDao;
import com.dmm.framework.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}

/**
 *
 */
package com.dmm.framework.modules.sys.dao;

import com.dmm.framework.common.persistence.TreeDao;
import com.dmm.framework.common.persistence.annotation.MyBatisDao;
import com.dmm.framework.modules.sys.entity.Office;

/**
 * 机构DAO接口
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}

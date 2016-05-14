/**
 *
 */
package com.dmm.framework.modules.sys.dao;

import com.dmm.framework.common.persistence.TreeDao;
import com.dmm.framework.common.persistence.annotation.MyBatisDao;
import com.dmm.framework.modules.sys.entity.Area;

/**
 * 区域DAO接口
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {

}

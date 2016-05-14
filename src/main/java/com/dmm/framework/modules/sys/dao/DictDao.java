/**
 *
 */
package com.dmm.framework.modules.sys.dao;

import java.util.List;

import com.dmm.framework.common.persistence.CrudDao;
import com.dmm.framework.common.persistence.annotation.MyBatisDao;
import com.dmm.framework.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
	public List<Dict> findIntegral(Dict dict);
	
}

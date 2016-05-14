/**
 *
 */
package com.dmm.framework.modules.sys.service;

import java.util.List;

import com.dmm.framework.common.utils.CacheUtils;
import com.dmm.framework.modules.sys.dao.DictDao;
import com.dmm.framework.modules.sys.utils.DictUtils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmm.framework.common.persistence.Page;
import com.dmm.framework.common.service.CrudService;
import com.dmm.framework.modules.sys.entity.Dict;

/**
 * 字典Service
 */
@Service
@Transactional(readOnly = true)
public class DictService extends CrudService<DictDao, Dict> {
	
	/**
	 * 查询字段类型列表
	 * @return
	 */
	public List<String> findTypeList(){
		return dao.findTypeList(new Dict());
	}

	@Transactional(readOnly = false)
	public void save(Dict dict) {
		super.save(dict);
		CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
	}

	@Transactional(readOnly = false)
	public void delete(Dict dict) {
		super.delete(dict);
		CacheUtils.remove(DictUtils.CACHE_DICT_MAP);
	}

	public List<Dict> findIntegral(){
		return dao.findIntegral(new Dict());
	}
	

	public Page<Dict> findPageIntegral(Page<Dict> page, Dict dict) {
		dict.setPage(page);
		page.setList(dao.findIntegral(dict));
		return page;
	}
}

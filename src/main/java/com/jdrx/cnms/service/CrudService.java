package com.jdrx.cnms.service;

import com.jdrx.cnms.bean.entity.BaseEntity;
import com.jdrx.cnms.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Service基类
 */
@Transactional(readOnly = true)
public abstract class CrudService<D extends BaseDao<T>, T extends BaseEntity>  {
	
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(Long id) {
		return dao.getById(id);
	}
	
	/**
	 * 查询列表数据
	 * @param entity
	 * @return
	 */
	public List<T> findList(Map<String,Object> entity) {
		return dao.listBy(entity);
	}

	/**
	 * 保存数据（插入或更新）
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void save(T entity) {
		if (entity.isNewReord()){
			entity.preInsert();
			dao.insert(entity);
		}else{
			entity.preUpdate();
			dao.update(entity);
		}
	}
	
	/**
	 * 删除数据
	 * @param id
	 */
	@Transactional(readOnly = false)
	public void delete(Long id) {
		dao.deleteById(id);
	}
}

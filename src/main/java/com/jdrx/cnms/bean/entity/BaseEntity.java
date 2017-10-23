package com.jdrx.cnms.bean.entity;

import java.io.Serializable;

/**
 * 立方体模型Entity
 * @author jml
 * @version 2017-05-15
 */
public interface BaseEntity extends Serializable{
	/**
	 * 是否为新增数据
	 * @return
	 */
	public boolean isNewReord();

	/**
	 * 新增数据预处理
	 */
	public void preInsert();

	/**
	 * 修改数据预处理
	 */
	public void preUpdate();
}
package com.atguigu.springboot.service;

import java.util.List;
import java.util.Map;

public interface MarryService {
	/**
	 * 根据客户名称查询企业信息
	 * 
	 * @param
	 * @return
	 * @author 
	 */
	public Map<String, Object> corpList(String name);
	
	/**
	 * 查询中心节点关系信息
	 * 
	 * @param params
	 * @return
	 * @author 
	 */
	public List<Map<String, Object>> ralaList(Map<String, Object> params);
	
	/**
	 * 根据id查询企业信息
	 * 
	 * @param id
	 * @return
	 * @author 
	 */
	public Map<String, Object> corpListById(String id);
	
	/**
	 * 根据核心编号list查询企业信息
	 * 
	 * @param
	 * @return
	 * @author 
	 */
	public List<Map<String, Object>> corpList(List<Integer> uuid);
	
	/**
	 * 查询外层节点相关关系信息
	 * 
	 * @param params
	 * @return
	 * @author 
	 */
	public List<Map<String, Object>> ralaListOut(Map<String, Object> params);

	/**
	 * 根据id查询关系数量
	 * 
	 * @param
	 * @return
	 * @author 
	 */
	public int getRelaCount(int id, String rela);
	
}

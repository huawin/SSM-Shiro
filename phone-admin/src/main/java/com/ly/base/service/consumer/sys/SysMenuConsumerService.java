package com.ly.base.service.consumer.sys;

import com.ly.base.core.model.sys.SysMenu;
import com.ly.base.common.model.Json;
import java.util.List;
import com.ly.base.common.model.Model;

/**
 * 日志记录,处理返回结果,缓存特殊数据
 * @author LeiYong
 * @date 2016年10月04日
 */
public interface SysMenuConsumerService {

	/**
	 * 通过主键查询
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json getByPk(String pk);
	/**
	 * 通过主键删除
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json deleteByPk(String pk);
	/**
	 * 通过主键批量删除
	 * 
	 * @param pks
	 * @return
	 */ 
	public Json deleteByBatch(String... pks);
	/**
	 * 通过主键启用
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json enable(String updateBy,String pk);
	/**
	 * 通过主键禁用
	 * 
	 * @param pk
	 * @return
	 */ 
	public Json disable(String updateBy,String pk);
	/**
	 * 通过主键批量启用
	 * 
	 * @param pks
	 * @return
	 */ 
	public Json enables(String updateBy,String... pks);
	/**
	 * 通过主键批量禁用
	 * 
	 * @param pks
	 * @return
	 */ 
	public Json disables(String updateBy,String... pks);
	/**
	 * 新增记录
	 * 
	 * @param data
	 * @return
	 */ 
	public Json insert(SysMenu data);
	/**
	 * 批量新增
	 * 
	 * @param list
	 * @return
	 */ 
	public Json insertBatch(List<SysMenu> list);
	/**
	 * 更新记录
	 * 
	 * @param data
	 * @return
	 */ 
	public Json update(SysMenu data);
	/**
	 * 分页查询
	 * 
	 * @param queryInfo
	 * @param pageNum
	 * @param pageSize
	 * @param orderBy
	 * @return
	 */ 
	public Json findByPage(SysMenu queryInfo, int pageNum, int pageSize,String orderBy);
	/**
	 * 查询所有
	 * 
	 * @param queryInfo
	 * @param orderBy
	 * @return
	 */ 
	public Json findAll(SysMenu queryInfo, String orderBy);
	/**
	 * 分页查询
	 * 
	 * @param conditions
	 * @param pageNum
	 * @param pageSize
	 * @param orderBy
	 * @return
	 */ 
	public Json findByPage(List<Model> conditions, int pageNum, int pageSize, String order);
	/**
	 * 查询所有
	 * 
	 * @param conditions
	 * @param orderBy
	 * @return
	 */ 
	public Json findAll(List<Model> conditions, String orderBy);
	/**
	 * 查询用户的菜单
	 * @param rolePk
	 * @return
	 */
	Json findAllMenuByRole(Integer rolePk);
	/**
	 * 查询用户的功能
	 * @param rolePk
	 * @return
	 */
	Json findAllFuncByRole(Integer rolePk);
	/**
	 * 查询用户的功能按钮归组为String
	 * 如:[{01:show,edit,del},{02:show,edit,del}]
	 * @param rolePk
	 * @param menuType //取消参数,避免只有访问权限的情况
	 * @return
	 */
	Json findAllFuncStringByRole(Integer rolePk);
}
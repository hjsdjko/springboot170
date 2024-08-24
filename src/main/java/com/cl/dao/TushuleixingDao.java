package com.cl.dao;

import com.cl.entity.TushuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TushuleixingView;


/**
 * 图书类型
 * 
 * @author 
 * @email 
 * @date 2024-03-12 19:59:44
 */
public interface TushuleixingDao extends BaseMapper<TushuleixingEntity> {
	
	List<TushuleixingView> selectListView(@Param("ew") Wrapper<TushuleixingEntity> wrapper);

	List<TushuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<TushuleixingEntity> wrapper);
	
	TushuleixingView selectView(@Param("ew") Wrapper<TushuleixingEntity> wrapper);
	

}

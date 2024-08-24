package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TushuleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TushuleixingView;


/**
 * 图书类型
 *
 * @author 
 * @email 
 * @date 2024-03-12 19:59:44
 */
public interface TushuleixingService extends IService<TushuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuleixingView> selectListView(Wrapper<TushuleixingEntity> wrapper);
   	
   	TushuleixingView selectView(@Param("ew") Wrapper<TushuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuleixingEntity> wrapper);
   	

}


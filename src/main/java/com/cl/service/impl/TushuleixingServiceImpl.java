package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.TushuleixingDao;
import com.cl.entity.TushuleixingEntity;
import com.cl.service.TushuleixingService;
import com.cl.entity.view.TushuleixingView;

@Service("tushuleixingService")
public class TushuleixingServiceImpl extends ServiceImpl<TushuleixingDao, TushuleixingEntity> implements TushuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuleixingEntity> page = this.selectPage(
                new Query<TushuleixingEntity>(params).getPage(),
                new EntityWrapper<TushuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuleixingEntity> wrapper) {
		  Page<TushuleixingView> page =new Query<TushuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TushuleixingView> selectListView(Wrapper<TushuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuleixingView selectView(Wrapper<TushuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

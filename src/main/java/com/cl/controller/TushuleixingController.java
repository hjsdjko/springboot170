package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.TushuleixingEntity;
import com.cl.entity.view.TushuleixingView;

import com.cl.service.TushuleixingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 图书类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 19:59:44
 */
@RestController
@RequestMapping("/tushuleixing")
public class TushuleixingController {
    @Autowired
    private TushuleixingService tushuleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TushuleixingEntity tushuleixing,
		HttpServletRequest request){
        EntityWrapper<TushuleixingEntity> ew = new EntityWrapper<TushuleixingEntity>();

		PageUtils page = tushuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TushuleixingEntity tushuleixing, 
		HttpServletRequest request){
        EntityWrapper<TushuleixingEntity> ew = new EntityWrapper<TushuleixingEntity>();

		PageUtils page = tushuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TushuleixingEntity tushuleixing){
       	EntityWrapper<TushuleixingEntity> ew = new EntityWrapper<TushuleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tushuleixing, "tushuleixing")); 
        return R.ok().put("data", tushuleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TushuleixingEntity tushuleixing){
        EntityWrapper< TushuleixingEntity> ew = new EntityWrapper< TushuleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tushuleixing, "tushuleixing")); 
		TushuleixingView tushuleixingView =  tushuleixingService.selectView(ew);
		return R.ok("查询图书类型成功").put("data", tushuleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TushuleixingEntity tushuleixing = tushuleixingService.selectById(id);
		tushuleixing = tushuleixingService.selectView(new EntityWrapper<TushuleixingEntity>().eq("id", id));
        return R.ok().put("data", tushuleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TushuleixingEntity tushuleixing = tushuleixingService.selectById(id);
		tushuleixing = tushuleixingService.selectView(new EntityWrapper<TushuleixingEntity>().eq("id", id));
        return R.ok().put("data", tushuleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TushuleixingEntity tushuleixing, HttpServletRequest request){
    	tushuleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuleixing);
        tushuleixingService.insert(tushuleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TushuleixingEntity tushuleixing, HttpServletRequest request){
    	tushuleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuleixing);
        tushuleixingService.insert(tushuleixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TushuleixingEntity tushuleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tushuleixing);
        tushuleixingService.updateById(tushuleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tushuleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}

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
import com.cl.entity.OrdersEntity;
import com.cl.service.OrdersService;
import com.cl.utils.UserBasedCollaborativeFiltering;

import com.cl.entity.TushuxinxiEntity;
import com.cl.entity.view.TushuxinxiView;

import com.cl.service.TushuxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 图书信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 19:59:44
 */
@RestController
@RequestMapping("/tushuxinxi")
public class TushuxinxiController {
    @Autowired
    private TushuxinxiService tushuxinxiService;

    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TushuxinxiEntity tushuxinxi,
		HttpServletRequest request){
        EntityWrapper<TushuxinxiEntity> ew = new EntityWrapper<TushuxinxiEntity>();

		PageUtils page = tushuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TushuxinxiEntity tushuxinxi, 
		HttpServletRequest request){
        EntityWrapper<TushuxinxiEntity> ew = new EntityWrapper<TushuxinxiEntity>();

		PageUtils page = tushuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TushuxinxiEntity tushuxinxi){
       	EntityWrapper<TushuxinxiEntity> ew = new EntityWrapper<TushuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tushuxinxi, "tushuxinxi")); 
        return R.ok().put("data", tushuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TushuxinxiEntity tushuxinxi){
        EntityWrapper< TushuxinxiEntity> ew = new EntityWrapper< TushuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tushuxinxi, "tushuxinxi")); 
		TushuxinxiView tushuxinxiView =  tushuxinxiService.selectView(ew);
		return R.ok("查询图书信息成功").put("data", tushuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TushuxinxiEntity tushuxinxi = tushuxinxiService.selectById(id);
		tushuxinxi.setClicknum(tushuxinxi.getClicknum()+1);
		tushuxinxiService.updateById(tushuxinxi);
		tushuxinxi = tushuxinxiService.selectView(new EntityWrapper<TushuxinxiEntity>().eq("id", id));
        return R.ok().put("data", tushuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TushuxinxiEntity tushuxinxi = tushuxinxiService.selectById(id);
		tushuxinxi.setClicknum(tushuxinxi.getClicknum()+1);
		tushuxinxiService.updateById(tushuxinxi);
		tushuxinxi = tushuxinxiService.selectView(new EntityWrapper<TushuxinxiEntity>().eq("id", id));
        return R.ok().put("data", tushuxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        TushuxinxiEntity tushuxinxi = tushuxinxiService.selectById(id);
        if(type.equals("1")) {
        	tushuxinxi.setThumbsupnum(tushuxinxi.getThumbsupnum()+1);
        } else {
        	tushuxinxi.setCrazilynum(tushuxinxi.getCrazilynum()+1);
        }
        tushuxinxiService.updateById(tushuxinxi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TushuxinxiEntity tushuxinxi, HttpServletRequest request){
    	tushuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuxinxi);
        tushuxinxiService.insert(tushuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TushuxinxiEntity tushuxinxi, HttpServletRequest request){
    	tushuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuxinxi);
        tushuxinxiService.insert(tushuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TushuxinxiEntity tushuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tushuxinxi);
        tushuxinxiService.updateById(tushuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tushuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TushuxinxiEntity tushuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<TushuxinxiEntity> ew = new EntityWrapper<TushuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = tushuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuxinxi), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 协同算法（基于用户的协同算法）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,TushuxinxiEntity tushuxinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>());
        Map<String, Map<String, Double>> ratings = new HashMap<>();
        if(orders!=null && orders.size()>0) {
            for(OrdersEntity o : orders) {
                Map<String, Double> userRatings = null;
                if(ratings.containsKey(o.getUserid().toString())) {
                    userRatings = ratings.get(o.getUserid().toString());
                } else {
                    userRatings = new HashMap<>();
                    ratings.put(o.getUserid().toString(), userRatings);
                }
                if(userRatings.containsKey(o.getGoodid().toString())) {
                    userRatings.put(o.getGoodid().toString(), userRatings.get(o.getGoodid().toString())+1.0);
                } else {
                    userRatings.put(o.getGoodid().toString(), 1.0);
                }

            }
        }
        // 创建协同过滤对象
        UserBasedCollaborativeFiltering filter = new UserBasedCollaborativeFiltering(ratings);

        // 为指定用户推荐物品
        String targetUser = userId;
        int numRecommendations = limit;
        List<String> recommendations = filter.recommendItems(targetUser, numRecommendations);

        // 输出推荐结果
        System.out.println("Recommendations for " + targetUser + ":");
        for (String item : recommendations) {
            System.out.println(item);
        }

        EntityWrapper<TushuxinxiEntity> ew = new EntityWrapper<TushuxinxiEntity>();
        ew.in("id", recommendations);
        if(recommendations!=null && recommendations.size()>0) {
            ew.last("order by FIELD(id, "+String.join(",", recommendations)+")");
        }

        PageUtils page = tushuxinxiService.queryPage(params, ew);
        List<TushuxinxiEntity> pageList = (List<TushuxinxiEntity>)page.getList();
        if(pageList.size()<limit) {
            int toAddNum = limit-pageList.size();
            ew = new EntityWrapper<TushuxinxiEntity>();
            ew.notIn("id", recommendations);
            ew.orderBy("id", false);
            ew.last("limit "+toAddNum);
            pageList.addAll(tushuxinxiService.selectList(ew));
        } else if(pageList.size()>limit) {
            pageList = pageList.subList(0, limit);
        }
        page.setList(pageList);

        return R.ok().put("data", page);
    }







}

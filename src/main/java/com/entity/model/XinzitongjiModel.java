package com.entity.model;

import com.entity.XinzitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 薪资统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public class XinzitongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 薪资
	 */
	
	private String xinzi;
		
	/**
	 * 登记
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengji;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：薪资
	 */
	 
	public void setXinzi(String xinzi) {
		this.xinzi = xinzi;
	}
	
	/**
	 * 获取：薪资
	 */
	public String getXinzi() {
		return xinzi;
	}
				
	
	/**
	 * 设置：登记
	 */
	 
	public void setDengji(Date dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：登记
	 */
	public Date getDengji() {
		return dengji;
	}
			
}

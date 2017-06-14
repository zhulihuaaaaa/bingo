package bingo.news.domain;

import java.util.Date;

/**
 * 用户模块实体类
 * @author zhulihua
 *
 */

public class static_user {
	
	 private int newsId;
     private String newsTitle;
     private String url;
     private String picUrl;
     private int width;
     private int height;
     private Date addTime;
     private int categoryId;
     private String categoryName;
     private String newsContent;
   
	
	public int getNewsId() {
		return newsId;
	}


	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}


	public String getNewsTitle() {
		return newsTitle;
	}


	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getPicUrl() {
		return picUrl;
	}


	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public Date getAddTime() {
		return addTime;
	}


	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getNewsContent() {
		return newsContent;
	}


	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}


	@Override
	public String toString() {
		return "{\"newsId\":\"" + newsId + "\",\"newsTitle\":\"" + newsTitle + "\",\"url\":\"" + url
				+ "\",\"picUrl\":\"" + picUrl + "\",\"width\":\"" + width + "\",\"height\":\"" + height
				+ "\",\"addTime\":\"" + addTime + "\",\"categoryId\":\"" + categoryId + "\",\"categoryName\":\""
				+ categoryName + "\",\"newsContent\":\"" + newsContent + "\"}  ";
	}
     
}

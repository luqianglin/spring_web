package cn.et.service;

import java.util.List;

import cn.et.Tools.PageTools;
import cn.et.entity.MyNews;

/**
 * 业务逻辑处理接口
 * @author Administrator
 *
 */
public interface NewsService {
	/**
	 * 根据内容 模糊查询
	 * @param content 新闻内容
	 * @return 返回新闻列表
	 * @throws Exception 
	 */
	public PageTools queryNewsByContent(String content,Integer curPage);
	public void addNews(String title,String content);
	public void updateNews(String newid,String title,String content);
	public void deleteNews(String newid);
}

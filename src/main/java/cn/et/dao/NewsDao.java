package cn.et.dao;

import java.util.List;

import cn.et.Tools.PageTools;
import cn.et.entity.MyNews;


/**
 * 处理数据的接口
 * @author Administrator
 *
 */
public interface NewsDao {
	/**
	 * 查询所有新闻 
	 * @return 返回新闻列表
	 */
	public List<MyNews> queryAll();
	
		
	/**
	 * 根据内容 模糊查询
	 * @param content 新闻内容
	 * @return 返回新闻列表
	 * @throws Exception 
	 */
	public PageTools queryNewsByContent(String content,Integer curPage);
	
	/**
	 * 添加新闻
	 * @param 
	 * @throws Exception
	 */
	public void addNews(String title,String content);
	/**
	 * 修改新闻
	 * @param newid
	 * @param title
	 * @param content
	 */
	public void updateNews(String newid,String title,String content);
	/**
	 * 删除新闻
	 * @param newid
	 */
	public void deleteNews(String newid);
	
}

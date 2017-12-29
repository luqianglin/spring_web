package cn.et.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.Tools.PageTools;
import cn.et.dao.NewsDao;
import cn.et.entity.MyNews;
import cn.et.service.NewsService;
/**
 * 业务逻辑处理层
 * @author Administrator
 *
 */
@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao dao;
	public PageTools queryNewsByContent(String content,Integer curPage) {
		if(content==null){
			content="";
		}
		return dao.queryNewsByContent(content,curPage);
	}
	public void addNews(String title,String content){
		dao.addNews(title, content);
	}
	public void updateNews(String newid,String title,String content){
		dao.updateNews(newid, title, content);
	}
	public void deleteNews(String newid){
		dao.deleteNews(newid);
	}


}

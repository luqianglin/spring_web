package cn.et.service;

import java.util.List;

import cn.et.Tools.PageTools;
import cn.et.entity.MyNews;

/**
 * ҵ���߼�����ӿ�
 * @author Administrator
 *
 */
public interface NewsService {
	/**
	 * �������� ģ����ѯ
	 * @param content ��������
	 * @return ���������б�
	 * @throws Exception 
	 */
	public PageTools queryNewsByContent(String content,Integer curPage);
	public void addNews(String title,String content);
	public void updateNews(String newid,String title,String content);
	public void deleteNews(String newid);
}

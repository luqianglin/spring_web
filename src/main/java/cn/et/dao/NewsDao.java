package cn.et.dao;

import java.util.List;

import cn.et.Tools.PageTools;
import cn.et.entity.MyNews;


/**
 * �������ݵĽӿ�
 * @author Administrator
 *
 */
public interface NewsDao {
	/**
	 * ��ѯ�������� 
	 * @return ���������б�
	 */
	public List<MyNews> queryAll();
	
		
	/**
	 * �������� ģ����ѯ
	 * @param content ��������
	 * @return ���������б�
	 * @throws Exception 
	 */
	public PageTools queryNewsByContent(String content,Integer curPage);
	
	/**
	 * �������
	 * @param 
	 * @throws Exception
	 */
	public void addNews(String title,String content);
	/**
	 * �޸�����
	 * @param newid
	 * @param title
	 * @param content
	 */
	public void updateNews(String newid,String title,String content);
	/**
	 * ɾ������
	 * @param newid
	 */
	public void deleteNews(String newid);
	
}

package cn.et.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.Tools.PageTools;
import cn.et.dao.NewsDao;
import cn.et.entity.MyNews;
/**
 * ���ݲ���
 * @author Administrator
 *
 */

@Repository
public class NewsDaoImpl implements NewsDao {
	@Autowired
	private JdbcTemplate jdbc;
	/**
	 * ��ȡ������
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public Integer getTableListCount(String name){
		if(name==null){
			name="";
		}
		String sql="select count(*) as cr from mynews where content like '%"+name+"%'";
		List<Map<String, Object>> result= jdbc.queryForList(sql);
		return Integer.parseInt(result.get(0).get("CR").toString());
	}
	/**
	 * ģ�����ҷ�ҳ
	 * @throws Exception 
	 */
	public PageTools queryNewsByContent(String content,Integer curPage){
		Integer totalCount=getTableListCount(content);
		PageTools pt=new PageTools(curPage, totalCount, null);
		
		String sql="select * from mynews limit "+(pt.getStartIndex()-1)+","+pt.getPageCount();
		List<MyNews> result=jdbc.query(sql,new BeanPropertyRowMapper<MyNews>(MyNews.class));
		pt.setData(result);
		
		return pt;
	}

	/**
	 *  ��ѯ��������
	 */
	public List<MyNews> queryAll() {
		String sql="select newid,title,content from mynews";
		
		List<MyNews> list=jdbc.query(sql,new BeanPropertyRowMapper<MyNews>(MyNews.class));
		return list;
		
	}
	/**
	 * ģ����ѯ����
	 */
	public List<MyNews> queryNewsByContent(String content) {
		if(content==null){
			content="";
		}
		String sql="select newid,title,content from mynews where content like '%"+content+"%'";
		List<MyNews>  list=jdbc.query(sql, new BeanPropertyRowMapper<MyNews>(MyNews.class));
		return list;
	}
	/**
	 * ���
	 * @param 
	 * @throws Exception
	 */
	public void addNews(String title,String content){
		String sql="insert into mynews (title,content) values ('"+title+"','"+content+"')";
		jdbc.execute(sql);
	}
	/**
	 * �޸�����
	 * @param newid
	 * @param title
	 * @param content
	 */
	public void updateNews(String newid,String title,String content){
		String sql="update mynews set title='"+title+"',content='"+content+"' where newid="+newid;
		jdbc.execute(sql);
	}
	/**
	 * ɾ��
	 */
	public void deleteNews(String newid) {
		String sql="delete from  mynews where newid="+newid;
		jdbc.execute(sql);
		
	}

}

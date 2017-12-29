package cn.et.entity;

public class MyNews {
	/**
	 * 新闻编号
	 */
	private int newid;
	/**
	 * 新闻标题
	 */
	private String title;
	/**
	 * 新闻内容
	 */
	private String content;
	
	public MyNews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyNews(int newid, String title, String content) {
		super();
		this.newid = newid;
		this.title = title;
		this.content = content;
	}

	public int getNewid() {
		return newid;
	}

	public void setNewid(int newid) {
		this.newid = newid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}

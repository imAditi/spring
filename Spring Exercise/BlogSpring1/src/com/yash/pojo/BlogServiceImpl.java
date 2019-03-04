package com.yash.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl {
	
	

	@Autowired
	private BlogDaoServiceImpl blogDaoServiceImpl;

	public boolean save(Blog blog) {
		boolean result = false;
		result = blogDaoServiceImpl.insert(blog);
		return result;
	}
	
	public boolean delete(int id) {
		return blogDaoServiceImpl.delete(id);
	}
	
	public List<Blog> lisBlogs() {
		return blogDaoServiceImpl.BlogList();
	}
	
	public boolean update(Blog blog) {
		return blogDaoServiceImpl.update(blog);
	}

}

package com.yash.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDaoServiceImpl {

	
	@Autowired
	public BlogRepository blogRepository;

	public boolean insert(Blog blog) {

		boolean result = false;
		if (blog != null) {
			blogRepository.getBlogList().add(blog);
			return result;
		}
		return result;
	}
	public boolean update(Blog blog) {
		int id;
		boolean deleteresult = false;
		boolean status = false;
		id = blog.getId();
		deleteresult = delete(id);
		if (deleteresult == true) {
			
			status = blogRepository.getBlogList().add(blog);
			return status;
		}

		return deleteresult;

	}
	
	public boolean delete(int id) {
		boolean result = false;
		Blog blog = new Blog();
		blog = getBlogbyId(id);
		result = blogRepository.getBlogList().remove(blog);
		return result;
		
	}

	public List<Blog> BlogList() {

		return blogRepository.getBlogList();
	}
	
	public Blog getBlogbyId(int id) {
		Blog blog = new Blog();
		List<Blog> bloglist = blogRepository.getBlogList();
		for (Blog blog2 : bloglist) {
			if(blog2.getId()==id) {
				blog=blog2;
				return blog;
			}
			
			
		}
		return blog;
	}

}

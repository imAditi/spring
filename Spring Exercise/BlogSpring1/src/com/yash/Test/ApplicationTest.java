package com.yash.Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.pojo.Blog;
import com.yash.pojo.BlogServiceImpl;


public class ApplicationTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Blog blog = new Blog();
		blog.setId(101);
		blog.setTitle("This is title");
		blog.setBody("This is body");
		blog.setDescription("This is Description");
		BlogServiceImpl blogServiceImpl = context.getBean("blogServiceImpl",BlogServiceImpl.class);
		blogServiceImpl.save(blog);
		List<Blog> blogList = blogServiceImpl.lisBlogs();
		for (Blog blog2 : blogList) {
			System.out.println(blog2.getId()+""+blog2.getTitle()+""+blog2.getBody()+""+blog2.getDescription());
			
		}
		blogServiceImpl.delete(100);
		System.out.println("After deletion");
		List<Blog> blogList1 = blogServiceImpl.lisBlogs();
		for (Blog blog2 : blogList1) {
			System.out.println(blog2.getId()+""+blog2.getTitle()+""+blog2.getBody()+""+blog2.getDescription());
			
		}
		
		Blog blog0 = new Blog();
		blog0.setId(1);
		blog0.setTitle("Updated");
		blog0.setBody("After Updated");
		blog0.setDescription("Description");
		blogServiceImpl.update(blog0);
		System.out.println("After updation");
		List<Blog> blogList2 = blogServiceImpl.lisBlogs();
		for (Blog blog2 : blogList2) {
			System.out.println(blog2.getId()+""+blog2.getTitle()+""+blog2.getBody()+""+blog2.getDescription());
			
		}
		
		
	}

}

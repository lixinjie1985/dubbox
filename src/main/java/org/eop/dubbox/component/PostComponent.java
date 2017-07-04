package org.eop.dubbox.component;

import org.eop.dubbox.entity.Post;
import org.eop.dubbox.service.rest.PostService;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author lixinjie
 * @since 
 */
@Component
public class PostComponent {

	@Reference
	private PostService postService;
	
	public Post getCmp(String id, String name) {
		return postService.getPost(id, name);
	}
}

package org.eop.dubbox.service.rest.impl;

import org.eop.dubbox.entity.Post;
import org.eop.dubbox.service.rest.PostService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author lixinjie
 * @since 
 */
@Service
public class PostServiceImpl implements PostService {

	@Override
	public Post getPost(String id, String name) {
		return new Post(id, name);
	}

}

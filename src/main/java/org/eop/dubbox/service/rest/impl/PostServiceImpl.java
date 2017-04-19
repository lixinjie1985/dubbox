package org.eop.dubbox.service.rest.impl;

import org.eop.dubbox.entity.Post;
import org.eop.dubbox.service.rest.PostService;

/**
 * @author lixinjie
 * @since 
 */
@org.springframework.stereotype.Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=org.eop.dubbox.service.rest.PostService.class, protocol={"rest", "dubbo"})
public class PostServiceImpl implements PostService {

	@Override
	public Post getPost(String id, String name) {
		return new Post(id, name);
	}

}

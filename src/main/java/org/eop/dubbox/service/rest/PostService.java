package org.eop.dubbox.service.rest;

import org.eop.dubbox.entity.Post;

/**
 * @author lixinjie
 * @since 2017-04-17
 */
public interface PostService {

	public Post getPost(String id, String name);
}

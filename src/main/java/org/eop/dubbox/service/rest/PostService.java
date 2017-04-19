package org.eop.dubbox.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eop.dubbox.entity.Post;

/**
 * @author lixinjie
 * @since 2017-04-17
 */
@Path("/posts")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface PostService {

	@GET
	@Path("/post/{id}/{name}")
	public Post getPost(@PathParam("id")String id, @PathParam("name")String name);
}

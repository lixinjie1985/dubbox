package org.eop.dubbox.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eop.dubbox.entity.User;

/**
 * @author lixinjie
 * @since 2017-04-17
 */
@Path("/users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
public interface UserService {

	@GET
	@Path("/user/{id}")
	public User getUser(@PathParam("id")String id, @QueryParam("name")String name, @QueryParam("sex")@DefaultValue("男")String sex, @QueryParam("age")int age);
}

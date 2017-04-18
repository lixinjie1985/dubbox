package org.eop.dubbox.service.rest.impl;

import org.eop.dubbox.entity.User;
import org.eop.dubbox.service.rest.UserService;

/**
 * @author lixinjie
 * @since 2017-04-17
 */
public class UserServiceImpl implements UserService {

	@Override
	public User getUser(String id, String name, String sex, int age) {
		return new User(id, name, sex, age);
	}

}

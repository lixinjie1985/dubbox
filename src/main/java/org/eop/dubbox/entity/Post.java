package org.eop.dubbox.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author lixinjie
 * @since 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="postId")
	private String id;
	@XmlElement(name="postName")
	private String name;
	
	public Post() {
		super();
	}

	public Post(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + "]";
	}
	
}

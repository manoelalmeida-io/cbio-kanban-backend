package com.cbio.cambam.backend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String githubUsername;
}
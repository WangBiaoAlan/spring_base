package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class User implements Serializable{
	private int userId;

	private String userName;

	private String password;

	private int credits;

	private String lastIp;

	private Date lastVisit;

}

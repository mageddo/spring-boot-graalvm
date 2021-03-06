package com.mageddo.micronaut.entity;

import io.micronaut.core.annotation.TypeHint;
import org.springframework.jdbc.core.RowMapper;

@TypeHint
public class FruitEntity {

	private String name;

	public static RowMapper<FruitEntity> mapper() {
		return (rs, rowNum) -> new FruitEntity()
			.setName(rs.getString("NAM_FRUIT"))
			;
	}

	public String getName() {
		return name;
	}

	public FruitEntity setName(String name) {
		this.name = name;
		return this;
	}
}

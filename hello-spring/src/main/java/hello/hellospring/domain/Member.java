package hello.hellospring.domain;

import io.micrometer.observation.transport.Propagator.Getter;

public class Member {

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

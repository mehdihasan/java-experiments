package me.mh.random;

import java.time.LocalDateTime;

public class EmergencyState {
	private Long id;
	private String name;
	private String content;
	private String type;
	private String sentTo; // value = students,staffs,family (comma separated string)
	private LocalDateTime activatedAt;
	private LocalDateTime deactivatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSentTo() {
		return sentTo;
	}
	public void setSentTo(String sentTo) {
		this.sentTo = sentTo;
	}
	public LocalDateTime getActivatedAt() {
		return activatedAt;
	}
	public void setActivatedAt(LocalDateTime activatedAt) {
		this.activatedAt = activatedAt;
	}
	public LocalDateTime getDeactivatedAt() {
		return deactivatedAt;
	}
	public void setDeactivatedAt(LocalDateTime deactivatedAt) {
		this.deactivatedAt = deactivatedAt;
	}
}

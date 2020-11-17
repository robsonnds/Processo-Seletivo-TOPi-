package io.topi.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItensVO implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -461472269670426639L;

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("node_id")
	private String nodeId;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("full_name")
	private String fullName;
	
	@JsonProperty("private")
	private Boolean privateRetorno;

	private OwnerVO owner;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nodeId
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the privateRetorno
	 */
	public Boolean getPrivateRetorno() {
		return privateRetorno;
	}

	/**
	 * @param privateRetorno the privateRetorno to set
	 */
	public void setPrivateRetorno(Boolean privateRetorno) {
		this.privateRetorno = privateRetorno;
	}

	/**
	 * @return the owner
	 */
	public OwnerVO getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(OwnerVO owner) {
		this.owner = owner;
	}
	
}

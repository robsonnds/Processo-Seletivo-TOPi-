package io.topi.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OwnerVO implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = -7006541630986133621L;

	private String login;
	
	private Long id;
	
	@JsonProperty("node_id")
	private String nodeId;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;
	
	@JsonProperty("gravatar_id")
	private String gravatarId;
	
	private String url;
	
	@JsonProperty("html_url")
	private String htmlUrl;
	
	@JsonProperty("followers_url")
	private String followersUrl;
	
	@JsonProperty("following_url")
	private String followingUrl;
	
	@JsonProperty("gists_url")
	private String gistsUrl;
	
	@JsonProperty("starred_url")
	private String starredUrl;
	
	@JsonProperty("subscriptions_url")
	private String subscriptionsUrl;
	
	@JsonProperty("organizations_url")
	private String organizationsUrl;
	
	@JsonProperty("repos_url")
	private String reposUrl;
	
	@JsonProperty("events_url")
	private String eventsUrl;
	
	@JsonProperty("received_events_url")
	private String receivedEventsUrl;
	
	private String type;
	
	@JsonProperty("site_admin")
	private Boolean siteAdmin;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

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
	 * @return the avatarUrl
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}

	/**
	 * @param avatarUrl the avatarUrl to set
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	/**
	 * @return the gravatarId
	 */
	public String getGravatarId() {
		return gravatarId;
	}

	/**
	 * @param gravatarId the gravatarId to set
	 */
	public void setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the htmlUrl
	 */
	public String getHtmlUrl() {
		return htmlUrl;
	}

	/**
	 * @param htmlUrl the htmlUrl to set
	 */
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	/**
	 * @return the followersUrl
	 */
	public String getFollowersUrl() {
		return followersUrl;
	}

	/**
	 * @param followersUrl the followersUrl to set
	 */
	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}

	/**
	 * @return the followingUrl
	 */
	public String getFollowingUrl() {
		return followingUrl;
	}

	/**
	 * @param followingUrl the followingUrl to set
	 */
	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}

	/**
	 * @return the gistsUrl
	 */
	public String getGistsUrl() {
		return gistsUrl;
	}

	/**
	 * @param gistsUrl the gistsUrl to set
	 */
	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}

	/**
	 * @return the starredUrl
	 */
	public String getStarredUrl() {
		return starredUrl;
	}

	/**
	 * @param starredUrl the starredUrl to set
	 */
	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}

	/**
	 * @return the subscriptionsUrl
	 */
	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	/**
	 * @param subscriptionsUrl the subscriptionsUrl to set
	 */
	public void setSubscriptionsUrl(String subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}

	/**
	 * @return the organizationsUrl
	 */
	public String getOrganizationsUrl() {
		return organizationsUrl;
	}

	/**
	 * @param organizationsUrl the organizationsUrl to set
	 */
	public void setOrganizationsUrl(String organizationsUrl) {
		this.organizationsUrl = organizationsUrl;
	}

	/**
	 * @return the reposUrl
	 */
	public String getReposUrl() {
		return reposUrl;
	}

	/**
	 * @param reposUrl the reposUrl to set
	 */
	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}

	/**
	 * @return the eventsUrl
	 */
	public String getEventsUrl() {
		return eventsUrl;
	}

	/**
	 * @param eventsUrl the eventsUrl to set
	 */
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	/**
	 * @return the receivedEventsUrl
	 */
	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	/**
	 * @param receivedEventsUrl the receivedEventsUrl to set
	 */
	public void setReceivedEventsUrl(String receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the siteAdmin
	 */
	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	/**
	 * @param siteAdmin the siteAdmin to set
	 */
	public void setSiteAdmin(Boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}
	
}

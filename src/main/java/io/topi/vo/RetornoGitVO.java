package io.topi.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetornoGitVO implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 4303566944005878655L;

	@JsonProperty("total_count")
	private String totalCount;
	
	@JsonProperty("incomplete_results")
	private Boolean incompleteResults;
	
	private List<ItensVO> items = new ArrayList<ItensVO>();

	/**
	 * @return the totalCount
	 */
	public String getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * @return the incompleteResults
	 */
	public Boolean getIncompleteResults() {
		return incompleteResults;
	}

	/**
	 * @param incompleteResults the incompleteResults to set
	 */
	public void setIncompleteResults(Boolean incompleteResults) {
		this.incompleteResults = incompleteResults;
	}

	/**
	 * @return the items
	 */
	public List<ItensVO> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<ItensVO> items) {
		this.items = items;
	}

}

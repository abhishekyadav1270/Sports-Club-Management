package com.xoriant.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="member")
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	@Column(name="member_id")
	private Integer memberId;
	@Column(name="member_name")
	private String memberName;
	@Column(name="date_of_membership")
	private Date dateOfMembership;
	@Column(name="expiry_of_memebership")
	private Date expiryOfMembership;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Game> gamesSelected;
	//TODO figure out mapping
	private Plan planSelected;
 	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberName, Date dateOfMembership, Date expiryOfMembership, List<Game> gamesSelected,
			Plan planSelected) {
		super();
		this.memberName = memberName;
		this.dateOfMembership = dateOfMembership;
		this.expiryOfMembership = expiryOfMembership;
		this.gamesSelected = gamesSelected;
		this.planSelected = planSelected;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getDateOfMembership() {
		return dateOfMembership;
	}

	public void setDateOfMembership(Date dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}

	public Date getExpiryOfMembership() {
		return expiryOfMembership;
	}

	public void setExpiryOfMembership(Date expiryOfMembership) {
		this.expiryOfMembership = expiryOfMembership;
	}

	public List<Game> getGamesSelected() {
		return gamesSelected;
	}

	public void setGamesSelected(List<Game> gamesSelected) {
		this.gamesSelected = gamesSelected;
	}

	public Plan getPlanSelected() {
		return planSelected;
	}

	public void setPlanSelected(Plan planSelected) {
		this.planSelected = planSelected;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", dateOfMembership=" + dateOfMembership
				+ ", expiryOfMembership=" + expiryOfMembership + ", gamesSelected=" + gamesSelected + ", planSelected="
				+ planSelected + "]";
	}
	
}

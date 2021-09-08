package kodlamaio.hrms2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import kodlamaio.hrms2.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "employer_id")
public class Employer extends User {
	
	@NotNull
	@Column(name = "web_address")
	private String webAddress;

	@NotNull
	@Column(name = "company_name")
	private String companyName;

	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;

}

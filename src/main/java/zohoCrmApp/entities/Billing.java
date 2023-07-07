package zohoCrmApp.entities;

import javax.persistence.*;

@Entity
public class Billing {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	@Column(name="firstName")
	private String firstName;
	private String lastName;
	private String email;
	private String product;
	private long amount;
}

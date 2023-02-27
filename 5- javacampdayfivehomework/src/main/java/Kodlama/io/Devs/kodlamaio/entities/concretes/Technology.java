package Kodlama.io.Devs.kodlamaio.entities.concretes;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Technologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="technologyId")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="programmingLanguageId")
	private ProgrammingLanguage programmingLanguage;
}

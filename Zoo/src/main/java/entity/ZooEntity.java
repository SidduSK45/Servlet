package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "zoo")
public class ZooEntity {
	@GenericGenerator(name = "Siddu", strategy = "increment")
	@GeneratedValue(generator = "Siddu")
	@Id
	@Column(name = "id")
	int id;
	@Column(name = "name")
	String name;
	@Column(name = "noOfAnimals")
	int noOfAnimals;
	@Column(name = "entryFees")
	double entryFees;

	public ZooEntity(String name, int noOfAnimals, double entryFees) {
		super();
		this.name = name;
		this.noOfAnimals = noOfAnimals;
		this.entryFees = entryFees;
	}

	@Override
	public String toString() {
		return "ZooEntity [id=" + id + ", name=" + name + ", noOfAnimals=" + noOfAnimals + ", entryFees=" + entryFees
				+ "]";
	}

}

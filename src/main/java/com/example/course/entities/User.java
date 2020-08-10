package com.example.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;//Especificacao
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//como ira converter os objetos para um modelo relacional->annotations(@Entity):



//Serializable -> para ser tranformado em cadeias de byte (p/ serem trafegados na rede, gravados em arquivos e etc..)

//mapeamento JPA
@Entity
@Table(name = "tb_user") // nome da tabela
public class User implements Serializable {

	private static final long serialVersionUID = 1L; // numero de serie padrao
	
	//Chave primaria @id em cima do atributo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	@JsonIgnore //para nao gerar loops por conta a "via de mao dupla" entre 2 classes relacionadas
	@OneToMany(mappedBy = "client") //um para muitos e esta mapeado a partir da varial cliente
	private List <Order> orders = new ArrayList<Order>();

	public User() {

	}

	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List <Order> getOrders() {
		return orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
	
	
}

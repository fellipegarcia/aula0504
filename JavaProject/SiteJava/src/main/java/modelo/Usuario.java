package modelo;

public class Usuario {
private Integer id;
private String usuario;
private String nome;
private String senha;
private String email;

public Usuario() {
}

public Usuario(Integer id, String nome, String usuario, String senha, String email) {
	this.id = id;
	this.usuario = usuario;
	this.senha = senha;
	this.email = email;
	this.nome = nome;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public String setNome(String nome) {
	return nome;
}


public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}


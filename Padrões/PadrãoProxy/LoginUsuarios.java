public class LoginUsuarios {

	private String usuario;
	private String senha;

	

  public LoginUsuarios(String usuario, String senha) {
    this.usuario = usuario;
    this.senha = senha;
  }



  public String getUsuario() {
    return new String("Informe seu usuário: " + usuario);
  }



  public String getSenha() {
    return new String("Informe sua senha: " + senha + "\nAcesso concebido... Logando em sua conta");
  }


  
  


}
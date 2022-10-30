public class Principal {
  public static void main(String[] args) {

		System.out.println();
		System.out.println("Pessoa qualquer logando na conta ... ");
		LoginUsuarios login = new LoginProxy("Henrique", "Henrique1234");
		System.out.println(login.getUsuario());
		System.out.println(login.getSenha());
		System.out.println();
		System.out.println();
		System.out.println("Usuario dono da conta logando... ");
		login = new LoginProxy("user", "user123");
		System.out.println(login.getUsuario());
		System.out.println(login.getSenha());
  }
}
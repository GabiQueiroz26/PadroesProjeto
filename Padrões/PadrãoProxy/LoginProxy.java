public class LoginProxy extends LoginUsuarios{

    protected String Usuario;
    protected String Senha;

   
    public LoginProxy(String Usuario, String Senha) {
        super(Usuario, Senha);
        this.Usuario = Usuario;
        this.Senha = Senha;
    }


    @Override
    public String getUsuario() {
        if(permissaoAcesso()){
            return super.getUsuario();
        }
        return new String("Não possui permissão de acesso");
    }


    @Override
    public String getSenha() {
        if(permissaoAcesso()){
            return super.getSenha();
        }
        return new String("Senha não corresponde");
    }

    private boolean permissaoAcesso() {
        return Usuario == "user" && Senha == "user123"; 
    }
    
    
    
}
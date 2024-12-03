public class UsuarioServiceProxy implements UsuarioService {
    private UsuarioServiceImpl usuarioService;
    private String cache;

    public UsuarioServiceProxy() {
        this.usuarioService = new UsuarioServiceImpl();
    }

    @Override
    public String getUsuario(int id) {

        if (cache == null) {
            System.out.println("Carregando usuário do serviço real...");
            cache = usuarioService.getUsuario(id);
        } else {
            System.out.println("Retornando usuário do cache...");
        }
        return cache;
    }
}
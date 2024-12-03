public class UsuarioServiceImpl implements UsuarioService {
    @Override
    public String getUsuario(int id) {
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Usuário com ID: " + id;
    }
}

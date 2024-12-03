public class Teste {
    public static void main(String[] args) {
        // Teste sem Proxy
        System.out.println("Teste sem Proxy:");
        UsuarioService usuarioServiceSemProxy = new UsuarioServiceImpl();
        long inicioSemProxy = System.currentTimeMillis();
        System.out.println(usuarioServiceSemProxy.getUsuario(1));
        long fimSemProxy = System.currentTimeMillis();
        System.out.println("Tempo sem Proxy: " + (fimSemProxy - inicioSemProxy) + "ms\n");

        // Teste com Proxy
        System.out.println("Teste com Proxy:");
        UsuarioService usuarioServiceComProxy = new UsuarioServiceProxy();
        long inicioComProxy = System.currentTimeMillis();
        System.out.println(usuarioServiceComProxy.getUsuario(1));
        long fimComProxy = System.currentTimeMillis();
        System.out.println("Tempo com Proxy (primeira chamada): " + (fimComProxy - inicioComProxy) + "ms");

        // Segunda chamada com Proxy
        long inicioComProxy2 = System.currentTimeMillis();
        System.out.println(usuarioServiceComProxy.getUsuario(1));
        long fimComProxy2 = System.currentTimeMillis();
        System.out.println("Tempo com Proxy (segunda chamada): " + (fimComProxy2 - inicioComProxy2) + "ms");
    }
}

class Main {

    public static void main(String args[]) {
        Componente cafeManhaExecutivo = new Pacote();
        cafeManhaExecutivo.add(new Prato("Xícara de café com leite", 5.99f));
        cafeManhaExecutivo.add(new Prato("Delicioso Pão de queijo", 3.99f));
        cafeManhaExecutivo.add(new Prato("Brownie artesanal", 7.99f));

        Componente almocoBasico = new Pacote();
        almocoBasico.add(new Prato("Macarrão da vovó", 11.99f));

        Componente pedidoCliente = new Pacote();
        pedidoCliente.add(cafeManhaExecutivo);
        pedidoCliente.add(almocoBasico);
        pedidoCliente.add(new Prato("Coca-Cola geladinha com limão", 5.99f));

        System.out.println("O preço total do pedido do cliente foi: R$ " + pedidoCliente.getPreco());
    }
    
}
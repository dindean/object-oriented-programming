public class Pizzas {
    private String cardapio[] = new String[12];

    public void setCardapio() {
        this.cardapio[0] = "  - Pizza de Muzzarela";
        this.cardapio[1] = "  - Pizza de Calabresa";
        this.cardapio[2] = "  - Pizza de Portuguesa";
        this.cardapio[3] = "  - Pizza de Manjericao";
        this.cardapio[4] = "  - Coca-Cola";
        this.cardapio[5] = "  - Fanta";
        this.cardapio[6] = "  - Suco de pera";
        this.cardapio[7] = "  - Nenhuma, finalizar pedido!";
    }

    public String[] getCardapio() {
        return cardapio;
    }


}

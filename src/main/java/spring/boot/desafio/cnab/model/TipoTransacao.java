package spring.boot.desafio.cnab.model;

public enum TipoTransacao {

    DEBITO(1, "DEBITO", "Entrada", "+"),
    BOLETO(2, "BOLETO", "Saída", "-"),
    FINANCIAMENTO(3, "FINANCIAMENTO", "Saída", "-"),
    CREDITO(4, "CREDITO", "Entrada", "+"),
    RECEBIMENTO_EMPRESTIMO(5, "RECEBIMENTO EMPRÉSTIMO", "Entrada", "+"),
    VENDAS(6, "VENDA", "Entrada", "+"),
    RECEBIMENTO_TED(7, "RECEBIMENTO TED", "Entrada", "+"),
    RECEBIMENTO_DOC(8, "RECEBIMENTO DOC", "Entrada", "+"),
    ALUGUEL(9, "ALUGUÉL", "Saída", "-");

    private final int codigo;
    private final String descicao;
    private final String natureza;
    private final String sinal;

    TipoTransacao(int codigo, String descricao, String natureza, String sinal){
        this.codigo = codigo;
        this.descicao = descricao;
        this.natureza = natureza;
        this.sinal = sinal;
    }

    public static  TipoTransacao fromCodigo(int codigo) {
        for (TipoTransacao tipo : TipoTransacao.values()){
            if (tipo.codigo == codigo){
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de Transação Inválida: "+codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescicao() {
        return descicao;
    }

    public String getNatureza() {
        return natureza;
    }

    public String getSinal() {
        return sinal;
    }
}
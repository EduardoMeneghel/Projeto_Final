class Cliente {
    private Integer codigo;
    private String nome;
    private String data_nascimento;


    public Cliente(int codigo, String nome, String data_nascimento){
    }

    public Cliente(Integer codigo,String nome, String endereco, String cidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.data_nascimento = data_nascimento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String endereco) {
        this.data_nascimento = data_nascimento;
    }


    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", endereco=" + data_nascimento;
    }



}
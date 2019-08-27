package Classes;
import Classes.Menu;


public class Cliente {
    private String nome;
    private String cpf;
    private String tipo_de_cliente;
    private String numero_da_conta;
    private double saldo_da_conta;
    private String endereco;
    private int idade;
    
    Menu menu = new Menu();
    
    
    public Cliente(String nome, String cpf, String tipo_de_cliente, String numero_da_conta){
        this.nome = nome;
        this.cpf = cpf;
        this.tipo_de_cliente = tipo_de_cliente;
        this.numero_da_conta = numero_da_conta;
    }
    
    
    public void set_nome(String nome){
        this.nome = nome;
    }
    
    
    public String get_nome(){
        return this.nome;
    }
    
    
    public void set_cpf(String cpf){
        this.cpf = cpf;
    }
    
    
    public String get_cpf(){
        return this.cpf;
    }
    
    
    public void set_tipo_de_cliente(String tipo_de_cliente){
        this.tipo_de_cliente = tipo_de_cliente;
    }
    
    
    public String get_tipo_de_cliente(){
        return this.tipo_de_cliente;
    }
    
    
    public void set_numero_da_conta(String numero_da_conta){
        this.numero_da_conta = numero_da_conta;
    }
    
    
    public String get_numero_da_conta(){
        return this.numero_da_conta;
    }
    
    
    public void set_saldo_da_conta(double saldo_da_conta){
        this.saldo_da_conta = saldo_da_conta;
    }
    
    
    public double get_saldo_da_conta(){
        return this.saldo_da_conta;
    }
    
    
    public void set_endereco(String endereco){
        this.endereco = endereco;
    }
    
    
    public String get_endereco(){
        return this.endereco;
    }
    
    
    public void set_idade(int idade){
        this.idade = idade;
    }
    
    
    public int get_idade(){
        return this.idade;
    }
    
    
    //MOVIMENTAÇÃO DA CONTA
    // DEPÓSITO
    public void deposito(double valor, Cliente destinatario){
        double saldo_destinatario = destinatario.get_saldo_da_conta();
        destinatario.set_saldo_da_conta(saldo_destinatario + valor);
        menu.limpa_tela();
        menu.deposito(valor, destinatario);
    }
    
    
    // TRANSFERÊNCIA
    public void transferencia(double valor, Cliente destinatario){
        if((this.saldo_da_conta - valor) > 0){
            this.saldo_da_conta -= valor;
            double saldo_destinatario = destinatario.get_saldo_da_conta();
            destinatario.set_saldo_da_conta(saldo_destinatario + valor);
            menu.limpa_tela();
            menu.transferencia(valor, destinatario);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    
    // SAQUE
    public void saque(double valor){
        if((this.saldo_da_conta - valor) > 0){
            this.saldo_da_conta -= valor;
            menu.saque(valor, this);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    
    // SALDO
    public void saldo(){
        menu.saldo(this);
    }
    
}

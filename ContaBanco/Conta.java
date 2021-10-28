package ContaBanco;

public class Conta {
    // criação dos atributos do objeto Conta

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // metodo criado para mostra todos os gets escolhido
    public void estadoAtual(){
        System.out.println("============================================");
        System.out.println("O numero da sua conta bancaria: " +this.getNumConta());
        System.out.println("Sua conta é do tipo: " +this.getTipo());
        System.out.println("Proprietario da conta: " +this.getDono());
        System.out.println("Sua conta esta aberta?: " +getStatus());
        System.out.println("O saldo da sua conta é: " +this.getSaldo());
        System.out.println("============================================");

    } 

    // criação do metodo construtor
    public void conta() {
        setSaldo(0);
        setStatus(false);
    }

    // criação dos metodos

    public void abrirConta(String tipoDaConta) {
        this.setTipo(tipoDaConta);
        this.setStatus(true);

        // fazendo a verificação para o tipo de conta selecionada

        if(tipoDaConta == "cc"){          // " cc " para criação da conta corrente
            setSaldo(50);
        }else if(tipoDaConta == "cp"){    // " cp " para criação da conta poupança
            setSaldo(150);
        }

        System.out.println("conta aberta com sucesso!");

    }

    // criação do metodo para fecha a conta 
    public void fechaConta() {
        
        // verificação se a saldo na conta para fazer o fechamento 
        if(this.getSaldo() > 0 ){
            System.out.println("conta com dinheiro impossivel fecha");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em debito, impossivel fecha-la");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucesso !");
        }

        

    }

    // criação do metodo deposita dinheiro na conta 

    public void deposita(float deposito) {
        
        // verifação do status da conta e acrecentando (+) o valor (d) na conta 
        if(this.getStatus()){
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Deposito realizado com sucesso na sua conta !");
        }else{
            System.out.println("impossivel fazer o deposito ");
        }

    }

    // criação do metodo saca dinheiro da conta 

    public void saca(float valor) {

        // verificação se a dinheiro na conta ou não 
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso !");
            }else{
                System.out.println("Impossivel fazer o saque na conta !");
            }
        }
    }

    // criação do metodo de pagamento da mensalidade da conta 

    public void pagaMensal() {
        // variavel para armazena os valores do desconto da mensalidade 
        int valorPagamento = 0;
        
        // verificação do tipo da conta, e comparaçao com os valores que será descontado
        // de acordo com o tipo de conta será descontado um valor especifico
        if(this.getTipo() == "cc"){
            valorPagamento = 12; 
        }else if(this.getTipo() == "cp"){
            valorPagamento = 20;
        }

        // verifica o status da conta, e o saldo que a nela menos (-) o valor da mensalidade
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - valorPagamento);
            System.out.println("Pagamento realizado com sucesso !");
        }else{
            System.out.println("Saldo insuficiente para pagamento da mensalidade !");
        }
    }


    // criação dos metodos get , set

    public void setNumConta(int numeroDaConta) {
        this.numConta = numeroDaConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String tipoDaConta){
        this.tipo = tipoDaConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public  void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;

    }

}

package br.edu.ifba.saj.ads.poo;

public class Fregues {
    private String nome;
    private String idade;
    private double saldo;
    private String email;
    private String senha;
    
    //se o email e senha nao obedecerem o padrao, é lançado um "erro" (excessao)
    public Fregues(String nome, String idade, double saldo, String email, String senha) throws EmailInvalidoException, SenhaFracaException {
        //se o email nao terminar (!email.endsWith) com @gmail.com entao uma excessao é lançada
        if (!email.endsWith("@gmail.com")) {
            throw new EmailInvalidoException("o email deve obedecer o padrão: @gmial.com");
            //se o tamanho da senha for menor que 8 (senha.lenght < 8) , ou nao possuir caracteres maiusculos (!contemMaiuscula(senha)) ou nao possuir caracteres especiais (!contemCaracteresEspeciais(senha)) entao uma excessao é lancada
        } if ((senha.length() < 8) || (!contemMaiuscula(senha)) || (!contemCaracteresEpeciais(senha))) {
            //senha fraca, entao lançamos uma excessao 
            throw new SenhaFracaException("a senha deve possuir mais de 7 caracteres, conter letras maiusculas e caracteres especiais.");
        }
        this.nome = nome;
        this.idade = idade;         
        this.saldo = saldo;
        this.email = email;
        this.senha = senha;
    }

    
    public boolean contemMaiuscula(String senha){
        for (char caractere : senha.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                return true;
            }
        }
        return false;
    }

    public boolean contemCaracteresEpeciais(String senha){
        String caracteresEspecicais = "!@#$%^&*()-_=+[]{}|;:', <.>/?";
        for (char caractere : senha.toCharArray()) {
            if (caracteresEspecicais.indexOf(caractere) !=-1 ) {
                //o indexOf retorna a posição de um caractere na string caracteresEspeciais. Se o caractere não for encontrado, ela retorna -1.
                return true;
            }
        }
        return false;
    }

    //metodo para debitar do saldo do fregues
    public void debitarValor(double valor){
        saldo -= valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}

package plano_dev_individual.pip_pdi_p1.entities;

public class Funcionario {
    private String name;
    private long cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public long getCpf(){
        return cpf;
    }

    public String verifiyDigit (){
        String stringCpf = String.valueOf(cpf);
        return stringCpf.substring(stringCpf.length() -2);
    }
}

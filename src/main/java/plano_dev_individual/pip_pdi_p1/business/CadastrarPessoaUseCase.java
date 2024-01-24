package plano_dev_individual.pip_pdi_p1.business;

import plano_dev_individual.pip_pdi_p1.entities.pessoa.PessoaFisica;
import plano_dev_individual.pip_pdi_p1.exceptions.BusinessException;
import plano_dev_individual.pip_pdi_p1.exceptions.CpfInvalidException;

public class CadastrarPessoaUseCase {


  private PessoaFisica pessoa;

    public PessoaFisica cadastrarPessoaFisica(PessoaFisica pessoaFisica) throws BusinessException {

        pessoa = pessoaFisica;
        if (Long.parseLong(pessoaFisica.getCpf()) % 11 != 2){
          throw new CpfInvalidException(pessoaFisica.getCpf());
        }
        return pessoaFisica;
    }
}

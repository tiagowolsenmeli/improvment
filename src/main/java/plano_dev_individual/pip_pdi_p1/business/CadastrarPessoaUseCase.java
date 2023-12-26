package plano_dev_individual.pip_pdi_p1.business;

import plano_dev_individual.pip_pdi_p1.entities.pessoa.PessoaFisica;
import plano_dev_individual.pip_pdi_p1.entities.pessoa.sexualidade.Sexualidade;
import plano_dev_individual.pip_pdi_p1.exceptions.BusinessException;

public class CadastrarPessoaUseCase {


  private PessoaFisica pessoa;

    public PessoaFisica cadastrarPessoaFisica(PessoaFisica pessoaFisica) throws BusinessException {

        pessoa = pessoaFisica;
        if (pessoaFisica.getCpf()%11 != pessoaFisica.getDigitoVerificador()){
          throw new BusinessException("CPF não confere com o dígito verificador");
        }
        return pessoaFisica;
    }
}

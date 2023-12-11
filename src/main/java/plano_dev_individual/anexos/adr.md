
    //A equipe de data sec hoje passa o cpf COMPLETO para trafegar em dados que são PII,
    // aumetando a possibilidade de ataques. Por isso eles querem extrair apenas o dígito verificador.
    // Você validou que o CPF está salvo completo, inclusive dígito verificador.
    // Hoje eles querem apenas esses dígitos.
    // Eles solicitaram com urgência sem querer pensar em novas soluções.
    // 1. Refinamento de 10 minutos com líder e um sênior juntos conseguiu negociar um
    // fix rápido, e a oportunidade de
    // propor melhores solucões em engenharia de software.

    //Como desenvolvedor, criei uma história de usuário com os requisitos acordados no refinamento.
    // Eu enquanto dataSec quero um retorno de dígito verificador a partir do CPF salvo atualmente
    // Retorno String.
    // Analisar como está sendo salvo o CPF no banco de dados atualmente.
    // Requisitos não funcionais - fix imediato.
    // Segurança da informação, retornar string para uso do pessoal do front.


    // Critérios de aceite - ADR
    // A) 2 Dígitos de retorno
    // B) String
    // C) Segurança, o mínimo de informações possível.
package plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import plano_dev_individual.pip_pdi_p1.exceptions.BusinessException;

@Getter
public class Treinamento {

  private static final int MAX_PALAVRAS_CHAVE = 5;
  @Setter
  private String tituloApresentacao;
  @Setter
  private String descricao;
  @Setter
  private LocalDateTime dataHora;
  @Setter
  private String local;
  @Setter
  private String nomeApresentador;
  private List<String> palavrasChave;


  public Treinamento(String tituloApresentacao, String descricao, LocalDateTime dataHora, String local, String nomeApresentador,
                     String palavrasChave) throws BusinessException {
    this.tituloApresentacao = tituloApresentacao;
    this.descricao = descricao;
    this.dataHora = dataHora;
    this.local = local;
    this.nomeApresentador = nomeApresentador;
    setPalavrasChave(palavrasChave);
  }

  public Treinamento(String tituloApresentacao, String descricao, LocalDateTime dataHora, String local, String nomeApresentador,
                     List<String> palavrasChave) {
    this.tituloApresentacao = tituloApresentacao;
    this.descricao = descricao;
    this.dataHora = dataHora;
    this.local = local;
    this.nomeApresentador = nomeApresentador;
    this.palavrasChave = palavrasChave;
  }

  public void setNomeApresentador(String nomeApresentador) {
    this.nomeApresentador = nomeApresentador;
  }

  public Treinamento() {
    this.palavrasChave = new ArrayList<>(MAX_PALAVRAS_CHAVE);
  }

  public void setPalavrasChave(final String palavrasChaveString) throws BusinessException {
    final String[] palavras = palavrasChaveString.split(",");
    if (palavras.length > MAX_PALAVRAS_CHAVE) {
      throw new BusinessException("Número máximo de palavras-chave excedido");
    }
    for (int i = 0; i < palavras.length && i < MAX_PALAVRAS_CHAVE && this.palavrasChave.size() < MAX_PALAVRAS_CHAVE; i++) {
      this.palavrasChave.add(palavras[i]);
    }
  }

  public List<String> getPalavrasChave() {
    return this.palavrasChave;
  }


  public List<String> ordenaListaTreinamentos(final List<String> listaTreinamentos) {


    List<String> arrayList = new ArrayList<>(listaTreinamentos);

    for (int i = 0; i < arrayList.size(); i++) {
      for (int j = 0; j < arrayList.size(); j++) {
        if (arrayList.get(i).compareToIgnoreCase(arrayList.get(j)) < 0) {
          String aux = arrayList.get(i);
          arrayList.set(i, arrayList.get(j));
          arrayList.set(j, aux);
        }
      }

    }

    return arrayList;
  }

  public List<String> sortCompareTo(final List<String> listaTreinamentos) {

    final ArrayList<String> arrayList = new ArrayList<>(listaTreinamentos);

    arrayList.sort((String s1, String s2) -> s1.compareToIgnoreCase(s2));
    return arrayList;
  }

  public List<String> createlist(String lista) {
    List<String> listaOfString = new ArrayList<>();
    String[] array = lista.split(",");
    for (int i = 0; i < array.length; i++) {
      listaOfString.add(array[i]);
    }
    return listaOfString;
  }
}




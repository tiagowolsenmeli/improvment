package plano_dev_individual.pip_pdi_p1.entities.charpessoas.conhecimento;

import java.util.ArrayList;

public class Treinamento {

  public static ArrayList<String> ordenaListaTreinamentos(final ArrayList<String> listaTreinamentos){

    ArrayList<String> arrayList = (ArrayList) listaTreinamentos.clone();

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

    public static ArrayList<String> sortCompareTo(final ArrayList<String> listaTreinamentos) {

      final ArrayList<String> arrayList = (ArrayList) listaTreinamentos.clone();

      arrayList.sort((String s1, String s2) -> s1.compareToIgnoreCase(s2));
      return arrayList;
    }

}




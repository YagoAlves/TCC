package br.ufc.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PontoDeInteresse {

@SerializedName("pontos")
@Expose
private List<Ponto> pontos = null;

public List<Ponto> getPontos() {
return pontos;
}

public void setPontos(List<Ponto> pontos) {
this.pontos = pontos;
}

}
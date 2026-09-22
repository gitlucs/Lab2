import java.util.*;

public class JogoDoBixo {
    private String[] animais = {"AVESTRUZ", "ÁGUIA", "BURRO", "BORBOLETA", "CACHORRO", "CABRA", "CARNEIRO", "CAMELO", "COBRA", "COELHO", "CAVALO", "ELEFANTE", "GALO", "GATO", "JACARÉ", "LEÃO", "MACACO", "PORCO", "PAVÃO", "PERU", "TOURO", "TIGRE", "URSO", "VEADO", "VACA" };
    int

    public JogoDoBixo() {
    }

    public String[] getAnimais() {
        return animais;
    }

    public void setAnimais(String[] animais) {
        this.animais = animais;
    }
    public String pegaBicho(int numero){
        int indice = numero - 1;
        if(0 <= indice && indice <= 24) {
            return this.animais[indice];
        }else{
            return "NUMERO DE ANIMAL INVÁLIDO";
        }
    }
}

import java.util.*;

public class JogoDoBixo {
    private String[] animais = {"AVESTRUZ", "ÁGUIA", "BURRO", "BORBOLETA", "CACHORRO", "CABRA", "CARNEIRO", "CAMELO", "COBRA", "COELHO", "CAVALO", "ELEFANTE", "GALO", "GATO", "JACARÉ", "LEÃO", "MACACO", "PORCO", "PAVÃO", "PERU", "TOURO", "TIGRE", "URSO", "VEADO", "VACA" };
    int[] aposta = new int[5];

    public JogoDoBixo() {
    }

    public String[] getAnimais() {
        return animais;
    }

    public void setAnimais(String[] animais) {
        this.animais = animais;
    }

    public int[] getAposta() {
        return aposta;
    }

    public void setAposta(int[] aposta) {
        this.aposta = aposta;
    }

    public String pegaBicho(int numero){
        int indice = numero - 1;
        if(0 <= indice && indice <= 24) {
            return this.animais[indice];
        } else {
            return "NUMERO DE ANIMAL INVÁLIDO";
        }
    }

    public void fazAposta(){
        int[] aposta = new int[5];
        for(int i = 0; i < 5; i++){
            aposta[i] = (int) (Math.random() * 25);
        }
        this.setAposta(aposta);
    }
    public void imprimeAposta(){
        int[] apostaCrescente = this.getAposta();
        Arrays.sort(apostaCrescente);
        String imprimir = "";

        for(int i = 0; i < apostaCrescente.length; i++){
            if(!imprimir.contains(this.pegaBicho(apostaCrescente[i]))){
                imprimir += this.pegaBicho(apostaCrescente[i]) + " ";
            }
        }
        System.out.println(imprimir);

    }
}

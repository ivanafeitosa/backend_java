import java.util.List;

public class Paciente extends Pessoa {
    //private String sintoma;

    private List<String> sintomas;
    private String complexidade;

    public Paciente() {
    }

    public Paciente(List<String> sintomas) {

        this.sintomas = sintomas;
    }

    //entendi como o método solicitado List sintomas() para mostrar a lista de sintomas já fosse o getSintomas
    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    public String getComplexidade() {
        return complexidade;
    }

}

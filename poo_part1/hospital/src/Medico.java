import java.util.List;

public class Medico extends Funcionario {
    private String status;

    public Medico() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cargaHoraria() {
        System.out.println("A jornada de um médico é em média 52 horas semanais");
    }

    public String realizarDiagnostico(List<String> sintomas) {
        String doenca;
        if (sintomas.size() > 5) {
            doenca = "análise mais detalhada";
        } else {
            doenca = "virose";
        }

        return doenca;
    }
}

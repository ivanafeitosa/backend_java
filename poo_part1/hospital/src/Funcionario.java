
public abstract class Funcionario extends Pessoa {
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    abstract void cargaHoraria();
}

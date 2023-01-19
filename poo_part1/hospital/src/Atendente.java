public final class Atendente extends Funcionario {
    private String especialidade;

    public Atendente() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void cargaHoraria() {
        System.out.println("A jornada de um atendente é em média 40 horas semanais");
    }

    public final void inciarAtendimento(){
        System.out.println("Atendente ocupado! Por favor, aguarde sua vez");
    }
}

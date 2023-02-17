import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculo <T extends Veiculo>{
    private List<T> veiculos;

    if(veiculos == null) {
        veiculos = new ArrayList<>();
    }

    public List<T> getVeiculos() {
        return veiculos;
    }

    public void cadastrar(T veiculo) {
        veiculos.add(veiculo);
    }





}

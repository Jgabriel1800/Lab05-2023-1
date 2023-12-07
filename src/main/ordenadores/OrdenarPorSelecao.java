package ordenadores;

public class OrdenarPorSelecao implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;

        for (int j = 0; j < n - 1; j++) {
            int menorindice = j;

            for (int i = j + 1; i < n; i++) {
                
                if (array[i] < array[menorindice]) {
                    menorindice = i;
                }
            }
            
            int temp = array[menorindice];
            array[menorindice] = array[j];
            array[j] = temp;
        }
        return array;
    }
}

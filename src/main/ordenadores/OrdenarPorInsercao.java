package ordenadores;

public class OrdenarPorInsercao implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        
        int ist, a; 
        for (int i = 1; i < array.length; i++) { 
            ist = i;
            
            for (int j = i - 1; j >= 0; j--) {
                
                if (array[ist] < array[j]) {
                    a = array[ist]; 
                    array[ist] = array[j];
                    array[j] = a; 
                    ist--;
                
                } else {
                    break;
                }
            }
        }
        
        return array;
    }
}


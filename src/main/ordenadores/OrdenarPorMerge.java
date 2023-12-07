package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array1, int[] array2) {
        
        int tam1 = array1.length;
        int tam2 = array2.length;
        int[] novoArray = new int[tam1 + tam2];

        int i = 0;
        int j = 0; 
        int k = 0;

        while (i < tam1 && j < tam2) {
            
            if (array1[i] < array2[j]) {
                novoArray[k++] = array1[i++];
            } else {
                novoArray[k++] = array2[j++];
            }
        }

        while (i < tam1) {
            novoArray[k++] = array1[i++];
        }

        while (j < tam2) {
            novoArray[k++] = array2[j++];
        }

        return novoArray;
    }
    
}

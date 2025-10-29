public class SortShell{

    public SortShell(){
        System.out.println("Estudiante: Andrea Hurtado");
        System.out.println("Metodo Shell");

    }
    public void sort(int[] numeros, boolean ase){
        int n = numeros.length;
        int cambios = 0;
        int comparaciones = 0;
        
        //el i va a empezar dividido para 2
        //luego va la condicion para que se siga repitiendo hasta que no se cumpla
        //i = i/2
        //metodo insersion
        for (int gap = n / 2; gap > 0; gap /= 2) {      
            //for interno para que recorra los arreglos internos que se estan formando 
            for (int i = gap; i < n; i++){
                int temp = numeros[i];
                int j = i;  
                boolean entro = false;

                while (j >= gap && numeros[j - gap] > temp) {
                    comparaciones++;
                    numeros[j] = numeros[j - gap];
                    j -= gap;
                    cambios++;
                    entro = true;
                    
                } 
                if (j >= gap) {
                    comparaciones++;
                }  
                 
                numeros[j] = temp; 
            }
        } 
        System.out.println("Acciones (comparaciones y cambio):" + (cambios + comparaciones));
    }
}
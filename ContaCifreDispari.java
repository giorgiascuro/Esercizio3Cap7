public class ContaCifreDispari {    
    public static int contaCifreDispari(int numero) {
        int contatore;
        if(numero < 10 && numero % 2 == 1)
            contatore = 1;
        else if(numero < 10 && numero % 2 == 0)
            contatore = 0;
        else if((numero % 10) % 2 == 1)          
            contatore = contaCifreDispari(numero / 10) + 1;
        else
            contatore = contaCifreDispari(numero / 10);
            return contatore;
        }
        
    }
       
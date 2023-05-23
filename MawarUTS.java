//Mawar Ahdayani Samual
//227064516023
package mawar.uts;

import java.util.Scanner;


public class MawarUTS {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //membuat scanner inputan
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("Jumlah Kariawan : ");
        int n = keyboard.nextInt();
        
        //membuat array dan scanner
        String [] [] data = new String [n][2];
        Scanner scan = new Scanner (System.in);
        
        //mengisi data kariawan
        for (int baris =0; baris<data.length; baris++){
            System.out.println("");
            System.out.println("Data Kariawan ke " + (baris+1));
            for (int kolom =0; kolom<2; kolom++); {
                int kolom = 0;
                int i = 0;
            if ( kolom == 0)
                System.out.print("NIK   : ");
            else if (kolom == 1)
                System.out.print("Nama Kariawan : ");
            
            System.out.print("");
            data [baris][kolom] = keyboard.next();
        }
        }
        System.out.println ("Data Kariawan yang dimasukan");
        System.out.println ("-----------------------------");
        System.out.println ("NIK \t\t\t Nama \t\t");
        
        for (int i=0; i<n; i++){
            for (int j=0; j<2; j++){
                System.out.print(data[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 100;
        //tulostusehdot 
        if (ika >= 0 && ika <18) 
        {
            System.out.println("olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika >= 16 && ika <18) {
                System.out.println("saat ajaa kevaria");
            }
        }
        else if (ika >= 65)
        {
            System.out.println("olet eläkäläinen");
        }
        else 
        {
            System.out.println("Olet aikuinen");
        }
        if (ika == 18) {
            System.out.println("olet juuri tullut täysi-ikäiseksi ja saat ajaa atuao");
        }
         // Onnentoivotus tasavuosikymmenistä
        if (ika % 10 == 0) {
            System.out.println("Onnittelut tasavuosikymmenistä");
        }
        // Erikoisonnittelut 100-vuotiaille 
        if (ika == 100) {
            System.out.println("Onneksi olkoon 100 vuotta!");
            System.out.println("Olet saavuttanut merkittävän virstanpylvään.");
            System.out.println("Toivomme sinulle paljon onnea ja terveyttä!");
        }

        // Tarkennettu eläkeikä, varhaiseläke yli 58-vuotiaille
        if (ika >= 58 && ika < 65) {
            System.out.println("Voit mennä varhaiseläkkeelle.");
        }
}
}
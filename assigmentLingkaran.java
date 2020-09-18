import java.util.Scanner;

public class assigmentLingkaran {

    public int scanInput(){
        int r;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai R: ");
        r = input.nextInt();
        return r;
    }

    public double doProcess(){
        int r = scanInput();

        double luas;
        double pi=3.14;

        System.out.println("Rumus Luas Lingkaran: ");
        System.out.println("Luas = pi*r*r ");
        System.out.println("Luas = "+pi+"*"+r+"*"+r);
        luas = pi*r*r;
        return luas;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String loop;
        for (loop = "Y"; loop.equals("Y") || loop.equals("y"); ) {
            System.out.println("Aplikasi Menghitung Luas Lingkaran");
            System.out.println("==================================");
            System.out.println("Hasil Luas Lingkaran Yaitu: " + new assigmentLingkaran().doProcess());
            System.out.println("==================================");
            System.out.println("Apakah Anda Ingin Menginput Kembali? (Y/N) : ");
            loop = input.next();
            System.out.println();
        }
    }
}
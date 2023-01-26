import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class RabotnaNedela{

    private int [] casovi;
    private int brNedela;

    public RabotnaNedela(int[] casovi, int brNedela) {
        super();
        this.casovi = casovi;
        this.brNedela = brNedela;
    }

    @Override
    public String toString() {
        int suma=0;
        String output="";
        for (int j : casovi) {
            suma += j;
        }
        output+=suma;
        return output;
    }

    public int getCasovi() {
        int suma=0;
        for(int i=0;i<casovi.length;i++)
        {
            suma+=casovi[i];
        }
        return suma;
    }

    public void setCasovi(int[] casovi) {
        this.casovi = casovi;
    }

    public int getBrNedela() {
        return brNedela;
    }

    public void setBrNedela(int brNedela) {
        this.brNedela = brNedela;
    }

}

class Rabotnik{

    private String ime;
    private RabotnaNedela [] nedeli;

    public Rabotnik(String ime, RabotnaNedela[] nedeli) {
        super();
        this.ime = ime;
        this.nedeli = nedeli;
    }

    public Rabotnik() {
    }

    @Override
    public String toString() {
        String o= ime+"    ";
        int suma=0;
        for(RabotnaNedela ned:nedeli)
        {
            suma+=ned.getCasovi();
            o+=ned.toString()+"   ";
        }
        o+=suma+"\n";
        return o;
    }
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public RabotnaNedela[] getNedeli() {
        return nedeli;
    }

    public void setNedeli(RabotnaNedela[] nedeli) {
        this.nedeli = nedeli;
    }
    public int sumNedeli(Rabotnik r)
    {
        int suma=0;
        for(RabotnaNedela ned:nedeli)
        {
            suma+=ned.getCasovi();
        }
        return suma;
    }
}


public class Main {

    public static Rabotnik najvreden_rabotnik(Rabotnik [] niza)
    {
        Rabotnik max=niza[0];
        for(Rabotnik rab:niza)
        {
            if(rab.sumNedeli(rab)> max.sumNedeli(max))
            {
                max=rab;
            }
        }
        return max;

    }
    public static void table(Rabotnik [] niza)
    {
        String o="Rab   1   2   3   4   Vkupno\n";
        for(Rabotnik rab:niza)
        {
            o+=rab;
        }
        System.out.println(o);
    }

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Rabotnik [] niza = new Rabotnik[n];
        for(int i=0;i<n;i++)
        {
            String name= input.next();
            List<RabotnaNedela> nedeli = new ArrayList<RabotnaNedela>();

            for(int z = 0;z<4;z++)
            {
                int [] casovi = new int[5];
                casovi[0] = input.nextInt();
                casovi[1] = input.nextInt();
                casovi[2] = input.nextInt();
                casovi[3] = input.nextInt();
                casovi[4] = input.nextInt();
                RabotnaNedela ned = new RabotnaNedela(casovi,z+1);
                nedeli.add(ned);
            }
            niza[i] = new Rabotnik(name, nedeli.toArray(new RabotnaNedela[nedeli.size()]));

        }

        table(niza);
        System.out.println("NAJVREDEN RABOTNIK: " +najvreden_rabotnik(niza).getIme());

    }
}


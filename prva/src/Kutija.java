import java.util.Scanner;

public class Kutija<T> {

    private T objekt;

    public Kutija(){}

    Kutija(T objekt)
    {
        this.objekt=objekt;
    }

    public T getObjekt() {
        return objekt;
    }

    public void setObjekt(T objekt) {
        this.objekt = objekt;
    }

    @Override
    public String toString() {
        return "Kutija sodrzi objekt=" + objekt;
    }
    public static void main(String[] args) {
        Kutija<Integer> kutija1= new Kutija<Integer>();
        kutija1.setObjekt(10);
        System.out.println(kutija1.toString());

        Kutija<String> kutija2= new Kutija<String>("Zhaba");
        System.out.println(kutija2.toString());

        Kutija<Televizor> kutijaSoTelevizor= new Kutija<Televizor>();
        Televizor t1= new Televizor("LG",40, true);
        kutijaSoTelevizor.setObjekt(t1);
        System.out.println("Televizorot e "+t1);
        System.out.println("Kutija so televizor: "+ kutijaSoTelevizor);

        Televizor t2= new Televizor("Phillips",43,false);
        Kutija<Televizor> kt2= new Kutija<Televizor>(t2);
        System.out.println(kt2);

        Kutija<Number> broj= new Kutija<Number>();
        broj.setObjekt(14);
        System.out.println(broj);

        Kutija<String> tekst= new Kutija<String>();
        tekst.setObjekt("Najjaci");
        System.out.println(tekst); // ss scanner
        Scanner input = new Scanner(System.in);
        tekst.setObjekt(input.nextLine());
        System.out.println(tekst);


        // niza
        Televizor televizori[] = new Televizor[10];

        televizori[0]=t1;
        televizori[1]=t2;


    }


}

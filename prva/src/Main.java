import java.util.Scanner;

public class Main {
    public class Zadaca{
        private String opis;
        private int brcasovi;
        private boolean status;

        public Zadaca(){}
        public Zadaca(String opis, int cas)
        {
            this.opis=opis;
            brcasovi=cas;
        }

        public String getOpis() {
            return opis;
        }

        public void setOpis(String opis) {
            this.opis = opis;
        }

        @Override
        public String toString() {
            return "Zadaca{" +"opis='" + opis + '\'' +
                    ", brcasovi=" + brcasovi +
                    ", status=" + status +
                    '}';
        }
    }
    class Vraboten{

    }

}


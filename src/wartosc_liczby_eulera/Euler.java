package wartosc_liczby_eulera;

public class Euler {

    public static void main(String[] args)
    {
        double dokladnosc = 1.0e-15; //Zadana dokladnosc obliczen

        long silnia = 1; //wartosc poczatkowa silni
        double e = 2.0; //wartosc poczatkowa liczby e
        int n = 2;
        double e0;

        do
        {
            e0 = e;
            silnia *= n++; //iteracyjne obliczanie silni
            e += 1.0 / silnia; //iteracyjne obliczanie liczby e
        }
        while(Math.abs(e - e0) >= dokladnosc); //abs() - wartosc bezwzgledna

        System.out.printf("obliczone e = %.15f.\n", e);
        System.out.println("stala e = " + Math.E + ".");
    }
}

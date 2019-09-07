package basicjava;

public class BasicStuff
{
    public static void main(String[] args)
    {
        double age0 = 19;
        double age1 = 19;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        double sumOfAges  = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges  + "!");
        System.out.println("The sum of our ages is " + (age0 + age1)  + "!");

        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);
        System.out.println("Number of weeks in 1600 hours is " + 1600/(24*7));
        System.out.println("Number of days in 1600 hours is " + 1600/24);
        System.out.println("Number of hours in 1600 hours is " + 1600/1);

        double h;
        double r;
        double V;
        double A;

        h = 5;
        r = 2;
        V = (Math.PI * Math.pow(r, 2) * h)/3;
        System.out.println(Math.pow((Math.pow(r, 2) + Math.pow(h, 2)), 0.5));
        A = Math.PI * Math.pow(r, 2) + Math.PI * r * Math.pow((Math.pow(r, 2) + Math.pow(h, 2)), 0.5);

        System.out.println("If a solid cone has a radius of " + r + " and has a height of " + h + ", then it will have" +
                "a volume of " + V + " and a surface area of " + A + ".");

    }
}

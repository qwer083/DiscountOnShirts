public class DiscountOnShirts {
    public static void main(String[] args) {
        int a  = 3560;
        int b = 5;
        int c = 12;
        int d = c - b;
        int e = a*b;
        int g = d*a;
        double i = 0.3;
        double h = a*c*i;
        double k = a*i;
        double l = a*c - h;
        double m = l/a;
        System.out.println("цена одной рубашки без скидки: " + a);
        System.out.println("количество уже выбранных рубашек: " + b);
        System.out.println("количество рубашек, которые надо купить, " +
                "чтобы получить скидку: " + c);
        System.out.println("которой количество рубашек, которые надо добавить к купленным," +
                "чтобы получить скидку: " + d);
        System.out.println("общая цена уже выбранных рубашек без скидки: " + e);
        System.out.println("общая цена рубашек (без скидки), которые надо докупить," +
                "чтобы получить скидку.: " + g);
        System.out.println("процент скидки: " + i);
        System.out.println("цена всех рубашек со скидкой: " + h);
        System.out.println("цена одной рубашки со скидкой: " + k);
        System.out.println("количество сэкономленных денег, если рубашки куплены со " +
                "скидкой: " + l);
        System.out.println("количество сэкономленных денег, если рубашки куплены со " +
                "скидкой: " + m);
    }
}

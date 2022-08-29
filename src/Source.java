public class Source {
    public static void main(String[] args) {
    double weight = 80;
    double height = 1.8;
        System.out.println(bmi(weight,height).equals("Normal"));
    }
    public static String bmi(double weight, double height) {
        String[] args = {"Obese", "Overweight", "Normal", "Underweight"};
        double temp = weight/Math.pow(height,2);
        return (temp<=18.5)? args[3] : (temp<=25)? args[2] : (temp<=30)? args[1] : args[0];
    }
}

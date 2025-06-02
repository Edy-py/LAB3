package Lista1_lab3.Exer12;

class ConversorTemperatura {
    public double fahrenheit;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double converterParaCelsius() {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}

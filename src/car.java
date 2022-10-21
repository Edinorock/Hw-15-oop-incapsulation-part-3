public class car {
    String brand;
    String model;

    String engineVolume;

    String color;
    String productionYear;
    String productionCountry;

    public car(String brand, String model, String engineVolume, String color, String productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "модель - default";
        } else {
            this.model = model;
        }

        if (productionCountry == null) {
            this.productionCountry = "страна сборки - default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume == null) {
            this.engineVolume = "объем двигателя — 1,5 л.";
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый цвет кузова";
        } else {
            this.color = color;
        }


        if (productionYear == null) {
            this.productionYear = "2000 год производства";
        } else {
            this.productionYear = productionYear;
        }

    }

    // строки с предыдущего задания
    // this.brand = brand;
    // this.model = model;
    // this.engineVolume = engineVolume;
    // this.color = color;
    // this.productionYear = productionYear;
    //this.productionCountry = productionCountry;

    void info() {
        System.out.println(brand + " " + model + ", " + productionYear + ", " + productionCountry + ", " + color + ", " + engineVolume);
    }



}

package transport;

public class car {
    private final String brand;
    private final String model;

    String engineVolume;

    String color;
    private final String productionYear;
    private final String productionCountry;

    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;

    public car(String brand,
               String model,
               String engineVolume,
               String color,
               String productionYear,
               String productionCountry) {
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
            this.gears = "механика";
            this.regNumber = "х000хх000";
            this.summerTyres = true;
            this.typeOfBody = "седан";
            this.seatsCount = 5;
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

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "механика";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    //
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    // меняю шины на сезонные
    public void changeTyres() {
        summerTyres = !summerTyres;
    }
    // проверка рег.номера х000хх000
    public boolean isCorrectRegNumber() {
        if(regNumber.length() != 9) {
            return false;
        }
        char []chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);

    }
}

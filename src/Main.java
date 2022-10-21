import transport.car;

public class Main {
    public static void main(String[] args) {


        car ladaGranta = new car(
                "Lada",
                "Granta",
                "объем двигателя — 1,7 л.",
                "желтого цвета",
                "2015 год выпуска",
                "сборка в России"
        );

        car audiA8 = new car(
                "Audi",
                "A8 50 L TDI quattro",
                "объем двигателя — 3,0 л.",
                "черный цвет кузова",
                "2020 год выпуска",
                "сборка в Германии"
        );



        car BMWZ8 = new car(
                "BMW",
                "Z8",
                "объем — 3,0 л.",
                "черный цвет кузова",
                "2021 год выпуска",
                "сборка в Германии"
        );



        car kiaSportage = new car(
                "Kia",
                "Sportage 4-го поколения",
                "объем двигателя — 2,4 л.",
                "цвет кузова — красный",
                "2018 год выпуска",
                "сборка в Южной Корее"
        );

        car hyundaiAvante = new car(
                "Hyundai",
                "Avante",
                "объем двигателя — 1,6 л",
                "цвет кузова — оранжевый",
                "год выпуска — 2016",
                "сборка в Южной Корее"
        );
    }

}
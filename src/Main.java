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
        // следующие строки от предыдущего задания, решила не удалять, программа все равно работает
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.color = "желтого цвета";
        ladaGranta.engineVolume = "объем двигателя — 1,7 л.";
        ladaGranta.productionYear = "2015 год выпуска";
        ladaGranta.productionCountry = "сборка в России";
        ladaGranta.info();

        car audiA8 = new car(
                "Audi",
                "A8 50 L TDI quattro",
                "объем двигателя — 3,0 л.",
                "черный цвет кузова",
                "2020 год выпуска",
                "сборка в Германии"
        );
        // следующие строки от предыдущего задания, решила не удалять, программа все равно работает
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.color = "черный цвет кузова";
        audiA8.engineVolume = "объем двигателя — 3,0 л.";
        audiA8.productionYear = "2020 год выпуска";
        audiA8.productionCountry = "сборка в Германии";
        audiA8.info();


        car BMWZ8 = new car(
                "BMW",
                "Z8",
                "объем — 3,0 л.",
                "черный цвет кузова",
                "2021 год выпуска",
                "сборка в Германии"
        );
        // следующие строки от предыдущего задания, решила не удалять, программа все равно работает
        BMWZ8.brand = "BMW";
        BMWZ8.model = "Z8";
        BMWZ8.color = "черный цвет кузова";
        BMWZ8.engineVolume = "объем — 3,0 л.";
        BMWZ8.productionYear = "2021 год выпуска";
        BMWZ8.productionCountry = "сборка в Германии";
        BMWZ8.info();


        car kiaSportage = new car(
                "Kia",
                "Sportage 4-го поколения",
                "объем двигателя — 2,4 л.",
                "цвет кузова — красный",
                "2018 год выпуска",
                "сборка в Южной Корее"
        );
        // следующие строки от предыдущего задания, решила не удалять, программа все равно работает
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage 4-го поколения";
        kiaSportage.color = "цвет кузова — красный";
        kiaSportage.engineVolume = "объем двигателя — 2,4 л.";
        kiaSportage.productionYear = "2018 год выпуска";
        kiaSportage.productionCountry = "сборка в Южной Корее";
        kiaSportage.info();

        car hyundaiAvante = new car(
                "Hyundai",
                "Avante",
                "объем двигателя — 1,6 л",
                "цвет кузова — оранжевый",
                "год выпуска — 2016",
                "сборка в Южной Корее"
        );
        // следующие строки от предыдущего задания, решила не удалять, программа все равно работает
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.color = "цвет кузова — оранжевый";
        hyundaiAvante.engineVolume = "объем двигателя — 1,6 л";
        hyundaiAvante.productionYear = "год выпуска — 2016";
        hyundaiAvante.productionCountry = "сборка в Южной Корее";
        hyundaiAvante.info();
    }
}
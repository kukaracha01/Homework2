public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Обшая масса двух бойцов равна " + totalWeight + " кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в массе между бойцами равна " + weightDifference + " кг");
        var remainderOfTheDivision = boxer2 % boxer1;
        System.out.println("Остаток от деления между двумя весами бойцов равен " + remainderOfTheDivision + " кг");
        var totalNumberOfWorkingHours = 640;
        var numberOfHoursPerEmployee = 8;
        var totalNumberOfEmployees = totalNumberOfWorkingHours / numberOfHoursPerEmployee;
        System.out.println("Всего работников в компании - " + totalNumberOfEmployees + " человек");
        totalNumberOfEmployees = totalNumberOfEmployees + 94;
        numberOfHoursPerEmployee = totalNumberOfWorkingHours / totalNumberOfEmployees;
        System.out.println("Если в компании работает " + totalNumberOfEmployees + " человек, то всего " + numberOfHoursPerEmployee + " часа работы может быть поделено между сотрудниками");

    }
}
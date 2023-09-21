package homework5.Controller;

import homework5.Data.ComplexNumber;
import homework5.Data.RationalNumber;
import homework5.Service.NumberService;
import homework5.View.UserView;

import java.util.List;

public class Controller {

    NumberService numberService = new NumberService();
    UserView userView = new UserView();

    public void start() {
        boolean flag = true;
        while (flag) {
            userView.set("""
                    Выберете числа:
                    1 - Рациональные числа
                    2 - Комплкесные числа
                    9 - Лог и выход
                    0 - Выход
                    """);
            int answer = userView.getString();


            switch (answer) {
                case 1 -> {
                    numberService.createCoupleRationalNumbers();
                    workWithRationalNumbers(numberService.getAllRationalNumbers());
                    userView.appendLog("workWithRationalNumbers");
                }
                case 2 -> {
                    numberService.createCoupleComplexNumbers();
                    workWithComplexNumbers(numberService.getAllComplexNumbers());
                    userView.appendLog("workWithComplexNumbers");
                }
                case 9 -> {
                    userView.showLog();
                    flag = false;
                }
                case 0 -> {
                    flag = false;
                }
                default -> start();
            }

        }
    }

    private void workWithRationalNumbers(List<RationalNumber> rationalNumbers) {
        userView.set("""
                Выберете функцию:
                1 - Сложить числа
                2 - Вычесть первое число из второго
                3 - Вычесть второе число из первого
                4 - Перемножить числа
                5 - Разделить первое число на второе
                6 - Разделить второе число на первое
                7 - Показать все введённые числа и ответы
                8 - Ввести новые числа
                0 - Выход
                """);
        userView.appendLog(numberService.getAllRationalNumbers());
        int answer = userView.getString();
        List<RationalNumber> list = numberService.getAllRationalNumbers();
        RationalNumber rationalNumber;
        switch (answer) {
            case 1 -> {
                rationalNumber = numberService.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" addition Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 2 -> {
                rationalNumber = numberService.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" subtraction Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 3 -> {
                rationalNumber = numberService.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" subtraction Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 4 -> {
                rationalNumber = numberService.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" multiplication Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 5 -> {
                rationalNumber = numberService.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 6 -> {
                rationalNumber = numberService.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" division Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 7 -> {
                System.out.println(userView.log);
                workWithRationalNumbers(numberService.getAllRationalNumbers());
            }
            case 8 -> start();
            case 0 -> {
                return;
            }
            default -> workWithRationalNumbers(numberService.getAllRationalNumbers());
        }
    }

    private void workWithComplexNumbers(List<ComplexNumber> allComplexNumbers) {
        userView.set("""
                Выберете функцию:
                1 - Сложить числа
                2 - Вычесть первое число из второго
                3 - Вычесть второе число из первого
                4 - Перемножить числа
                5 - Разделить первое число на второе
                6 - Разделить второе число на первое
                7 - Показать все введённые числа и ответы
                8 - Ввести новые числа
                0 - Выход
                """);
        userView.appendLog(numberService.getAllComplexNumbers());
        int answer = userView.getString();
        List<ComplexNumber> list = numberService.getAllComplexNumbers();
        ComplexNumber complexNumber;
        switch (answer) {
            case 1 -> {
                complexNumber = numberService.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" addition Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 2 -> {
                complexNumber = numberService.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 3 -> {
                complexNumber = numberService.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 4 -> {
                complexNumber = numberService.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" multiplication Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 5 -> {
                complexNumber = numberService.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 6 -> {
                complexNumber = numberService.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 7 -> {
                System.out.println(userView.log);
                workWithComplexNumbers(numberService.getAllComplexNumbers());
            }
            case 8 -> start();
            case 0 -> {
                return;
            }
            default -> workWithComplexNumbers(numberService.getAllComplexNumbers());
        }


    }
}

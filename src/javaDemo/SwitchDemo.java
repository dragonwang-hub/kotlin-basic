package javaDemo;

public class SwitchDemo {
    public static void main(String[] args) {
        Demo.switchTest(10);
        Demo.ifElseTest(10);
    }
}

class Demo {
    static void switchTest(int param) {
        String grade;
        switch (param) {
            case 10:
            case 9:
                grade = "Excellent";
                break;
            case 8:
            case 7:
            case 6:
                grade = "Good";
                break;
            case 5:
            case 4:
                grade = "Ok";
                break;
            case 3:
            case 2:
            case 1:
                grade = "Fail";
                break;
            default:
                grade = "Fail";
        }
        System.out.println("Grade is:" + grade);
    }

    static void ifElseTest(int count) {
        int result = count > 0 ? 10 : 0;
        System.out.println("Result is:" + result);
    }
}
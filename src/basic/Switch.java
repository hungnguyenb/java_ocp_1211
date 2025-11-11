package basic;

public class Switch {
    public static void main(String[] args) {

        int a = 0;
        String damnName;
        switch (a) {
            case 1, 2, 3:
                System.out.println("1,2,3");
                break;
            case 4:
                System.out.println(a);
                break;
            default:
                break;
        }

        switch (a) {
            case 1, 2, 3 -> System.out.println("1"); // no need break statement
            case 4 -> System.out.println("2");
            default -> System.out.println("hl");
        }

        String name = switch (a) {
            case 1, 3, 4 -> "hung";
            case 5 -> "t";
            default -> "name";
        };
        String name1 = switch (a) {
            case 1, 3, 4 -> {
                yield "hello" + "world";
            }
            case 5 -> "t";
            default -> "name";
        };

        var name2 = switch (a) {
            case 1, 3, 4 -> {
                yield "hello" + "world";
            }
            case 5 -> 4;
            default -> "name";
        };
        System.out.println(name1);


    }

    enum MOVIE {R, T, C}

    public String movieType(MOVIE a) {
        String movie = switch (a) {
            case R -> "re";
            case T -> "re1";
            default -> "";
        };
        return movie;
    }
}

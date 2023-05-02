import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> idade = new ArrayList<>();

        idade. add(0,10);
        idade. add(1,11);
        idade. add(2,12);
        idade. add(3,13);
        idade. add(4,14);
        idade. add(5,15);
        idade. add(6,16);
        idade. add(7,17);
        idade. add(8,18);
        idade. add(9,19);
        idade. add(10,20);
        idade. add(11,21);
        idade. add(12,22);
        idade. add(13,23);
        idade. add(14,24);
        idade. add(15,25);
        idade. add(16,26);
        idade. add(17,27);
        idade. add(18,28);
        idade. add(19,29);

        int soma= idade.get(0)+idade.get(1)+idade.get(2)+idade.get(3)+idade.get(4)+idade.get(5)+idade.get(6)+idade.get(7)+idade.get(8)+idade.get(9)+idade.get(10)+idade.get(11)+idade.get(12)+idade.get(13)+idade.get(14)+idade.get(15)+idade.get(16)+idade.get(17)+idade.get(18)+idade.get(19);
        int mult= soma/20;
        System.out.println(mult);
    }
}

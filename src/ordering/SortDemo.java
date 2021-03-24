package ordering;

public class SortDemo {
    public static void main(String[] args) {
//        Precedable[] people = { new Persona("juan", 5), new Persona("pedro",3), new Persona("maria", 1), new Persona("luis", 2)};
//        Precedable[] phones = { new Celular(4, "alguien"), new Celular(10, "alguien"),new Celular(2, "alguien"),new Celular(8, "alguien")};
//        SortUtil.ordenar(people);
//        SortUtil.ordenar(phones);
        Precedable[] people = PrecedeableFactory.createPrecedeables(100);
        SortUtil.ordenar(people);
    }


}

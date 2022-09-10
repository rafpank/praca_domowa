public class Zoo {
    public static void main(String[] args) {
        String [] animals = new String[4];
        animals = new String[]{"Lwy", "Pingwiny", "Niedzwiedzie", "Malpy", "Pelikany"};

//                for (int i=0; i< animal.length; i++) {
//                    System.out.println(animal[i]);
//                }
        for (String animal:animals)
        {
            System.out.println(animal);
        }
    }

}

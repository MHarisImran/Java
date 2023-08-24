class Main {
    public static void main(String[] args) {
        // Creating a Singleton instance of the Person class
        Person p1 = Person.getInstance(1, "Candace", "Red Chilli", "female");
        System.out.println("p1" + p1);

        Person p2 = Person.getInstance(2, "Harold", "strongpass", "male");
        System.out.println("p2" + p2);


        System.out.println(p1 == p2);
    }
}
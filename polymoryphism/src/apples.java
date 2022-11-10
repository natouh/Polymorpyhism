class apples {
    public static void main(String[] args) {
        animal[] list = new animal[3];
        dog d = new dog();
        fish f = new fish();
        animal a = new animal();

        list[0] = d;
        list[1] = f;
        list[2] = a;

        for (animal x : list) {
            f.noise();
            d.noise();
            a.noise();
        }

    }

}
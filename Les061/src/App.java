class App {
    public static void main(String[] args) {

        String sentence = "I am the     legend!";
        String[] words = sentence.split(" ");

        System.out.println("There are " + words.length + " words in the sentence.");
        for (int index = 0; index < words.length; index++) {
            System.out.println(words[index]);
        }


        String sentence2 = "Justin Bieber is the king!";
        System.out.println(sentence2);

        String sentence3 = sentence2.replace("Justin Bieber", "Yilmaz Mustafa");
        System.out.println(sentence3);

        String sentence4 = sentence2.replaceAll("e", "X");
        System.out.println(sentence4);

        String sentence5 = sentence2.replaceFirst("e", "X");
        System.out.println(sentence5);

        String sentence6 = sentence2.toUpperCase();
        System.out.println(sentence6);

        String sentence7 = sentence2.toLowerCase();
        System.out.println(sentence7);

        String sentence8 = sentence2.substring(9);
        System.out.println(sentence8);

        String sentence9 = sentence2.substring(9, 12);
        System.out.println(sentence9);


    }
}

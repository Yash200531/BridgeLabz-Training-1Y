class Alphabet{
    void first() {
        System.out.println("Alphabet is the parent company.");
    }
}

class Google extends Alphabet{
    void second() {
        System.out.println("Google comes under Alphabet.");
    }
}

class Gemini extends Google{
    void third() {
        System.out.println("Gemini comes under Google.");
    }
}

class YouTube extends Alphabet {
    void fourth() {
        System.out.println("YouTube also comes under Alphabet.");
    }
}



public class Hybrid {
    public static void main(String[] args) {
    Gemini gemini = new Gemini();
    gemini.first();
    gemini.second();
    gemini.third();

    YouTube youtube = new YouTube();
    youtube.first();
    youtube.fourth();

        
    }

    
}

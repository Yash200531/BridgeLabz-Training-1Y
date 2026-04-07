class Alphabet{
    void first() {
        System.out.println("Alphabet is Top holding company");
    }
}

class Google extends Alphabet{
    void second() {
        System.out.println("Google comes under Alhpabet");
    }
}

class Gemini extends Google{
    void third() {
        System.out.println("Gemini comes under Google");
    }
}



public class MultiLevel {
    public static void main(String[] args) {
    Gemini d = new Gemini();
    d.first();
    d.second();
    d.third();

        
    }

    
}

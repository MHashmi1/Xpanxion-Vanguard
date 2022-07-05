package Inheritance_Polymorphism_HW.Problem2;

public class Word extends Sentence{

    private String noVowelsWord;

    public Word(String s, String w){
        super(s);
        this.noVowelsWord = w.replaceAll("[aeiouAEIOU]", "");
    }

    public String getNoVowelsWord() {
        return noVowelsWord;
    }

    public boolean isSubstring(){
        if (this.getSentence().contains(this.noVowelsWord))
                return true;
        else
            return false;
    }
}

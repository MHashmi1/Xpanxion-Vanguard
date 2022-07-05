package Inheritance_Polymorphism_HW.Problem2;

public class Sentence {

    private String sentence;

    public Sentence(String sentence){
        this.sentence=sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    @Override
    public boolean equals(Object obj){

        boolean eq=false;

        Sentence sentence1 = (Sentence) obj;

        if (obj ==null)
            return false;
        else if (this.getClass() != obj.getClass())
            return false;
        else
            eq = this.getSentence() == sentence1.getSentence();

        return eq;

    }
}

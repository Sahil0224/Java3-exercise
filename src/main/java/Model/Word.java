package Model;

public class Word implements Comparable<Word> {


    private String text;
    private Integer count;

    public Word(String text, Integer count) {
        this.text = text;
        this.count = count;
    }

    public String getText() {
        return text;
    }

    public Integer getCount() {
        return count;
    }
    @Override
    public int compareTo(Word w) {
        return this.count.compareTo(w.count);
    }

    @Override
    public String toString() {
        return "{" + text + " " + count + "}";
    }
}

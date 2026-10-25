package problem3;

public class Document {
    protected int numRec;
    protected String title;
    private static int numEnreg = 1;
    public Document(String title){
        numRec = numEnreg;
        numEnreg++;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " : " + title + " n°" + numRec ;
    }
}

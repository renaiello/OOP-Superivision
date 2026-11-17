public class OOPLinkedListElem {
    private int value;
    private OOPLinkedListElem next;
    // James: a constructor for an int by itself would also be useful
    public OOPLinkedListElem(int value, OOPLinkedListElem next){
        this.value = value;
        this.next = next;
    }
    
    public int getValue(){return this.value;}
    public OOPLinkedListElem getNext(){return this.next;}
    public void setValue(int newValue){this.value = newValue;}
    public void setNext(OOPLinkedListElem newNext){this.next = newNext;}

    // James: this is never null; but next might be...
    // Hence:  return next == null;
    public boolean isNull(){return (!(this != null));}
}

public class OOPLinkedListElem {
    private int value;
    private OOPLinkedListElem next;
    public OOPLinkedListElem(int value, OOPLinkedListElem next){
        this.value = value;
        this.next = next;
    }
    
    public int getValue(){return this.value;}
    public OOPLinkedListElem getNext(){return this.next;}
    public void setValue(int newValue){this.value = newValue;}
    public void setNext(OOPLinkedListElem newNext){this.next = newNext;}

    public boolean isNull(){return (!(this != null));}
}

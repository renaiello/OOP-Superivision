public class OOPLinkedList {
    protected OOPLinkedListElem start;

    public OOPLinkedList(OOPLinkedListElem start){
        this.start = start;
    }
    public OOPLinkedListElem getStart(){return this.start;}
    public void setStart(OOPLinkedListElem newStart){this.start = newStart;}

    public void add(int newValue){
        OOPLinkedListElem oldStart = this.start;
        OOPLinkedListElem newStart = new OOPLinkedListElem(newValue, oldStart);
        this.setStart(newStart);
    }

    public void remove(){
        OOPLinkedListElem newStart = (this.start).getNext();
        this.setStart(newStart);
    }

    public int hd(){return (this.start).getValue();}

    public OOPLinkedListElem getNth(int n){
        OOPLinkedListElem currentElem = this.start;
        while (n > 1) {
            if (start.isNull()){
                return null;
            }
            OOPLinkedListElem nextElem = currentElem.getNext();
            n -= 1;
            currentElem = nextElem;
        }
        return currentElem;
    }

    public int length(){
        int length = 0;
        OOPLinkedListElem currentElem = this.start;
        while (!(currentElem.isNull())){
            currentElem = currentElem.getNext();
            length += 1;
        }
        return length;
    }
}

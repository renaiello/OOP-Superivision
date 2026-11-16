public class OOPSortedLinkedList extends OOPLinkedList{
    public OOPSortedLinkedList (OOPLinkedListElem start){
        super(start);
    }
        
    public void add(int newValue){
        OOPLinkedListElem current = this.start;
        OOPLinkedListElem prev = this.start;
        while (newValue > current.getValue()){
            prev = current;
            current = current.getNext();
        }
        OOPLinkedListElem newElem = new OOPLinkedListElem(newValue, current);
        if (current == start){
            this.setStart(newElem);
        }else {
            prev.setNext(newElem);
        }
    }
    
}

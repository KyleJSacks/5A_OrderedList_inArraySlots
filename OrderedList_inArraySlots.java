public class OrderedList_inArraySlots{
	
	private List_inArraySlots list;
	
	public OrderedList_inArraySlots(){
		list = new List_inArraySlots();
	}
	
	public boolean add(int value){
		for(int index=list.size();
			index>0;
			index--)
			{
				if(value > list.get(index-1)) {
					list.add(index, value);
					return true;
				}
			}
		list.addAsHead(value);
		return true;
	}
	
	public int get(int index){
		return list.get(index);
	}
	
	public String toString(){
		return list.toString();
	}
	
}
public class UserOfOrderedList{
	
	public static void main(String[] args){
		OrderedList_inArraySlots L1 = new OrderedList_inArraySlots();
		System.out.println(L1 + System.lineSeparator());
		L1.add(3);
		System.out.println(L1 + System.lineSeparator());
		L1.add(5);
		L1.add(1);
		L1.add(2);
		System.out.println(L1 + System.lineSeparator());
		System.out.println(L1.get(3));
	}
}
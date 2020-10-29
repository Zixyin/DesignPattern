package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class AdapterIterator implements Iterator{
		Enumeration enumeration;
		@Override
		public boolean hasNext() {
			return enumeration.hasMoreElements();
		}
		public AdapterIterator(Enumeration enumeration) {
			this.enumeration = enumeration;
		}
		@Override
		public Object next() {
			return enumeration.nextElement();
		}
		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
			Iterator<Integer> iterator = list.iterator();
			iterator.forEachRemaining(i->System.out.print(i+" "));
			while(iterator.hasNext())
				System.out.println(iterator.next());
			
		}
}

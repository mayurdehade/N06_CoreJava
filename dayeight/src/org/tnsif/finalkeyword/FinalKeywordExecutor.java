package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		
//		f.SALARY = 78000.21f;
		f.print();

		HP h = new HP();
		h.display();
		h.display(h.processor);
	}

}

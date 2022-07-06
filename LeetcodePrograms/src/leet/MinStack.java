package leet;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

	private List<Integer> list;
	private Integer min;

	public MinStack() {
		super();
		this.list = new ArrayList<>();

	}

	public void push(int val) {
		if(list.isEmpty())
			this.min = val;
		list.add(val);		
		if (val < this.min)
			this.min = val;
	}

	public void pop() {
		list.remove(list.size() - 1);
		updateMin();
	}

	private void updateMin() {
		if(list.isEmpty()) {
			this.min = null;
			return;
		}
		this.min = list.get(0);	
		this.list.forEach(a -> {
			if (a < min)
				this.min = a;
		});
	}

	public int top() {
		return list.get(list.size() - 1);

	}

	public int getMin() {
		return min;
	}

}

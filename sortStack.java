import java.util.*;

public class sortStack {

	public Stack <Integer> sortMethod(Stack <Integer> s){
		Stack <Integer> r = new Stack <Integer> ();
		while(!s.empty()){
			int tmp = s.pop();
			while(!r.empty()&&tmp < r.peek()){
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}
	public static void main(String[] args) {
		sortStack ss = new sortStack();
		Stack <Integer> m = new Stack <Integer>();
		Stack <Integer> n;
		m.push(2);
		m.push(5);
		m.push(99);
		m.push(34);
	
		
		n = ss.sortMethod(m);
		
		for(int count = 0; count < n.size();count ++){
			int tmp = n.pop();
			System.out.print("|"+tmp+"|");
			
		}
		System.exit(0);
	}

}

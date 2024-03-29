
import java.util.Stack;
//hanoi tower
public class Tower{
	private Stack <Integer> disks;
	private int index;
	
	public Tower(int i){
		disks = new Stack <Integer>();
		this.index = i;
	}
	
	public int index(){
		return this.index;
	}
	
	public void add(int d){
		if(!disks.isEmpty()&&disks.peek() <= d){
			System.out.println("Erro placing..");
		}else{
			disks.push(d);
		}
	}
	
	public void moveTopTo(Tower t){
		int top = disks.pop();
		t.add(top);
		System.out.println("Move disk"+top+"from"+this.index()+"to"+t.index());
	}
	
	public void moveDisks(int n, Tower destination, Tower buffer){
		if(n>0){
			moveDisks(n-1, buffer, destination);
			this.moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
}
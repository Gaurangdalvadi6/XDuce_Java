package oopsConcept;
// 11/4/2024
interface chessPlayer{
	void moves();
}

interface check{
	void go();
}

class Queen implements chessPlayer,check{

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("up,down,left,right,cross");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("going");
	}
}

class Rook implements chessPlayer{

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("rook goes left,right,up,down");
	}
}

public class Interface_Example {
public static void main(String[] args) {
	Queen q = new Queen();
	q.moves();
	q.go();
	Rook r = new Rook();
	r.moves();
}
}

import ChessPiece.*;

public class TestPieces {
	
	public static void main (String [] args) {
	
	ChessPiece wPawn = new ChessPiece();	
	//System.out.println("This is a new pawn.");
	
	wPawn.setPieceType(" pawn");
	wPawn.setColor("white ");
	
	String prnt = wPawn.printInfo();
	System.out.println(prnt);
	
	ChessPiece bPawn = new ChessPiece();	
	//System.out.println("This is a new pawn.");
	
	bPawn.setPieceType(" pawn");
	bPawn.setColor("black ");
	
	prnt = bPawn.printInfo();
	System.out.println(prnt);
	}
}
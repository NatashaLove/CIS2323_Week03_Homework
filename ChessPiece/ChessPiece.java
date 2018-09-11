package ChessPiece;

public class ChessPiece {
	
	int position;
	String c;
	String n;
	
	
	
	
    public int getPosition(){
		return position;
	}
	
    public void setPosition(int x, int y){	
	}
	
	String getColor(){
	   return c;
    }
	
	public void setColor(String color){
	c=color;
	}
	
    String getPieceType(){
		return n;
	}
	
    public void setPieceType(String name){
	   n=name;
    }
	
	public String printInfo(){
	  return "Your chess piece is " + getColor() + getPieceType(); //  + getPosition
	}

}
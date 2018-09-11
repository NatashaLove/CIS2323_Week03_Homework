package ChessPiece;

public class ChessPiece {
	
	
	String c;
	String n;
	private int column; 
	private int row;
	
	
	// String position() {
		// return position;
	// }
	
    public String[] getPosition(){
		
		
		//locating memory for 2 new vars - position 2D
		String position[] = new String [2];
		
		//convert int to string
		String columnAsString = Integer.toString(column);
		String rowAsString = Integer.toString(row);
		position[0]=columnAsString;
		position[1]=rowAsString;
		return position;
	}
	
    public void setPosition(int x, int y){	
	column=x;
	row=y;
	}
	
	public String getColor(){
	   return c;
    }
	
	public void setColor(String color){
	c=color;
	}
	
    public String getPieceType(){
		return n;
	}
	
    public void setPieceType(String name){
	   n=name;
    }
	
	public String printInfo(){
	  return "Your chess piece is " + getColor() + getPieceType() + getPosition();
	}

}
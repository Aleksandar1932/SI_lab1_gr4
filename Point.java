class Point {
	String id;
	String color;
	double x,y;

	public Point(String id, String color, double x, double y){
		this.id = id;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	//Setters:
	
	public void setId(String newID){
		this.id = newID;	
	}

	public void setColor(String newColor){
		this.color = newColor;
	}

	public void setX(double newX){
		this.x = newX;
	}

	public void setY(double newY){
		this.y = newY;
	}

	//Getters:

	public String getId(){
		return this.id;
	}

	public String getColor(){
		return this.color;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public void move (char xDirection, char yDirection) {
		if(xDirection == 'L'){
			this.x -= 1;
		}
		else if(xDirection == 'R'){
			this.x += 1;
		}

		if(yDirection == 'U'){
			this.y += 1;
		}
		else if(yDirection == 'D'){
			this.y -= 1;
		}

	}

	public void draw () {
		System.out.println(String.format("(x = %d, y = %d)",x,y));
	}

}

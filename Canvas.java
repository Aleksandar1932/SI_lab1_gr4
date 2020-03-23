class Canvas{
	List<Point> pointsList;
	
	public Canvas(){
		pointsList = new ArrayList(); //inicijaliziranje na prazna lista so tocki	
	}

	public void addPoint(Point pointToAdd){
		pointsList.add(pointToAdd);	
	}
	
	public void removePoint(Point pointToRemove){
		pointsList.remove(pointToRemove);
	}

	public Double distanceBetweenPoints(Point pointOne, Point pointTo){
		Double x1 = pointOne.getX();
		Double x2 = pointTwo.getX();

		Double y1 = pointOne.getY();
		Double y2 = pointTwo.getY();

		return (Double) sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
	}
	
}

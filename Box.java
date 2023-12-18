package underStanding;

public class Box {
int width; 
int height;
int depth;
Box(Box obj){// passing the object of the box through a constructor
	width=obj.width;
	height=obj.height;
	depth=obj.depth;
}
Box(int w, int h, int d){// constructor with parameters to access the values
	width=w;
	height=h;
	depth=d;
}
Box(){// No arg constructor, passing the measurements seperately
	width= 2;
	height=3;
	depth=4;
}
Box(int l){// constructor, passing only one  measurement, where all measures are the same
	width=height=depth=l;
	
}
int volume() {
	return width*height*depth;
}

}

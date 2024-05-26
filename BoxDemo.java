class Box{
    double width;
    double height;
    double depth;
    // Box(){
    //     System.out.println("Constructing Box");
    //     width = 10;
    //     height = 10;
    //     depth = 10;
    // }
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width * height * depth;
    }
    // void setDim(double w, double h, double d){
    //     width = w;
    //     height = h;
    //     depth = d;
    // }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        double vol;
        // mybox1.setDim(10, 20, 15);
        // mybox2.setDim(3 ,6,9);
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

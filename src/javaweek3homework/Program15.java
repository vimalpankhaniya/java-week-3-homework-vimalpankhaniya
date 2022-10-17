package javaweek3homework;

public class Program15 {
    public class Wall {
        double width;
        double height;

        Wall() {
        }

        Wall(double width, double height) {
            //this.width=width;
            if (width < 0) {
                this.width = 0;
            }else{
                this.width=width;
            }
            if (height < 0) {
                this.height = 0;
            }else{
                this.height=height;
            }
        }

        public  void main(String[] args) {
            Wall wall = new Wall(5,4);
            System.out.println("Area:"+wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("Width:"+wall.getWidth());
            System.out.println("Height:"+wall.getHeight());
            System.out.println("Area:"+wall.getArea());
        }

        public double getWidth() {

            return this.width ;
        }

        public double getHeight() {

            return this.height;
        }

        public void setWidth(double width) {
            if (width > 0) {
                this.width = width;
            }
            this.width = 0;
        }

        public void setHeight(double height) {
            if (height >0) {
                this.height =height;
            }
            this.height = 0;
        }

        public double getArea() {
            double Area;
            Area = width*height;
            return Area;
        }
    }
}

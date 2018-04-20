package JPMC_Interview;

/**
 * Created by krishnasfamily on 06/08/16.
 */
//Check two rectangles are intersecting or not with  //input of triangle = x (bottomleft), y (bottomleft), width, height
//input of second triangle = x (bottomleft), y (bottomleft), width, height
public class RectangleIntersection {

        public static void main (String arg[]){

            //input of triangle = x (bottomleft), y (bottomleft), width, height
              /*
              int x = 1;
              int y = 1;
              int width =2;
              int height= 2; */


            int x = 1;
            int y = 1;
            int width =1;
            int height= 1;


            //input of second triangle = x (bottomleft), y (bottomleft), width, height
              /* int x1 = 2;
              int y1 = 2;
              int width1 =2;
              int height1= 2;*/

            int x1 = 3;
            int y1 = 3;
            int width1 =2;
            int height1= 2;


            //Calculating topleft and botton right coordinates from give input and creating point object.

            Point p1 = new Point(x, y+height);
            Point p2 = new Point(x+width, y);
            Point p3 = new Point(x1, y1+height1);
            Point p4 = new Point(x1+width1, y1);
            System.out.println(checkOverlap(p1,p2, p3, p4));


        }

        //This calculation works for topleft and bottonright coordinates of the given two rectangles
        static boolean checkOverlap(Point p1, Point p2, Point p3 , Point p4) {
            if(p1.getX() > p4.getX() || p3.getX() > p2.getX()){
                return false;
            }

            if(p1.getY() < p4.getY() || p3.getY() < p2.getY()){
                return false;
            }

            return true;
        }

        static class Point {
            int x;
            int y;

            Point(int x, int y) {
                this.x =x;
                this.y=y;
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }

        }

    }

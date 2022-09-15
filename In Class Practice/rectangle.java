public class rectangle {
    int width;
    int height;
    // constructor
    rectangle(int h, int w) {
        width = w;
        height = h;
    }
    // 3 different methods
    public int area(){
        return height * width;
    }

   public int perimeter(){
        return 2*height + 2*width;
    }

    public double diagonal(){
       return Math.sqrt(height*height + width*width);
    }

    public static void main(String[] args) {
       
       }

    }
}
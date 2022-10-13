package lessons6hw;

public class Student {
    float q, w, r;

static class StudentOut{

    float ret(float q, float w, float r) {
        float retOut = (q + w + r) / 3;
        return retOut;
    }
}

    public static void main(String[] args) {
        StudentOut s1 = new StudentOut();
        System.out.println(s1.ret(1, 3, 4));






    }
}







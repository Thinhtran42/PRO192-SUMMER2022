public class Circle {
    Point mid;
    double r;


    //composition
    public Circle() {
        r = 0;
        mid = new Point();
    }

    //aggregation
    public Circle(Point mid, double r) {
        this.mid = mid;
        this.r = r;
    }


    //Ham nay de lay quan he cua 2 circle
    // nó sẽ trả về 1: nếu 2 circle đồng tâm
    //              2: nếu 2 circle cách xa nhau
    //              3: nếu 2 circle tiếp xúc ngoài
    //              4: trường hợp còn lại
    public int getRelationship(Circle c) {
        double d = mid.getDistance(c.mid); // lấy khoảng cách 2 điểm :))
        double sum = r + c.r; // tổng bán kính của 2 hình tròn

        if (d == 0) {
            return 1;
        }
        //TODO
        return 4;
    }

}

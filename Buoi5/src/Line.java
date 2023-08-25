public class Line {

    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength(){
        int x1 = begin.getX();
        int y1 = begin.getX();
        int x2 = end.getX();
        int y2 = end.getX();
        return Math.sqrt((x1 - x2)*(y1 - y2)+(x1 - x2)*(y1 - y2));
    }

}

package k1;

import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final float a(@oy.l PointF pointF) {
        return pointF.x;
    }

    public static final int b(@oy.l Point point) {
        return point.x;
    }

    public static final float c(@oy.l PointF pointF) {
        return pointF.y;
    }

    public static final int d(@oy.l Point point) {
        return point.y;
    }

    @oy.l
    public static final Point e(@oy.l Point point, float f10) {
        return new Point(Math.round(point.x / f10), Math.round(point.y / f10));
    }

    @oy.l
    public static final PointF f(@oy.l PointF pointF, float f10) {
        return new PointF(pointF.x / f10, pointF.y / f10);
    }

    @oy.l
    public static final Point g(@oy.l Point point, int i10) {
        Point point2 = new Point(point.x, point.y);
        int i11 = -i10;
        point2.offset(i11, i11);
        return point2;
    }

    @oy.l
    public static final Point h(@oy.l Point point, @oy.l Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @oy.l
    public static final PointF i(@oy.l PointF pointF, float f10) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f11 = -f10;
        pointF2.offset(f11, f11);
        return pointF2;
    }

    @oy.l
    public static final PointF j(@oy.l PointF pointF, @oy.l PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @oy.l
    public static final Point k(@oy.l Point point, int i10) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i10, i10);
        return point2;
    }

    @oy.l
    public static final Point l(@oy.l Point point, @oy.l Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @oy.l
    public static final PointF m(@oy.l PointF pointF, float f10) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f10, f10);
        return pointF2;
    }

    @oy.l
    public static final PointF n(@oy.l PointF pointF, @oy.l PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @oy.l
    public static final Point o(@oy.l Point point, float f10) {
        return new Point(Math.round(point.x * f10), Math.round(point.y * f10));
    }

    @oy.l
    public static final PointF p(@oy.l PointF pointF, float f10) {
        return new PointF(pointF.x * f10, pointF.y * f10);
    }

    @oy.l
    public static final Point q(@oy.l PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @oy.l
    public static final PointF r(@oy.l Point point) {
        return new PointF(point);
    }

    @oy.l
    public static final Point s(@oy.l Point point) {
        return new Point(-point.x, -point.y);
    }

    @oy.l
    public static final PointF t(@oy.l PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }
}

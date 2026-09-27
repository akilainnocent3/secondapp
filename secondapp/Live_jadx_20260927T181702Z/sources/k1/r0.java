package k1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
public final class r0 {
    @oy.l
    public static final Rect A(@oy.l Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i10;
        rect2.left *= i10;
        rect2.right *= i10;
        rect2.bottom *= i10;
        return rect2;
    }

    @oy.l
    public static final RectF B(@oy.l RectF rectF, float f10) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @oy.l
    public static final RectF C(@oy.l RectF rectF, int i10) {
        float f10 = i10;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @oy.l
    public static final Rect D(@oy.l RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @oy.l
    public static final RectF E(@oy.l Rect rect) {
        return new RectF(rect);
    }

    @oy.l
    public static final Region F(@oy.l Rect rect) {
        return new Region(rect);
    }

    @oy.l
    public static final Region G(@oy.l RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @oy.l
    public static final RectF H(@oy.l RectF rectF, @oy.l Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @oy.l
    public static final Region I(@oy.l Rect rect, @oy.l Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @oy.l
    public static final Region J(@oy.l RectF rectF, @oy.l RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @oy.l
    @SuppressLint({"CheckResult"})
    public static final Rect a(@oy.l Rect rect, @oy.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @oy.l
    @SuppressLint({"CheckResult"})
    public static final RectF b(@oy.l RectF rectF, @oy.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(@oy.l RectF rectF) {
        return rectF.left;
    }

    public static final int d(@oy.l Rect rect) {
        return rect.left;
    }

    public static final float e(@oy.l RectF rectF) {
        return rectF.top;
    }

    public static final int f(@oy.l Rect rect) {
        return rect.top;
    }

    public static final float g(@oy.l RectF rectF) {
        return rectF.right;
    }

    public static final int h(@oy.l Rect rect) {
        return rect.right;
    }

    public static final float i(@oy.l RectF rectF) {
        return rectF.bottom;
    }

    public static final int j(@oy.l Rect rect) {
        return rect.bottom;
    }

    public static final boolean k(@oy.l Rect rect, @oy.l Point point) {
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(@oy.l RectF rectF, @oy.l PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @oy.l
    public static final Rect m(@oy.l Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        int i11 = -i10;
        rect2.offset(i11, i11);
        return rect2;
    }

    @oy.l
    public static final Rect n(@oy.l Rect rect, @oy.l Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @oy.l
    public static final RectF o(@oy.l RectF rectF, float f10) {
        RectF rectF2 = new RectF(rectF);
        float f11 = -f10;
        rectF2.offset(f11, f11);
        return rectF2;
    }

    @oy.l
    public static final RectF p(@oy.l RectF rectF, @oy.l PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @oy.l
    public static final Region q(@oy.l Rect rect, @oy.l Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @oy.l
    public static final Region r(@oy.l RectF rectF, @oy.l RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @oy.l
    public static final Rect s(@oy.l Rect rect, @oy.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @oy.l
    public static final RectF t(@oy.l RectF rectF, @oy.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @oy.l
    public static final Rect u(@oy.l Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i10, i10);
        return rect2;
    }

    @oy.l
    public static final Rect v(@oy.l Rect rect, @oy.l Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @oy.l
    public static final Rect w(@oy.l Rect rect, @oy.l Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @oy.l
    public static final RectF x(@oy.l RectF rectF, float f10) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f10, f10);
        return rectF2;
    }

    @oy.l
    public static final RectF y(@oy.l RectF rectF, @oy.l PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @oy.l
    public static final RectF z(@oy.l RectF rectF, @oy.l RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}

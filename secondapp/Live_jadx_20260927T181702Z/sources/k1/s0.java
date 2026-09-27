package k1;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import dr.w2;
import java.util.Iterator;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
public final class s0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<Rect>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public final RegionIterator f101709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final Rect f101710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f101711d;

        public a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f101709b = regionIterator;
            Rect rect = new Rect();
            this.f101710c = rect;
            this.f101711d = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (!this.f101711d) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.f101710c);
            this.f101711d = this.f101709b.next(this.f101710c);
            return rect;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f101711d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @oy.l
    public static final Region a(@oy.l Region region, @oy.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @oy.l
    public static final Region b(@oy.l Region region, @oy.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean c(@oy.l Region region, @oy.l Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void d(@oy.l Region region, @oy.l ds.l<? super Rect, w2> lVar) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                lVar.invoke(rect);
            }
        }
    }

    @oy.l
    public static final Iterator<Rect> e(@oy.l Region region) {
        return new a(region);
    }

    @oy.l
    public static final Region f(@oy.l Region region, @oy.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @oy.l
    public static final Region g(@oy.l Region region, @oy.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @oy.l
    public static final Region h(@oy.l Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @oy.l
    public static final Region i(@oy.l Region region, @oy.l Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @oy.l
    public static final Region j(@oy.l Region region, @oy.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @oy.l
    public static final Region k(@oy.l Region region, @oy.l Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @oy.l
    public static final Region l(@oy.l Region region, @oy.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @oy.l
    public static final Region m(@oy.l Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @oy.l
    public static final Region n(@oy.l Region region, @oy.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @oy.l
    public static final Region o(@oy.l Region region, @oy.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}

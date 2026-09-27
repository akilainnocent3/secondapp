package e2;

import android.annotation.SuppressLint;
import android.util.Range;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> implements ms.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Range<T> f79790b;

        public a(Range<T> range) {
            this.f79790b = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // ms.g
        public boolean a(@oy.l Comparable comparable) {
            return ms.g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // ms.g
        public Comparable d() {
            return this.f79790b.getUpper();
        }

        @Override // ms.g
        public boolean isEmpty() {
            return ms.g.a.b(this);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // ms.g
        public Comparable m() {
            return this.f79790b.getLower();
        }
    }

    @t0(21)
    @oy.l
    public static final <T extends Comparable<? super T>> Range<T> a(@oy.l Range<T> range, @oy.l Range<T> range2) {
        return range.intersect(range2);
    }

    @t0(21)
    @oy.l
    public static final <T extends Comparable<? super T>> Range<T> b(@oy.l Range<T> range, @oy.l Range<T> range2) {
        return range.extend(range2);
    }

    @t0(21)
    @oy.l
    public static final <T extends Comparable<? super T>> Range<T> c(@oy.l Range<T> range, @oy.l T t10) {
        return range.extend(t10);
    }

    @t0(21)
    @oy.l
    public static final <T extends Comparable<? super T>> Range<T> d(@oy.l T t10, @oy.l T t11) {
        return new Range<>(t10, t11);
    }

    @t0(21)
    @oy.l
    public static final <T extends Comparable<? super T>> ms.g<T> e(@oy.l Range<T> range) {
        return new a(range);
    }

    @t0(21)
    @oy.l
    public static final <T extends Comparable<? super T>> Range<T> f(@oy.l ms.g<T> gVar) {
        return new Range<>(gVar.m(), gVar.d());
    }
}

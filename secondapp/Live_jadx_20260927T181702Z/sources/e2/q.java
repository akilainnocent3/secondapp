package e2;

import android.util.LongSparseArray;
import dr.w2;
import fr.g1;
import java.util.Iterator;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,99:1\n77#1,4:100\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:100,4\n*E\n"})
public final class q {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends g1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LongSparseArray<T> f79820c;

        public a(LongSparseArray<T> longSparseArray) {
            this.f79820c = longSparseArray;
        }

        public final int a() {
            return this.f79819b;
        }

        public final void b(int i10) {
            this.f79819b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79819b < this.f79820c.size();
        }

        @Override // fr.g1
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f79820c;
            int i10 = this.f79819b;
            this.f79819b = i10 + 1;
            return longSparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<T> implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LongSparseArray<T> f79822c;

        public b(LongSparseArray<T> longSparseArray) {
            this.f79822c = longSparseArray;
        }

        public final int a() {
            return this.f79821b;
        }

        public final void b(int i10) {
            this.f79821b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79821b < this.f79822c.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.f79822c;
            int i10 = this.f79821b;
            this.f79821b = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@oy.l LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean b(@oy.l LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean c(@oy.l LongSparseArray<T> longSparseArray, T t10) {
        return longSparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@oy.l LongSparseArray<T> longSparseArray, @oy.l ds.p<? super Long, ? super T, w2> pVar) {
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    public static final <T> T e(@oy.l LongSparseArray<T> longSparseArray, long j10, T t10) {
        T t11 = longSparseArray.get(j10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@oy.l LongSparseArray<T> longSparseArray, long j10, @oy.l ds.a<? extends T> aVar) {
        T t10 = longSparseArray.get(j10);
        return t10 == null ? aVar.invoke() : t10;
    }

    public static final <T> int g(@oy.l LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean h(@oy.l LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean i(@oy.l LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @oy.l
    public static final <T> g1 j(@oy.l LongSparseArray<T> longSparseArray) {
        return new a(longSparseArray);
    }

    @oy.l
    public static final <T> LongSparseArray<T> k(@oy.l LongSparseArray<T> longSparseArray, @oy.l LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        l(longSparseArray3, longSparseArray);
        l(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void l(@oy.l LongSparseArray<T> longSparseArray, @oy.l LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(longSparseArray2.keyAt(i10), longSparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean m(@oy.l LongSparseArray<T> longSparseArray, long j10, T t10) {
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.m0.g(t10, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void n(@oy.l LongSparseArray<T> longSparseArray, long j10, T t10) {
        longSparseArray.put(j10, t10);
    }

    @oy.l
    public static final <T> Iterator<T> o(@oy.l LongSparseArray<T> longSparseArray) {
        return new b(longSparseArray);
    }
}

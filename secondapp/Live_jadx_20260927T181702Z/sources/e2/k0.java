package e2;

import android.util.SparseArray;
import dr.w2;
import fr.f1;
import java.util.Iterator;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
public final class k0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends f1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f79796c;

        public a(SparseArray<T> sparseArray) {
            this.f79796c = sparseArray;
        }

        public final int a() {
            return this.f79795b;
        }

        public final void b(int i10) {
            this.f79795b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79795b < this.f79796c.size();
        }

        @Override // fr.f1
        public int nextInt() {
            SparseArray<T> sparseArray = this.f79796c;
            int i10 = this.f79795b;
            this.f79795b = i10 + 1;
            return sparseArray.keyAt(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b<T> implements Iterator<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseArray<T> f79798c;

        public b(SparseArray<T> sparseArray) {
            this.f79798c = sparseArray;
        }

        public final int a() {
            return this.f79797b;
        }

        public final void b(int i10) {
            this.f79797b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79797b < this.f79798c.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f79798c;
            int i10 = this.f79797b;
            this.f79797b = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@oy.l SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean b(@oy.l SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean c(@oy.l SparseArray<T> sparseArray, T t10) {
        return sparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void d(@oy.l SparseArray<T> sparseArray, @oy.l ds.p<? super Integer, ? super T, w2> pVar) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
        }
    }

    public static final <T> T e(@oy.l SparseArray<T> sparseArray, int i10, T t10) {
        T t11 = sparseArray.get(i10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T f(@oy.l SparseArray<T> sparseArray, int i10, @oy.l ds.a<? extends T> aVar) {
        T t10 = sparseArray.get(i10);
        return t10 == null ? aVar.invoke() : t10;
    }

    public static final <T> int g(@oy.l SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean h(@oy.l SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean i(@oy.l SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @oy.l
    public static final <T> f1 j(@oy.l SparseArray<T> sparseArray) {
        return new a(sparseArray);
    }

    @oy.l
    public static final <T> SparseArray<T> k(@oy.l SparseArray<T> sparseArray, @oy.l SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        l(sparseArray3, sparseArray);
        l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void l(@oy.l SparseArray<T> sparseArray, @oy.l SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean m(@oy.l SparseArray<T> sparseArray, int i10, T t10) {
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.m0.g(t10, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void n(@oy.l SparseArray<T> sparseArray, int i10, T t10) {
        sparseArray.put(i10, t10);
    }

    @oy.l
    public static final <T> Iterator<T> o(@oy.l SparseArray<T> sparseArray) {
        return new b(sparseArray);
    }
}

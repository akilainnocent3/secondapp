package e2;

import android.util.SparseLongArray;
import dr.w2;
import fr.f1;
import fr.g1;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class n0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends f1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f79808c;

        public a(SparseLongArray sparseLongArray) {
            this.f79808c = sparseLongArray;
        }

        public final int a() {
            return this.f79807b;
        }

        public final void b(int i10) {
            this.f79807b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79807b < this.f79808c.size();
        }

        @Override // fr.f1
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f79808c;
            int i10 = this.f79807b;
            this.f79807b = i10 + 1;
            return sparseLongArray.keyAt(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends g1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseLongArray f79810c;

        public b(SparseLongArray sparseLongArray) {
            this.f79810c = sparseLongArray;
        }

        public final int a() {
            return this.f79809b;
        }

        public final void b(int i10) {
            this.f79809b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79809b < this.f79810c.size();
        }

        @Override // fr.g1
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f79810c;
            int i10 = this.f79809b;
            this.f79809b = i10 + 1;
            return sparseLongArray.valueAt(i10);
        }
    }

    public static final boolean a(@oy.l SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@oy.l SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@oy.l SparseLongArray sparseLongArray, long j10) {
        return sparseLongArray.indexOfValue(j10) >= 0;
    }

    public static final void d(@oy.l SparseLongArray sparseLongArray, @oy.l ds.p<? super Integer, ? super Long, w2> pVar) {
        int size = sparseLongArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
        }
    }

    public static final long e(@oy.l SparseLongArray sparseLongArray, int i10, long j10) {
        return sparseLongArray.get(i10, j10);
    }

    public static final long f(@oy.l SparseLongArray sparseLongArray, int i10, @oy.l ds.a<Long> aVar) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : aVar.invoke().longValue();
    }

    public static final int g(@oy.l SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean h(@oy.l SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean i(@oy.l SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @oy.l
    public static final f1 j(@oy.l SparseLongArray sparseLongArray) {
        return new a(sparseLongArray);
    }

    @oy.l
    public static final SparseLongArray k(@oy.l SparseLongArray sparseLongArray, @oy.l SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        l(sparseLongArray3, sparseLongArray);
        l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void l(@oy.l SparseLongArray sparseLongArray, @oy.l SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i10), sparseLongArray2.valueAt(i10));
        }
    }

    public static final boolean m(@oy.l SparseLongArray sparseLongArray, int i10, long j10) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || j10 != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void n(@oy.l SparseLongArray sparseLongArray, int i10, long j10) {
        sparseLongArray.put(i10, j10);
    }

    @oy.l
    public static final g1 o(@oy.l SparseLongArray sparseLongArray) {
        return new b(sparseLongArray);
    }
}

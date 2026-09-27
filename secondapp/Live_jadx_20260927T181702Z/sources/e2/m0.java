package e2;

import android.util.SparseIntArray;
import dr.w2;
import fr.f1;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class m0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends f1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseIntArray f79804c;

        public a(SparseIntArray sparseIntArray) {
            this.f79804c = sparseIntArray;
        }

        public final int a() {
            return this.f79803b;
        }

        public final void b(int i10) {
            this.f79803b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79803b < this.f79804c.size();
        }

        @Override // fr.f1
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f79804c;
            int i10 = this.f79803b;
            this.f79803b = i10 + 1;
            return sparseIntArray.keyAt(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseIntArray f79806c;

        public b(SparseIntArray sparseIntArray) {
            this.f79806c = sparseIntArray;
        }

        public final int a() {
            return this.f79805b;
        }

        public final void b(int i10) {
            this.f79805b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79805b < this.f79806c.size();
        }

        @Override // fr.f1
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f79806c;
            int i10 = this.f79805b;
            this.f79805b = i10 + 1;
            return sparseIntArray.valueAt(i10);
        }
    }

    public static final boolean a(@oy.l SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@oy.l SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@oy.l SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfValue(i10) >= 0;
    }

    public static final void d(@oy.l SparseIntArray sparseIntArray, @oy.l ds.p<? super Integer, ? super Integer, w2> pVar) {
        int size = sparseIntArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i10)), Integer.valueOf(sparseIntArray.valueAt(i10)));
        }
    }

    public static final int e(@oy.l SparseIntArray sparseIntArray, int i10, int i11) {
        return sparseIntArray.get(i10, i11);
    }

    public static final int f(@oy.l SparseIntArray sparseIntArray, int i10, @oy.l ds.a<Integer> aVar) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : aVar.invoke().intValue();
    }

    public static final int g(@oy.l SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean h(@oy.l SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean i(@oy.l SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @oy.l
    public static final f1 j(@oy.l SparseIntArray sparseIntArray) {
        return new a(sparseIntArray);
    }

    @oy.l
    public static final SparseIntArray k(@oy.l SparseIntArray sparseIntArray, @oy.l SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        l(sparseIntArray3, sparseIntArray);
        l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void l(@oy.l SparseIntArray sparseIntArray, @oy.l SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i10), sparseIntArray2.valueAt(i10));
        }
    }

    public static final boolean m(@oy.l SparseIntArray sparseIntArray, int i10, int i11) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || i11 != sparseIntArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void n(@oy.l SparseIntArray sparseIntArray, int i10, int i11) {
        sparseIntArray.put(i10, i11);
    }

    @oy.l
    public static final f1 o(@oy.l SparseIntArray sparseIntArray) {
        return new b(sparseIntArray);
    }
}

package e2;

import android.util.SparseBooleanArray;
import dr.w2;
import fr.f1;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
public final class l0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends f1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseBooleanArray f79800c;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.f79800c = sparseBooleanArray;
        }

        public final int a() {
            return this.f79799b;
        }

        public final void b(int i10) {
            this.f79799b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79799b < this.f79800c.size();
        }

        @Override // fr.f1
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f79800c;
            int i10 = this.f79799b;
            this.f79799b = i10 + 1;
            return sparseBooleanArray.keyAt(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends fr.c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SparseBooleanArray f79802c;

        public b(SparseBooleanArray sparseBooleanArray) {
            this.f79802c = sparseBooleanArray;
        }

        @Override // fr.c0
        public boolean b() {
            SparseBooleanArray sparseBooleanArray = this.f79802c;
            int i10 = this.f79801b;
            this.f79801b = i10 + 1;
            return sparseBooleanArray.valueAt(i10);
        }

        public final int d() {
            return this.f79801b;
        }

        public final void e(int i10) {
            this.f79801b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79801b < this.f79802c.size();
        }
    }

    public static final boolean a(@oy.l SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean b(@oy.l SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean c(@oy.l SparseBooleanArray sparseBooleanArray, boolean z10) {
        return sparseBooleanArray.indexOfValue(z10) >= 0;
    }

    public static final void d(@oy.l SparseBooleanArray sparseBooleanArray, @oy.l ds.p<? super Integer, ? super Boolean, w2> pVar) {
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i10)), Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
        }
    }

    public static final boolean e(@oy.l SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        return sparseBooleanArray.get(i10, z10);
    }

    public static final boolean f(@oy.l SparseBooleanArray sparseBooleanArray, int i10, @oy.l ds.a<Boolean> aVar) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : aVar.invoke().booleanValue();
    }

    public static final int g(@oy.l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean h(@oy.l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean i(@oy.l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @oy.l
    public static final f1 j(@oy.l SparseBooleanArray sparseBooleanArray) {
        return new a(sparseBooleanArray);
    }

    @oy.l
    public static final SparseBooleanArray k(@oy.l SparseBooleanArray sparseBooleanArray, @oy.l SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        l(sparseBooleanArray3, sparseBooleanArray);
        l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void l(@oy.l SparseBooleanArray sparseBooleanArray, @oy.l SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i10), sparseBooleanArray2.valueAt(i10));
        }
    }

    public static final boolean m(@oy.l SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || z10 != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i10);
        return true;
    }

    public static final void n(@oy.l SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        sparseBooleanArray.put(i10, z10);
    }

    @oy.l
    public static final fr.c0 o(@oy.l SparseBooleanArray sparseBooleanArray) {
        return new b(sparseBooleanArray);
    }
}

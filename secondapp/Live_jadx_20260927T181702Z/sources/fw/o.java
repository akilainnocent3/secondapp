package fw;

import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final fr.m<char[]> f85480a = new fr.m<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85481b;

    public final void a(@oy.l char[] array) {
        kotlin.jvm.internal.m0.p(array, "array");
        synchronized (this) {
            try {
                if (this.f85481b + array.length < j.f85457a) {
                    this.f85481b += array.length;
                    this.f85480a.addLast(array);
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @oy.l
    public final char[] b(int i10) {
        char[] cArrX;
        synchronized (this) {
            cArrX = this.f85480a.x();
            if (cArrX != null) {
                this.f85481b -= cArrX.length;
            } else {
                cArrX = null;
            }
        }
        return cArrX == null ? new char[i10] : cArrX;
    }
}

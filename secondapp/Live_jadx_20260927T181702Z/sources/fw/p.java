package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBatchSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final p f85493c = new p();

    public final void c(@oy.l char[] array) {
        kotlin.jvm.internal.m0.p(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    @oy.l
    public final char[] d() {
        return super.b(16384);
    }
}

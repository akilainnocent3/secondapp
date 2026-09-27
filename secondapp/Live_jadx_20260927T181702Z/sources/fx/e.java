package fx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@dr.o(message = "changed in Okio 2.x")
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final e f85574a = new e();

    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@oy.l String string) {
        kotlin.jvm.internal.m0.p(string, "string");
        return i1.l(string, 0, 0, 3, null);
    }

    @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@oy.l String string, int i10, int i11) {
        kotlin.jvm.internal.m0.p(string, "string");
        return i1.k(string, i10, i11);
    }
}

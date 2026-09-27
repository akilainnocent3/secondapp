package dw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@dr.f1
public abstract class o2<Array> {
    public static /* synthetic */ void c(o2 o2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = o2Var.d() + 1;
        }
        o2Var.b(i10);
    }

    public abstract Array a();

    public abstract void b(int i10);

    public abstract int d();
}

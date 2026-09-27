package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z2 extends n0 {
    @j2
    @oy.m
    public final String A0() {
        z2 z2VarZ0;
        z2 z2VarE = l1.e();
        if (this == z2VarE) {
            return "Dispatchers.Main";
        }
        try {
            z2VarZ0 = z2VarE.z0();
        } catch (UnsupportedOperationException unused) {
            z2VarZ0 = null;
        }
        if (this == z2VarZ0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // jv.n0
    @oy.l
    public n0 p0(int i10, @oy.m String str) {
        qv.a0.a(i10);
        return qv.a0.b(this, str);
    }

    @Override // jv.n0
    @oy.l
    public String toString() {
        String strA0 = A0();
        if (strA0 != null) {
            return strA0;
        }
        return x0.a(this) + '@' + x0.b(this);
    }

    @oy.l
    public abstract z2 z0();
}

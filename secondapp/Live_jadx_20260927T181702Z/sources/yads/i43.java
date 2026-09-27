package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i43 implements dq2 {
    @Override // yads.dq2
    public final Object a(wp2 wp2Var) {
        byte[] bArr = wp2Var.f157474b.f157962a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, t01.a(wp2Var.f157475c));
        } catch (Exception unused) {
            return new String(bArr, cv.g.f77202b);
        }
    }
}

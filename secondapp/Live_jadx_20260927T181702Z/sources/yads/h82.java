package yads;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h82 implements g82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f149972a;

    public /* synthetic */ h82() {
        this(new hn());
    }

    public final String a(wp2 wp2Var) {
        byte[] bArr = wp2Var.f157474b.f157962a;
        if (bArr == null) {
            return null;
        }
        String strC = t01.c(wp2Var.f157475c, u11.T);
        if (strC != null && !Boolean.parseBoolean(strC)) {
            return new String(bArr, cv.g.f77202b);
        }
        this.f149972a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), cv.g.f77202b);
        } catch (Exception unused) {
            String str = new String(bArr, cv.g.f77202b);
            boolean z10 = ad1.f146762a;
            return str;
        }
    }

    public h82(hn hnVar) {
        this.f149972a = hnVar;
    }
}

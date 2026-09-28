package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes5.dex */
public final class xz80 {
    public final azm a;

    public xz80(azm azmVar) {
        azmVar.getClass();
        this.a = azmVar;
    }

    public final void a(wz80 wz80Var) {
        wz80Var.getClass();
        ngs ngsVarB = a.b();
        kvs.a("imageUri", wz80Var.a, ngsVarB);
        kvs.a("imageWithUserUri", wz80Var.b, ngsVarB);
        kvs.a("linkUrl", wz80Var.c, ngsVarB);
        kvs.a("shareCode", wz80Var.d, ngsVarB);
        kvs.a("alreadyPublished", String.valueOf(wz80Var.f), ngsVarB);
        kvs.a("isSingleBetBuilder", String.valueOf(wz80Var.g), ngsVarB);
        String str = wz80Var.h;
        if (str != null) {
            kvs.a("username", str, ngsVarB);
        }
        String str2 = wz80Var.i;
        if (str2 != null) {
            kvs.a("avatarUri", str2, ngsVarB);
        }
        String str3 = wz80Var.j;
        if (str3 != null) {
            kvs.a("source", str3, ngsVarB);
        }
        String str4 = wz80Var.k;
        if (str4 != null) {
            kvs.a("orderId", str4, ngsVarB);
        }
        String str5 = wz80Var.l;
        if (str5 != null) {
            kvs.a("userNote", str5, ngsVarB);
        }
        this.a.f(wae.SHARE, a.a(ngsVarB));
    }
}

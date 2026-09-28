package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vuy {
    public static final zuy a(uvy uvyVar) {
        if (uvyVar == null) {
            return zuy.a;
        }
        boolean z = uvyVar.d;
        boolean z2 = uvyVar.b;
        boolean z3 = uvyVar.c;
        boolean z4 = uvyVar.a;
        if (z4 && z3 && z2 && z) {
            return zuy.b;
        }
        if (z4 && z2) {
            return zuy.c;
        }
        return (z3 && z) ? zuy.d : zuy.a;
    }

    public static final hvy b(avy avyVar) {
        avyVar.getClass();
        int iOrdinal = avyVar.ordinal();
        if (iOrdinal == 0) {
            return hvy.a;
        }
        if (iOrdinal == 1) {
            return hvy.b;
        }
        if (iOrdinal == 2) {
            return hvy.c;
        }
        uhc.a();
        return null;
    }
}

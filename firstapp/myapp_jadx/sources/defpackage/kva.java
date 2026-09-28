package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kva {
    public static final msw<jva> a;

    static {
        ws50 ws50Var = x68.e;
        int i = ws50Var.c;
        iva ivaVar = new iva(ws50Var, ws50Var, 1);
        int i2 = ws50Var.c;
        umy umyVar = x68.x;
        int i3 = (umyVar.c << 6) | i2;
        jva jvaVar = new jva(ws50Var, umyVar, 0);
        int i4 = (i2 << 6) | umyVar.c;
        jva jvaVar2 = new jva(umyVar, ws50Var, 0);
        msw mswVar = hwo.a;
        msw<jva> mswVar2 = new msw<>();
        mswVar2.h(i | (i << 6), ivaVar);
        mswVar2.h(i3, jvaVar);
        mswVar2.h(i4, jvaVar2);
        a = mswVar2;
    }
}

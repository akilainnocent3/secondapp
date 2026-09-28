package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class h160 implements Comparator<bb80> {
    public static final h160 a = new h160();

    @Override // java.util.Comparator
    public final int compare(bb80 bb80Var, bb80 bb80Var2) {
        lk40 lk40VarH = bb80Var.h();
        lk40 lk40VarH2 = bb80Var2.h();
        int iCompare = Float.compare(lk40VarH2.c, lk40VarH.c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(lk40VarH.b, lk40VarH2.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(lk40VarH.d, lk40VarH2.d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(lk40VarH2.a, lk40VarH.a);
    }
}

package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class v4u implements Comparator<bb80> {
    public static final v4u a = new v4u();

    @Override // java.util.Comparator
    public final int compare(bb80 bb80Var, bb80 bb80Var2) {
        lk40 lk40VarH = bb80Var.h();
        lk40 lk40VarH2 = bb80Var2.h();
        int iCompare = Float.compare(lk40VarH.a, lk40VarH2.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(lk40VarH.b, lk40VarH2.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(lk40VarH.d, lk40VarH2.d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(lk40VarH.c, lk40VarH2.c);
    }
}

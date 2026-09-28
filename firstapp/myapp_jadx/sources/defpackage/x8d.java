package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class x8d implements tr, yr {
    public static final x8d a = new x8d();
    public static final opf0 b = new opf0(Logger.getLogger(x8d.class.getName()));

    public static tr c(bj1 bj1Var, boolean z) {
        tm tmVar = bj1Var.h;
        switch (bj1Var.f.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                return hfe0.a;
            case 2:
                return (!z || tmVar.b() == null) ? c0h.c : new c0h(tmVar.b());
            case 5:
            case 6:
                return lor.a;
            default:
                b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + bj1Var, null);
                return oef.a;
        }
    }

    @Override // defpackage.yr
    public final boolean a(bj1 bj1Var) {
        return ((yr) c(bj1Var, false)).a(bj1Var);
    }

    @Override // defpackage.yr
    public final xr b(bj1 bj1Var, oug ougVar, amv amvVar) {
        return ((yr) c(bj1Var, true)).b(bj1Var, ougVar, amvVar);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}

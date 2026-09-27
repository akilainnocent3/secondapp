package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g4 {
    public static h4 a(e82 e82Var) {
        m4 m4Var;
        int i10 = e82Var != null ? e82Var.f148571a : -1;
        boolean z10 = ad1.f146762a;
        if (204 == i10) {
            m4Var = m4.f152299d;
        } else {
            Map map = e82Var != null ? e82Var.f148573c : null;
            Integer numValueOf = e82Var != null ? Integer.valueOf(e82Var.f148571a) : null;
            if (numValueOf != null && 400 == numValueOf.intValue() && map != null && t01.b(map, u11.N)) {
                m4Var = m4.f152303h;
            } else if (403 == i10) {
                m4Var = m4.f152302g;
            } else if (404 == i10) {
                m4Var = m4.f152297b;
            } else if (500 > i10 || i10 > 599) {
                m4Var = -1 == i10 ? m4.f152307l : m4.f152300e;
            } else {
                m4Var = m4.f152301f;
            }
        }
        return new h4(m4Var, e82Var);
    }
}

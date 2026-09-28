package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rdc0 {
    public static final jnc0 a(enc0 enc0Var, lbc0 lbc0Var) {
        List list;
        String str = enc0Var != null ? enc0Var.b : null;
        String str2 = enc0Var != null ? enc0Var.d : null;
        boolean z = enc0Var != null ? enc0Var.e : false;
        int i = enc0Var != null ? enc0Var.f : 0;
        if (enc0Var == null || (list = enc0Var.g) == null) {
            list = m2g.a;
        }
        return new jnc0(str, str2, z, i, list, lbc0Var);
    }
}

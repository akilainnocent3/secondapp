package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class v8e0 {
    public static final Set<pd80> a;

    static {
        hbh0.b.getClass();
        nbh0.b.getClass();
        nah0.b.getClass();
        wbh0.b.getClass();
        a = ay0.V(new pd80[]{mbh0.b, rbh0.b, rah0.b, ach0.b});
    }

    public static final boolean a(pd80 pd80Var) {
        pd80Var.getClass();
        return pd80Var.isInline() && a.contains(pd80Var);
    }
}

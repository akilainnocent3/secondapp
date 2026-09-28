package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class prd0 {
    public static final prd0 a;
    public static final prd0 b;
    public static final prd0 c;
    public static final prd0 d;
    public static final prd0 e;
    public static final prd0 f;
    public static final /* synthetic */ prd0[] i;

    public prd0() {
        throw null;
    }

    public static prd0 valueOf(String str) {
        return (prd0) Enum.valueOf(prd0.class, str);
    }

    public static prd0[] values() {
        return (prd0[]) i.clone();
    }

    static {
        prd0 prd0Var = new prd0("NONE", 0);
        a = prd0Var;
        prd0 prd0Var2 = new prd0("DOT_INPUT", 1);
        b = prd0Var2;
        prd0 prd0Var3 = new prd0("LESS_THAN_MIN", 2);
        c = prd0Var3;
        prd0 prd0Var4 = new prd0("MORE_THAN_MAX", 3);
        d = prd0Var4;
        prd0 prd0Var5 = new prd0(sgwpmp.zsXMzUPVc, 4);
        e = prd0Var5;
        prd0 prd0Var6 = new prd0("INVALID_INPUT", 5);
        f = prd0Var6;
        i = new prd0[]{prd0Var, prd0Var2, prd0Var3, prd0Var4, prd0Var5, prd0Var6};
    }
}

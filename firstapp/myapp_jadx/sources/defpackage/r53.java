package defpackage;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class r53 {
    public static final r53 a;
    public static final r53 b;
    public static final r53 c;
    public static final r53 d;
    public static final r53 e;
    public static final r53 f;
    public static final r53 i;
    public static final /* synthetic */ r53[] v;

    public r53() {
        throw null;
    }

    public static r53 valueOf(String str) {
        return (r53) Enum.valueOf(r53.class, str);
    }

    public static r53[] values() {
        return (r53[]) v.clone();
    }

    static {
        r53 r53Var = new r53("NONE", 0);
        a = r53Var;
        r53 r53Var2 = new r53("SINGLE_TO_MULTIPLE", 1);
        b = r53Var2;
        r53 r53Var3 = new r53(jbkEboCkTqmGf.jMwvGGlcfxaBMvj, 2);
        c = r53Var3;
        r53 r53Var4 = new r53("MULTIPLE_TO_SINGLE", 3);
        d = r53Var4;
        r53 r53Var5 = new r53("MULTIPLE_TO_SYSTEM", 4);
        e = r53Var5;
        r53 r53Var6 = new r53("SYSTEM_TO_SINGLE", 5);
        f = r53Var6;
        r53 r53Var7 = new r53("SYSTEM_TO_MULTIPLE", 6);
        i = r53Var7;
        v = new r53[]{r53Var, r53Var2, r53Var3, r53Var4, r53Var5, r53Var6, r53Var7};
    }
}

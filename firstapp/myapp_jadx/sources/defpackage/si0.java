package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class si0 {
    public static final si0 a;
    public static final si0 b;
    public static final si0 c;
    public static final si0 d;
    public static final si0 e;
    public static final si0 f;
    public static final si0 i;
    public static final si0 v;
    public static final si0 w;
    public static final /* synthetic */ si0[] y;

    static {
        si0 si0Var = new si0("NO_ANIMATION", 0);
        a = si0Var;
        si0 si0Var2 = new si0("CHEST_FADE_IN", 1);
        b = si0Var2;
        si0 si0Var3 = new si0("CHEST_LOTTIE_ANIMATION", 2);
        c = si0Var3;
        si0 si0Var4 = new si0("EXPAND", 3);
        d = si0Var4;
        si0 si0Var5 = new si0("PROGRESS", 4);
        e = si0Var5;
        si0 si0Var6 = new si0("MISSION_ENDS_IN", 5);
        f = si0Var6;
        si0 si0Var7 = new si0("CAMPAIGN_EXPIRY_TIME", 6);
        i = si0Var7;
        si0 si0Var8 = new si0("CHEST_OPEN", 7);
        v = si0Var8;
        si0 si0Var9 = new si0("DONE", 8);
        w = si0Var9;
        y = new si0[]{si0Var, si0Var2, si0Var3, si0Var4, si0Var5, si0Var6, si0Var7, si0Var8, si0Var9};
    }

    public si0() {
        throw null;
    }

    public static si0 valueOf(String str) {
        return (si0) Enum.valueOf(si0.class, str);
    }

    public static si0[] values() {
        return (si0[]) y.clone();
    }
}

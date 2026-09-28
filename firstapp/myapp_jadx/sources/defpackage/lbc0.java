package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lbc0 {
    public static final lbc0 a;
    public static final lbc0 b;
    public static final lbc0 c;
    public static final lbc0 d;
    public static final lbc0 e;
    public static final lbc0 f;
    public static final /* synthetic */ lbc0[] i;

    static {
        lbc0 lbc0Var = new lbc0("INACTIVE", 0);
        a = lbc0Var;
        lbc0 lbc0Var2 = new lbc0("ACTIVE_BLUE", 1);
        b = lbc0Var2;
        lbc0 lbc0Var3 = new lbc0("ACTIVE_RED", 2);
        c = lbc0Var3;
        lbc0 lbc0Var4 = new lbc0("SELECTED_BLUE", 3);
        d = lbc0Var4;
        lbc0 lbc0Var5 = new lbc0("SELECTED_RED", 4);
        e = lbc0Var5;
        lbc0 lbc0Var6 = new lbc0("CUTSCENE", 5);
        f = lbc0Var6;
        i = new lbc0[]{lbc0Var, lbc0Var2, lbc0Var3, lbc0Var4, lbc0Var5, lbc0Var6};
    }

    public lbc0() {
        throw null;
    }

    public static lbc0 valueOf(String str) {
        return (lbc0) Enum.valueOf(lbc0.class, str);
    }

    public static lbc0[] values() {
        return (lbc0[]) i.clone();
    }
}

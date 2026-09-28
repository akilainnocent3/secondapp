package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c45 {
    public static final c45 a;
    public static final c45 b;
    public static final c45 c;
    public static final c45 d;
    public static final c45 e;
    public static final /* synthetic */ c45[] f;

    static {
        c45 c45Var = new c45("SWIPE_BET", 0);
        a = c45Var;
        c45 c45Var2 = new c45("RECENT_CODE", 1);
        b = c45Var2;
        c45 c45Var3 = new c45("CODE_HUB", 2);
        c = c45Var3;
        c45 c45Var4 = new c45("MULTI_MAKER", 3);
        d = c45Var4;
        c45 c45Var5 = new c45("NONE", 4);
        e = c45Var5;
        f = new c45[]{c45Var, c45Var2, c45Var3, c45Var4, c45Var5};
    }

    public c45() {
        throw null;
    }

    public static c45 valueOf(String str) {
        return (c45) Enum.valueOf(c45.class, str);
    }

    public static c45[] values() {
        return (c45[]) f.clone();
    }
}

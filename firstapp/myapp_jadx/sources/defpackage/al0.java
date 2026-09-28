package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class al0 {
    public static final al0 a;
    public static final al0 b;
    public static final al0 c;
    public static final al0 d;
    public static final al0 e;
    public static final al0 f;
    public static final al0 i;
    public static final /* synthetic */ al0[] v;

    static {
        al0 al0Var = new al0("Paragraph", 0);
        a = al0Var;
        al0 al0Var2 = new al0("Span", 1);
        b = al0Var2;
        al0 al0Var3 = new al0("VerbatimTts", 2);
        c = al0Var3;
        al0 al0Var4 = new al0("Url", 3);
        d = al0Var4;
        al0 al0Var5 = new al0("Link", 4);
        e = al0Var5;
        al0 al0Var6 = new al0("Clickable", 5);
        f = al0Var6;
        al0 al0Var7 = new al0("String", 6);
        i = al0Var7;
        v = new al0[]{al0Var, al0Var2, al0Var3, al0Var4, al0Var5, al0Var6, al0Var7};
    }

    public al0() {
        throw null;
    }

    public static al0 valueOf(String str) {
        return (al0) Enum.valueOf(al0.class, str);
    }

    public static al0[] values() {
        return (al0[]) v.clone();
    }
}

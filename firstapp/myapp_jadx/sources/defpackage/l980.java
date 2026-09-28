package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l980 {
    public static final l980 a;
    public static final l980 b;
    public static final l980 c;
    public static final l980 d;
    public static final l980 e;
    public static final /* synthetic */ l980[] f;

    static {
        l980 l980Var = new l980("START_RANGE_DAY_WITHOUT_END", 0);
        a = l980Var;
        l980 l980Var2 = new l980("START_RANGE_DAY", 1);
        b = l980Var2;
        l980 l980Var3 = new l980("END_RANGE_DAY", 2);
        c = l980Var3;
        l980 l980Var4 = new l980("RANGE_DAY", 3);
        d = l980Var4;
        l980 l980Var5 = new l980("SINGLE_DAY", 4);
        e = l980Var5;
        f = new l980[]{l980Var, l980Var2, l980Var3, l980Var4, l980Var5};
    }

    public l980() {
        throw null;
    }

    public static l980 valueOf(String str) {
        return (l980) Enum.valueOf(l980.class, str);
    }

    public static l980[] values() {
        return (l980[]) f.clone();
    }
}

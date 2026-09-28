package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k590 {
    public static final k590 a;
    public static final k590 b;
    public static final k590 c;
    public static final /* synthetic */ k590[] d;

    static {
        k590 k590Var = new k590("Hidden", 0);
        a = k590Var;
        k590 k590Var2 = new k590("Expanded", 1);
        b = k590Var2;
        k590 k590Var3 = new k590("PartiallyExpanded", 2);
        c = k590Var3;
        d = new k590[]{k590Var, k590Var2, k590Var3};
    }

    public k590() {
        throw null;
    }

    public static k590 valueOf(String str) {
        return (k590) Enum.valueOf(k590.class, str);
    }

    public static k590[] values() {
        return (k590[]) d.clone();
    }
}

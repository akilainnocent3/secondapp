package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nmf0 {
    public static final nmf0 a;
    public static final /* synthetic */ nmf0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    nmf0 EF0;

    static {
        nmf0 nmf0Var = new nmf0("Shown", 0);
        nmf0 nmf0Var2 = new nmf0("Hidden", 1);
        a = nmf0Var2;
        b = new nmf0[]{nmf0Var, nmf0Var2};
    }

    public nmf0() {
        throw null;
    }

    public static nmf0 valueOf(String str) {
        return (nmf0) Enum.valueOf(nmf0.class, str);
    }

    public static nmf0[] values() {
        return (nmf0[]) b.clone();
    }
}

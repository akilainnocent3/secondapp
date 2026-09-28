package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class atd0 {
    public static final atd0 a;
    public static final atd0 b;
    public static final atd0 c;
    public static final atd0 d;
    public static final /* synthetic */ atd0[] e;

    static {
        atd0 atd0Var = new atd0("AVAILABLE", 0);
        a = atd0Var;
        atd0 atd0Var2 = new atd0("USED", 1);
        b = atd0Var2;
        atd0 atd0Var3 = new atd0("DISABLED", 2);
        c = atd0Var3;
        atd0 atd0Var4 = new atd0("UNAVAILABLE_AFTER_USE", 3);
        d = atd0Var4;
        e = new atd0[]{atd0Var, atd0Var2, atd0Var3, atd0Var4};
    }

    public atd0() {
        throw null;
    }

    public static atd0 valueOf(String str) {
        return (atd0) Enum.valueOf(atd0.class, str);
    }

    public static atd0[] values() {
        return (atd0[]) e.clone();
    }
}

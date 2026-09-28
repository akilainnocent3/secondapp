package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kqh0 {
    public static final kqh0 a;
    public static final kqh0 b;
    public static final kqh0 c;
    public static final kqh0 d;
    public static final kqh0 e;
    public static final kqh0 f;
    public static final /* synthetic */ kqh0[] i;

    static {
        kqh0 kqh0Var = new kqh0("Idle", 0);
        a = kqh0Var;
        kqh0 kqh0Var2 = new kqh0("Checking", 1);
        b = kqh0Var2;
        kqh0 kqh0Var3 = new kqh0("Available", 2);
        c = kqh0Var3;
        kqh0 kqh0Var4 = new kqh0("Taken", 3);
        d = kqh0Var4;
        kqh0 kqh0Var5 = new kqh0("Restricted", 4);
        e = kqh0Var5;
        kqh0 kqh0Var6 = new kqh0("Error", 5);
        f = kqh0Var6;
        i = new kqh0[]{kqh0Var, kqh0Var2, kqh0Var3, kqh0Var4, kqh0Var5, kqh0Var6};
    }

    public kqh0() {
        throw null;
    }

    public static kqh0 valueOf(String str) {
        return (kqh0) Enum.valueOf(kqh0.class, str);
    }

    public static kqh0[] values() {
        return (kqh0[]) i.clone();
    }
}

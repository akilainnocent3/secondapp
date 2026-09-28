package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d9e0 {
    public static final d9e0 a;
    public static final d9e0 b;
    public static final d9e0 c;
    public static final /* synthetic */ d9e0[] d;

    static {
        d9e0 d9e0Var = new d9e0("LENIENT", 0);
        a = d9e0Var;
        d9e0 d9e0Var2 = new d9e0("LEGACY_STRICT", 1);
        b = d9e0Var2;
        d9e0 d9e0Var3 = new d9e0("STRICT", 2);
        c = d9e0Var3;
        d = new d9e0[]{d9e0Var, d9e0Var2, d9e0Var3};
    }

    public d9e0() {
        throw null;
    }

    public static d9e0 valueOf(String str) {
        return (d9e0) Enum.valueOf(d9e0.class, str);
    }

    public static d9e0[] values() {
        return (d9e0[]) d.clone();
    }
}

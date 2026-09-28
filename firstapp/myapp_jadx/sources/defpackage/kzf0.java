package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kzf0 {
    public static final kzf0 a;
    public static final kzf0 b;
    public static final /* synthetic */ kzf0[] c;

    static {
        kzf0 kzf0Var = new kzf0("On", 0);
        a = kzf0Var;
        kzf0 kzf0Var2 = new kzf0("Off", 1);
        b = kzf0Var2;
        c = new kzf0[]{kzf0Var, kzf0Var2, new kzf0("Indeterminate", 2)};
    }

    public kzf0() {
        throw null;
    }

    public static kzf0 valueOf(String str) {
        return (kzf0) Enum.valueOf(kzf0.class, str);
    }

    public static kzf0[] values() {
        return (kzf0[]) c.clone();
    }
}

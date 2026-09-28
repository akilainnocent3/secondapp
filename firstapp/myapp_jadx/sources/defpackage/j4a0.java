package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j4a0 {
    public static final j4a0 a;
    public static final j4a0 b;
    public static final /* synthetic */ j4a0[] c;

    static {
        j4a0 j4a0Var = new j4a0("Dismissed", 0);
        a = j4a0Var;
        j4a0 j4a0Var2 = new j4a0("ActionPerformed", 1);
        b = j4a0Var2;
        c = new j4a0[]{j4a0Var, j4a0Var2};
    }

    public j4a0() {
        throw null;
    }

    public static j4a0 valueOf(String str) {
        return (j4a0) Enum.valueOf(j4a0.class, str);
    }

    public static j4a0[] values() {
        return (j4a0[]) c.clone();
    }
}

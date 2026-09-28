package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j790 {
    public static final j790 a;
    public static final j790 b;
    public static final /* synthetic */ j790[] c;

    static {
        j790 j790Var = new j790("RISKY", 0);
        a = j790Var;
        j790 j790Var2 = new j790("SIMPLE", 1);
        b = j790Var2;
        c = new j790[]{j790Var, j790Var2};
    }

    public j790() {
        throw null;
    }

    public static j790 valueOf(String str) {
        return (j790) Enum.valueOf(j790.class, str);
    }

    public static j790[] values() {
        return (j790[]) c.clone();
    }
}

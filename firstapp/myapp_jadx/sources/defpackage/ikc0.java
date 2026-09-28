package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ikc0 {
    public static final ikc0 a;
    public static final ikc0 b;
    public static final /* synthetic */ ikc0[] c;

    static {
        ikc0 ikc0Var = new ikc0("LITE", 0);
        a = ikc0Var;
        ikc0 ikc0Var2 = new ikc0("PLAYER", 1);
        b = ikc0Var2;
        c = new ikc0[]{ikc0Var, ikc0Var2};
    }

    public ikc0() {
        throw null;
    }

    public static ikc0 valueOf(String str) {
        return (ikc0) Enum.valueOf(ikc0.class, str);
    }

    public static ikc0[] values() {
        return (ikc0[]) c.clone();
    }
}

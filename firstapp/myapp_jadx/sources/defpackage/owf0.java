package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class owf0 {
    public static final owf0 a;
    public static final owf0 b;
    public static final /* synthetic */ owf0[] c;

    static {
        owf0 owf0Var = new owf0("Date", 0);
        a = owf0Var;
        owf0 owf0Var2 = new owf0("DateTime", 1);
        b = owf0Var2;
        c = new owf0[]{owf0Var, owf0Var2};
    }

    public owf0() {
        throw null;
    }

    public static owf0 valueOf(String str) {
        return (owf0) Enum.valueOf(owf0.class, str);
    }

    public static owf0[] values() {
        return (owf0[]) c.clone();
    }
}

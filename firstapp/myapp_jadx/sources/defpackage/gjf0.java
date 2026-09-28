package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gjf0 {
    public static final gjf0 a;
    public static final gjf0 b;
    public static final /* synthetic */ gjf0[] c;

    static {
        gjf0 gjf0Var = new gjf0("Filled", 0);
        a = gjf0Var;
        gjf0 gjf0Var2 = new gjf0("Outlined", 1);
        b = gjf0Var2;
        c = new gjf0[]{gjf0Var, gjf0Var2};
    }

    public gjf0() {
        throw null;
    }

    public static gjf0 valueOf(String str) {
        return (gjf0) Enum.valueOf(gjf0.class, str);
    }

    public static gjf0[] values() {
        return (gjf0[]) c.clone();
    }
}

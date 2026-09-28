package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r8d0 {
    public static final r8d0 a;
    public static final /* synthetic */ r8d0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    r8d0 EF0;

    static {
        r8d0 r8d0Var = new r8d0("DEPOSIT", 0);
        r8d0 r8d0Var2 = new r8d0("WITHDRAW", 1);
        a = r8d0Var2;
        b = new r8d0[]{r8d0Var, r8d0Var2};
    }

    public r8d0() {
        throw null;
    }

    public static r8d0 valueOf(String str) {
        return (r8d0) Enum.valueOf(r8d0.class, str);
    }

    public static r8d0[] values() {
        return (r8d0[]) b.clone();
    }
}

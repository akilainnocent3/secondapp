package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lhj0 {
    public static final lhj0 a;
    public static final lhj0 b;
    public static final /* synthetic */ lhj0[] c;

    static {
        lhj0 lhj0Var = new lhj0("TAG_ALERT_HINT", 0);
        a = lhj0Var;
        lhj0 lhj0Var2 = new lhj0("TAG_ALERT_HINT_CONFIRM", 1);
        b = lhj0Var2;
        c = new lhj0[]{lhj0Var, lhj0Var2};
    }

    public lhj0() {
        throw null;
    }

    public static lhj0 valueOf(String str) {
        return (lhj0) Enum.valueOf(lhj0.class, str);
    }

    public static lhj0[] values() {
        return (lhj0[]) c.clone();
    }
}

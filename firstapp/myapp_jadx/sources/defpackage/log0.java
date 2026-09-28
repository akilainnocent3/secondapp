package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class log0 {
    public static final log0 a;
    public static final log0 b;
    public static final /* synthetic */ log0[] c;

    static {
        log0 log0Var = new log0("DEPOSIT", 0);
        a = log0Var;
        log0 log0Var2 = new log0("WITHDRAW", 1);
        b = log0Var2;
        c = new log0[]{log0Var, log0Var2};
    }

    public log0() {
        throw null;
    }

    public static log0 valueOf(String str) {
        return (log0) Enum.valueOf(log0.class, str);
    }

    public static log0[] values() {
        return (log0[]) c.clone();
    }
}

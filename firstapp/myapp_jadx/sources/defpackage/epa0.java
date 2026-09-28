package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class epa0 {
    public static final epa0 a;
    public static final epa0 b;
    public static final /* synthetic */ epa0[] c;

    static {
        epa0 epa0Var = new epa0("ASCENDING", 0);
        a = epa0Var;
        epa0 epa0Var2 = new epa0("DESCENDING", 1);
        b = epa0Var2;
        c = new epa0[]{epa0Var, epa0Var2};
    }

    public epa0() {
        throw null;
    }

    public static epa0 valueOf(String str) {
        return (epa0) Enum.valueOf(epa0.class, str);
    }

    public static epa0[] values() {
        return (epa0[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ai30 {
    public static final ai30 a;
    public static final ai30 b;
    public static final /* synthetic */ ai30[] c;

    static {
        ai30 ai30Var = new ai30("VALID", 0);
        a = ai30Var;
        ai30 ai30Var2 = new ai30("INVALID", 1);
        b = ai30Var2;
        c = new ai30[]{ai30Var, ai30Var2};
    }

    public ai30() {
        throw null;
    }

    public static ai30 valueOf(String str) {
        return (ai30) Enum.valueOf(ai30.class, str);
    }

    public static ai30[] values() {
        return (ai30[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class jb00 {
    public static final jb00 a;
    public static final jb00 b;
    public static final /* synthetic */ jb00[] c;

    static {
        jb00 jb00Var = new jb00("START_NEW_DEPOSIT", 0);
        a = jb00Var;
        jb00 jb00Var2 = new jb00("CONTINUE_WITH_NEW_DEPOSIT", 1);
        b = jb00Var2;
        c = new jb00[]{jb00Var, jb00Var2};
    }

    public jb00() {
        throw null;
    }

    public static jb00 valueOf(String str) {
        return (jb00) Enum.valueOf(jb00.class, str);
    }

    public static jb00[] values() {
        return (jb00[]) c.clone();
    }
}

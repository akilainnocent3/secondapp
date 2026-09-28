package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class us60 {
    public static final us60 a;
    public static final us60 b;
    public static final us60 c;
    public static final /* synthetic */ us60[] d;

    static {
        us60 us60Var = new us60("DROP", 0);
        a = us60Var;
        us60 us60Var2 = new us60("RECORD_ONLY", 1);
        b = us60Var2;
        us60 us60Var3 = new us60("RECORD_AND_SAMPLE", 2);
        c = us60Var3;
        d = new us60[]{us60Var, us60Var2, us60Var3};
    }

    public us60() {
        throw null;
    }

    public static us60 valueOf(String str) {
        return (us60) Enum.valueOf(us60.class, str);
    }

    public static us60[] values() {
        return (us60[]) d.clone();
    }
}

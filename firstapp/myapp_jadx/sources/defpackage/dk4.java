package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class dk4 {
    public static final dk4 a;
    public static final dk4 b;
    public static final dk4 c;
    public static final /* synthetic */ dk4[] d;

    static {
        dk4 dk4Var = new dk4("ACTIVE", 0);
        a = dk4Var;
        dk4 dk4Var2 = new dk4("COLLECTING", 1);
        b = dk4Var2;
        dk4 dk4Var3 = new dk4("OUT_OF_PLAY", 2);
        c = dk4Var3;
        d = new dk4[]{dk4Var, dk4Var2, dk4Var3};
    }

    public dk4() {
        throw null;
    }

    public static dk4 valueOf(String str) {
        return (dk4) Enum.valueOf(dk4.class, str);
    }

    public static dk4[] values() {
        return (dk4[]) d.clone();
    }
}

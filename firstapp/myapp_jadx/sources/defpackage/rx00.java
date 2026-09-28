package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rx00 {
    public static final rx00 a;
    public static final rx00 b;
    public static final rx00 c;
    public static final rx00 d;
    public static final /* synthetic */ rx00[] e;

    static {
        rx00 rx00Var = new rx00("WILD_WEST", 0);
        a = rx00Var;
        rx00 rx00Var2 = new rx00("JUNGLE", 1);
        b = rx00Var2;
        rx00 rx00Var3 = new rx00("ROBOTIC", 2);
        c = rx00Var3;
        rx00 rx00Var4 = new rx00("ASIAN", 3);
        d = rx00Var4;
        e = new rx00[]{rx00Var, rx00Var2, rx00Var3, rx00Var4};
    }

    public rx00() {
        throw null;
    }

    public static rx00 valueOf(String str) {
        return (rx00) Enum.valueOf(rx00.class, str);
    }

    public static rx00[] values() {
        return (rx00[]) e.clone();
    }
}

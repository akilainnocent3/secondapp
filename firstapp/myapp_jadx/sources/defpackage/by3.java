package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class by3 {
    public static final by3 a;
    public static final by3 b;
    public static final by3 c;
    public static final /* synthetic */ by3[] d;

    static {
        by3 by3Var = new by3("Invitation", 0);
        a = by3Var;
        by3 by3Var2 = new by3("Complete", 1);
        b = by3Var2;
        by3 by3Var3 = new by3("CompleteWithFreebetGift", 2);
        c = by3Var3;
        d = new by3[]{by3Var, by3Var2, by3Var3};
    }

    public by3() {
        throw null;
    }

    public static by3 valueOf(String str) {
        return (by3) Enum.valueOf(by3.class, str);
    }

    public static by3[] values() {
        return (by3[]) d.clone();
    }
}

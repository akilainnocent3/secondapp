package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rfa0 {
    public static final rfa0 a;
    public static final rfa0 b;
    public static final /* synthetic */ rfa0[] c;
    public static final /* synthetic */ uag d;

    static {
        rfa0 rfa0Var = new rfa0("FOLLOWER", 0);
        a = rfa0Var;
        rfa0 rfa0Var2 = new rfa0("FOLLOWING", 1);
        b = rfa0Var2;
        rfa0[] rfa0VarArr = {rfa0Var, rfa0Var2};
        c = rfa0VarArr;
        d = new uag(rfa0VarArr);
    }

    public rfa0() {
        throw null;
    }

    public static rfa0 valueOf(String str) {
        return (rfa0) Enum.valueOf(rfa0.class, str);
    }

    public static rfa0[] values() {
        return (rfa0[]) c.clone();
    }
}

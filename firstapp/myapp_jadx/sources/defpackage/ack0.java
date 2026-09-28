package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ack0 {
    public static final ack0 a;
    public static final ack0 b;
    public static final ack0 c;
    public static final /* synthetic */ ack0[] d;

    static {
        ack0 ack0Var = new ack0("WEBSITE", 0);
        a = ack0Var;
        ack0 ack0Var2 = new ack0("MOBILE", 1);
        b = ack0Var2;
        ack0 ack0Var3 = new ack0("USSD", 2);
        c = ack0Var3;
        d = new ack0[]{ack0Var, ack0Var2, ack0Var3};
    }

    public ack0() {
        throw null;
    }

    public static ack0 valueOf(String str) {
        return (ack0) Enum.valueOf(ack0.class, str);
    }

    public static ack0[] values() {
        return (ack0[]) d.clone();
    }
}

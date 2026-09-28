package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ev5 {
    public static final ev5 a;
    public static final ev5 b;
    public static final ev5 c;
    public static final ev5 d;
    public static final ev5 e;
    public static final ev5 f;
    public static final /* synthetic */ ev5[] i;

    static {
        ev5 ev5Var = new ev5("Ringing", 0);
        a = ev5Var;
        ev5 ev5Var2 = new ev5("ConnectFailure", 1);
        b = ev5Var2;
        ev5 ev5Var3 = new ev5("Connected", 2);
        c = ev5Var3;
        ev5 ev5Var4 = new ev5("Reconnecting", 3);
        d = ev5Var4;
        ev5 ev5Var5 = new ev5("Reconnected", 4);
        e = ev5Var5;
        ev5 ev5Var6 = new ev5("Disconnected", 5);
        f = ev5Var6;
        i = new ev5[]{ev5Var, ev5Var2, ev5Var3, ev5Var4, ev5Var5, ev5Var6};
    }

    public ev5() {
        throw null;
    }

    public static ev5 valueOf(String str) {
        return (ev5) Enum.valueOf(ev5.class, str);
    }

    public static ev5[] values() {
        return (ev5[]) i.clone();
    }
}

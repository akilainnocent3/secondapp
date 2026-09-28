package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q190 {
    public static final q190 a;
    public static final q190 b;
    public static final /* synthetic */ q190[] c;

    static {
        q190 q190Var = new q190("BOOKING_CODE", 0);
        a = q190Var;
        q190 q190Var2 = new q190("SHOW_OFF", 1);
        b = q190Var2;
        c = new q190[]{q190Var, q190Var2, new q190("OPEN_BET", 2)};
    }

    public q190() {
        throw null;
    }

    public static q190 valueOf(String str) {
        return (q190) Enum.valueOf(q190.class, str);
    }

    public static q190[] values() {
        return (q190[]) c.clone();
    }
}

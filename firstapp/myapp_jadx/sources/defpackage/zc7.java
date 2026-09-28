package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zc7 {
    public static final zc7 a;
    public static final zc7 b;
    public static final /* synthetic */ zc7[] c;

    static {
        zc7 zc7Var = new zc7("MATCH", 0);
        a = zc7Var;
        zc7 zc7Var2 = new zc7("BOOKING_CODE", 1);
        b = zc7Var2;
        c = new zc7[]{zc7Var, zc7Var2};
    }

    public zc7() {
        throw null;
    }

    public static zc7 valueOf(String str) {
        return (zc7) Enum.valueOf(zc7.class, str);
    }

    public static zc7[] values() {
        return (zc7[]) c.clone();
    }
}

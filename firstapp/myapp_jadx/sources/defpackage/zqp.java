package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zqp {
    public static final zqp a;
    public static final zqp b;
    public static final zqp c;
    public static final zqp d;
    public static final /* synthetic */ zqp[] e;

    static {
        zqp zqpVar = new zqp("UPCOMING", 0);
        a = zqpVar;
        zqp zqpVar2 = new zqp("ONGOING", 1);
        b = zqpVar2;
        zqp zqpVar3 = new zqp("COMPLETED", 2);
        c = zqpVar3;
        zqp zqpVar4 = new zqp("UNKNOWN", 3);
        d = zqpVar4;
        e = new zqp[]{zqpVar, zqpVar2, zqpVar3, zqpVar4};
    }

    public zqp() {
        throw null;
    }

    public static zqp valueOf(String str) {
        return (zqp) Enum.valueOf(zqp.class, str);
    }

    public static zqp[] values() {
        return (zqp[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zd90 {
    public static final zd90 a;
    public static final zd90 b;
    public static final /* synthetic */ zd90[] c;

    static {
        zd90 zd90Var = new zd90("AvailableSlots", 0);
        a = zd90Var;
        zd90 zd90Var2 = new zd90("ResetToDefault", 1);
        b = zd90Var2;
        c = new zd90[]{zd90Var, zd90Var2};
    }

    public zd90() {
        throw null;
    }

    public static zd90 valueOf(String str) {
        return (zd90) Enum.valueOf(zd90.class, str);
    }

    public static zd90[] values() {
        return (zd90[]) c.clone();
    }
}

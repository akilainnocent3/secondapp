package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cie {
    public static final cie a;
    public static final cie b;
    public static final /* synthetic */ cie[] c;

    static {
        cie cieVar = new cie("MyDevices", 0);
        a = cieVar;
        cie cieVar2 = new cie("RestrictedDevices", 1);
        b = cieVar2;
        c = new cie[]{cieVar, cieVar2};
    }

    public cie() {
        throw null;
    }

    public static cie valueOf(String str) {
        return (cie) Enum.valueOf(cie.class, str);
    }

    public static cie[] values() {
        return (cie[]) c.clone();
    }
}

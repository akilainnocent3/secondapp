package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class amv {
    public static final amv a;
    public static final amv b;
    public static final /* synthetic */ amv[] c;

    static {
        amv amvVar = new amv("REUSABLE_DATA", 0);
        a = amvVar;
        amv amvVar2 = new amv("IMMUTABLE_DATA", 1);
        b = amvVar2;
        c = new amv[]{amvVar, amvVar2};
    }

    public amv() {
        throw null;
    }

    public static amv valueOf(String str) {
        return (amv) Enum.valueOf(amv.class, str);
    }

    public static amv[] values() {
        return (amv[]) c.clone();
    }
}

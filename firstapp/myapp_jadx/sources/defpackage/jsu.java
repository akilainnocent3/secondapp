package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jsu {
    public static final jsu a;
    public static final jsu b;
    public static final jsu c;
    public static final /* synthetic */ jsu[] d;

    static {
        jsu jsuVar = new jsu("NOT_VALIDATED", 0);
        a = jsuVar;
        jsu jsuVar2 = new jsu("ACTIVATED", 1);
        b = jsuVar2;
        jsu jsuVar3 = new jsu("DEACTIVATED", 2);
        c = jsuVar3;
        d = new jsu[]{jsuVar, jsuVar2, jsuVar3};
    }

    public jsu() {
        throw null;
    }

    public static jsu valueOf(String str) {
        return (jsu) Enum.valueOf(jsu.class, str);
    }

    public static jsu[] values() {
        return (jsu[]) d.clone();
    }
}

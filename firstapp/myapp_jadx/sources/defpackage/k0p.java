package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k0p {
    public static final k0p a;
    public static final k0p b;
    public static final k0p c;
    public static final k0p d;
    public static final /* synthetic */ k0p[] e;

    static {
        k0p k0pVar = new k0p("IGNORED", 0);
        a = k0pVar;
        k0p k0pVar2 = new k0p("SCHEDULED", 1);
        b = k0pVar2;
        k0p k0pVar3 = new k0p("DEFERRED", 2);
        c = k0pVar3;
        k0p k0pVar4 = new k0p("IMMINENT", 3);
        d = k0pVar4;
        e = new k0p[]{k0pVar, k0pVar2, k0pVar3, k0pVar4};
    }

    public k0p() {
        throw null;
    }

    public static k0p valueOf(String str) {
        return (k0p) Enum.valueOf(k0p.class, str);
    }

    public static k0p[] values() {
        return (k0p[]) e.clone();
    }
}

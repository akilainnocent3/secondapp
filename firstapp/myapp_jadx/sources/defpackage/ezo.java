package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ezo {
    public static final ezo a;
    public static final /* synthetic */ ezo[] b;

    static {
        ezo ezoVar = new ezo("LEGACY", 0);
        a = ezoVar;
        b = new ezo[]{ezoVar, new ezo("LATEST", 1)};
    }

    public ezo() {
        throw null;
    }

    public static ezo valueOf(String str) {
        return (ezo) Enum.valueOf(ezo.class, str);
    }

    public static ezo[] values() {
        return (ezo[]) b.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pzo {
    public static final pzo a;
    public static final pzo b;
    public static final /* synthetic */ pzo[] c;

    static {
        pzo pzoVar = new pzo("Min", 0);
        a = pzoVar;
        pzo pzoVar2 = new pzo("Max", 1);
        b = pzoVar2;
        c = new pzo[]{pzoVar, pzoVar2};
    }

    public pzo() {
        throw null;
    }

    public static pzo valueOf(String str) {
        return (pzo) Enum.valueOf(pzo.class, str);
    }

    public static pzo[] values() {
        return (pzo[]) c.clone();
    }
}

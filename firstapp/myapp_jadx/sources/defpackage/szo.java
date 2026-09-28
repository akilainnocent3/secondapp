package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class szo {
    public static final szo a;
    public static final szo b;
    public static final /* synthetic */ szo[] c;

    static {
        szo szoVar = new szo("Width", 0);
        a = szoVar;
        szo szoVar2 = new szo("Height", 1);
        b = szoVar2;
        c = new szo[]{szoVar, szoVar2};
    }

    public szo() {
        throw null;
    }

    public static szo valueOf(String str) {
        return (szo) Enum.valueOf(szo.class, str);
    }

    public static szo[] values() {
        return (szo[]) c.clone();
    }
}

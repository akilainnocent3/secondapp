package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class sbi {
    public static final sbi a;
    public static final sbi b;
    public static final /* synthetic */ sbi[] c;

    static {
        sbi sbiVar = new sbi("STATIC", 0);
        a = sbiVar;
        sbi sbiVar2 = new sbi("SPINNING", 1);
        b = sbiVar2;
        c = new sbi[]{sbiVar, sbiVar2};
    }

    public sbi() {
        throw null;
    }

    public static sbi valueOf(String str) {
        return (sbi) Enum.valueOf(sbi.class, str);
    }

    public static sbi[] values() {
        return (sbi[]) c.clone();
    }
}

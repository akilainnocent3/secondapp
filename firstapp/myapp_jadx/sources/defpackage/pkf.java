package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pkf {
    public static final pkf a;
    public static final pkf b;
    public static final /* synthetic */ pkf[] c;

    static {
        pkf pkfVar = new pkf("ON", 0);
        a = pkfVar;
        pkf pkfVar2 = new pkf("OFF", 1);
        b = pkfVar2;
        c = new pkf[]{pkfVar, pkfVar2};
    }

    public pkf() {
        throw null;
    }

    public static pkf valueOf(String str) {
        return (pkf) Enum.valueOf(pkf.class, str);
    }

    public static pkf[] values() {
        return (pkf[]) c.clone();
    }
}

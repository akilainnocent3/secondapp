package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class nkf {
    public static final nkf a;
    public static final nkf b;
    public static final /* synthetic */ nkf[] c;

    static {
        nkf nkfVar = new nkf("BET_SLIP", 0);
        a = nkfVar;
        nkf nkfVar2 = new nkf("QUICK_BET", 1);
        b = nkfVar2;
        c = new nkf[]{nkfVar, nkfVar2};
    }

    public nkf() {
        throw null;
    }

    public static nkf valueOf(String str) {
        return (nkf) Enum.valueOf(nkf.class, str);
    }

    public static nkf[] values() {
        return (nkf[]) c.clone();
    }
}

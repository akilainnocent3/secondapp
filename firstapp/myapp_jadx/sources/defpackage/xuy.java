package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xuy {
    public static final xuy a;
    public static final xuy b;
    public static final xuy c;
    public static final /* synthetic */ xuy[] d;

    static {
        xuy xuyVar = new xuy("SINGLE", 0);
        a = xuyVar;
        xuy xuyVar2 = new xuy("MULTIPLE", 1);
        b = xuyVar2;
        xuy xuyVar3 = new xuy("SYSTEM", 2);
        c = xuyVar3;
        d = new xuy[]{xuyVar, xuyVar2, xuyVar3};
    }

    public xuy() {
        throw null;
    }

    public static xuy valueOf(String str) {
        return (xuy) Enum.valueOf(xuy.class, str);
    }

    public static xuy[] values() {
        return (xuy[]) d.clone();
    }
}

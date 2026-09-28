package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xpp {
    public static final xpp a;
    public static final xpp b;
    public static final xpp c;
    public static final /* synthetic */ xpp[] d;

    static {
        xpp xppVar = new xpp("PREPARE", 0);
        a = xppVar;
        xpp xppVar2 = new xpp("KICKING", 1);
        b = xppVar2;
        xpp xppVar3 = new xpp("FINISHED", 2);
        c = xppVar3;
        d = new xpp[]{xppVar, xppVar2, xppVar3};
    }

    public xpp() {
        throw null;
    }

    public static xpp valueOf(String str) {
        return (xpp) Enum.valueOf(xpp.class, str);
    }

    public static xpp[] values() {
        return (xpp[]) d.clone();
    }
}

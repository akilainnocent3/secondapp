package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vbp {
    public static final vbp a;
    public static final vbp b;
    public static final /* synthetic */ vbp[] c;

    static {
        vbp vbpVar = new vbp("Null", 0);
        a = vbpVar;
        vbp vbpVar2 = new vbp("NotValidBase64", 1);
        b = vbpVar2;
        c = new vbp[]{vbpVar, vbpVar2, new vbp("Unknown", 2)};
    }

    public vbp() {
        throw null;
    }

    public static vbp valueOf(String str) {
        return (vbp) Enum.valueOf(vbp.class, str);
    }

    public static vbp[] values() {
        return (vbp[]) c.clone();
    }
}

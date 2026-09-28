package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class rcg {
    public static final rcg a;
    public static final rcg b;
    public static final rcg c;
    public static final /* synthetic */ rcg[] d;

    static {
        rcg rcgVar = new rcg("IMMEDIATE", 0);
        a = rcgVar;
        rcg rcgVar2 = new rcg("BOUNDARY", 1);
        b = rcgVar2;
        rcg rcgVar3 = new rcg("END", 2);
        c = rcgVar3;
        d = new rcg[]{rcgVar, rcgVar2, rcgVar3};
    }

    public rcg() {
        throw null;
    }

    public static rcg valueOf(String str) {
        return (rcg) Enum.valueOf(rcg.class, str);
    }

    public static rcg[] values() {
        return (rcg[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class igr {
    public static final igr a;
    public static final igr b;
    public static final igr c;
    public static final /* synthetic */ igr[] d;

    static {
        igr igrVar = new igr("None", 0);
        a = igrVar;
        igr igrVar2 = new igr("Previous", 1);
        b = igrVar2;
        igr igrVar3 = new igr("Next", 2);
        c = igrVar3;
        d = new igr[]{igrVar, igrVar2, igrVar3};
    }

    public igr() {
        throw null;
    }

    public static igr valueOf(String str) {
        return (igr) Enum.valueOf(igr.class, str);
    }

    public static igr[] values() {
        return (igr[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class odc {
    public static final odc a;
    public static final odc b;
    public static final odc c;
    public static final /* synthetic */ odc[] d;

    static {
        odc odcVar = new odc("None", 0);
        a = odcVar;
        odc odcVar2 = new odc("Cancelled", 1);
        b = odcVar2;
        odc odcVar3 = new odc("Redirected", 2);
        c = odcVar3;
        d = new odc[]{odcVar, odcVar2, odcVar3, new odc("RedirectCancelled", 3)};
    }

    public odc() {
        throw null;
    }

    public static odc valueOf(String str) {
        return (odc) Enum.valueOf(odc.class, str);
    }

    public static odc[] values() {
        return (odc[]) d.clone();
    }
}

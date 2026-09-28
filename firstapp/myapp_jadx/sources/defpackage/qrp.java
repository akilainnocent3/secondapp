package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class qrp {
    public static final qrp a;
    public static final /* synthetic */ qrp[] b;

    static {
        qrp qrpVar = new qrp("VIEWMODEL_SCOPE_FACTORY", 0);
        a = qrpVar;
        b = new qrp[]{qrpVar};
    }

    public qrp() {
        throw null;
    }

    public static qrp valueOf(String str) {
        return (qrp) Enum.valueOf(qrp.class, str);
    }

    public static qrp[] values() {
        return (qrp[]) b.clone();
    }
}

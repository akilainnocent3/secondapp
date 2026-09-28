package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qiv {
    public static final qiv a;
    public static final qiv b;
    public static final /* synthetic */ qiv[] c;

    static {
        qiv qivVar = new qiv("Min", 0);
        a = qivVar;
        qiv qivVar2 = new qiv("Max", 1);
        b = qivVar2;
        c = new qiv[]{qivVar, qivVar2};
    }

    public qiv() {
        throw null;
    }

    public static qiv valueOf(String str) {
        return (qiv) Enum.valueOf(qiv.class, str);
    }

    public static qiv[] values() {
        return (qiv[]) c.clone();
    }
}

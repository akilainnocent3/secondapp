package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k3n {
    public static final k3n a;
    public static final k3n b;
    public static final k3n c;
    public static final /* synthetic */ k3n[] d;

    static {
        k3n k3nVar = new k3n("BEFORE_HALFTIME", 0);
        a = k3nVar;
        k3n k3nVar2 = new k3n("AFTER_HALFTIME", 1);
        b = k3nVar2;
        k3n k3nVar3 = new k3n("OVERTIME", 2);
        c = k3nVar3;
        d = new k3n[]{k3nVar, k3nVar2, k3nVar3};
    }

    public k3n() {
        throw null;
    }

    public static k3n valueOf(String str) {
        return (k3n) Enum.valueOf(k3n.class, str);
    }

    public static k3n[] values() {
        return (k3n[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c3n {
    public static final c3n a;
    public static final c3n b;
    public static final /* synthetic */ c3n[] c;

    static {
        c3n c3nVar = new c3n("GREEN", 0);
        a = c3nVar;
        c3n c3nVar2 = new c3n("RED", 1);
        b = c3nVar2;
        c = new c3n[]{c3nVar, c3nVar2};
    }

    public c3n() {
        throw null;
    }

    public static c3n valueOf(String str) {
        return (c3n) Enum.valueOf(c3n.class, str);
    }

    public static c3n[] values() {
        return (c3n[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w3n {
    public static final w3n a;
    public static final w3n b;
    public static final /* synthetic */ w3n[] c;

    static {
        w3n w3nVar = new w3n("TWO_POINT", 0);
        a = w3nVar;
        w3n w3nVar2 = new w3n("THREE_POINT", 1);
        b = w3nVar2;
        c = new w3n[]{w3nVar, w3nVar2};
    }

    public w3n() {
        throw null;
    }

    public static w3n valueOf(String str) {
        return (w3n) Enum.valueOf(w3n.class, str);
    }

    public static w3n[] values() {
        return (w3n[]) c.clone();
    }
}

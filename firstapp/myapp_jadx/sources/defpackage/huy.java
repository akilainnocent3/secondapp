package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class huy {
    public static final huy a;
    public static final huy b;
    public static final /* synthetic */ huy[] c;

    static {
        huy huyVar = new huy("ONE_UP", 0);
        a = huyVar;
        huy huyVar2 = new huy("TWO_UP", 1);
        b = huyVar2;
        c = new huy[]{huyVar, huyVar2};
    }

    public huy() {
        throw null;
    }

    public static huy valueOf(String str) {
        return (huy) Enum.valueOf(huy.class, str);
    }

    public static huy[] values() {
        return (huy[]) c.clone();
    }
}

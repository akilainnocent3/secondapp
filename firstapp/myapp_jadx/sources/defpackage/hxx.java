package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hxx {
    public static final hxx a;
    public static final hxx b;
    public static final /* synthetic */ hxx[] c;

    static {
        hxx hxxVar = new hxx("Min", 0);
        a = hxxVar;
        hxx hxxVar2 = new hxx("Max", 1);
        b = hxxVar2;
        c = new hxx[]{hxxVar, hxxVar2};
    }

    public hxx() {
        throw null;
    }

    public static hxx valueOf(String str) {
        return (hxx) Enum.valueOf(hxx.class, str);
    }

    public static hxx[] values() {
        return (hxx[]) c.clone();
    }
}

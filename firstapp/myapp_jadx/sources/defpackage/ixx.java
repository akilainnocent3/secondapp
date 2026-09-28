package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ixx {
    public static final ixx a;
    public static final ixx b;
    public static final /* synthetic */ ixx[] c;

    static {
        ixx ixxVar = new ixx("Width", 0);
        a = ixxVar;
        ixx ixxVar2 = new ixx("Height", 1);
        b = ixxVar2;
        c = new ixx[]{ixxVar, ixxVar2};
    }

    public ixx() {
        throw null;
    }

    public static ixx valueOf(String str) {
        return (ixx) Enum.valueOf(ixx.class, str);
    }

    public static ixx[] values() {
        return (ixx[]) c.clone();
    }
}

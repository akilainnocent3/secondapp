package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xik {
    public static final xik a;
    public static final xik b;
    public static final xik c;
    public static final /* synthetic */ xik[] d;

    static {
        xik xikVar = new xik("APPLICABLE", 0);
        a = xikVar;
        xik xikVar2 = new xik("UPCOMING", 1);
        b = xikVar2;
        xik xikVar3 = new xik("INAPPLICABLE", 2);
        c = xikVar3;
        d = new xik[]{xikVar, xikVar2, xikVar3};
    }

    public xik() {
        throw null;
    }

    public static xik valueOf(String str) {
        return (xik) Enum.valueOf(xik.class, str);
    }

    public static xik[] values() {
        return (xik[]) d.clone();
    }
}

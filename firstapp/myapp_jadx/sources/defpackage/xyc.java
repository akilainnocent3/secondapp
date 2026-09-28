package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class xyc {
    public static final xyc a;
    public static final xyc b;
    public static final /* synthetic */ xyc[] c;

    static {
        xyc xycVar = new xyc("DISABLED", 0);
        a = xycVar;
        xyc xycVar2 = new xyc("WEEKEND", 1);
        b = xycVar2;
        c = new xyc[]{xycVar, xycVar2, new xyc("FROM_CONNECTED_CALENDAR", 2)};
    }

    public xyc() {
        throw null;
    }

    public static xyc valueOf(String str) {
        return (xyc) Enum.valueOf(xyc.class, str);
    }

    public static xyc[] values() {
        return (xyc[]) c.clone();
    }
}

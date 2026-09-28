package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y5b {
    public static final y5b a;
    public static final y5b b;
    public static final y5b c;
    public static final /* synthetic */ y5b[] d;

    static {
        y5b y5bVar = new y5b("COROUTINE_SUSPENDED", 0);
        a = y5bVar;
        y5b y5bVar2 = new y5b("UNDECIDED", 1);
        b = y5bVar2;
        y5b y5bVar3 = new y5b("RESUMED", 2);
        c = y5bVar3;
        d = new y5b[]{y5bVar, y5bVar2, y5bVar3};
    }

    public y5b() {
        throw null;
    }

    public static y5b valueOf(String str) {
        return (y5b) Enum.valueOf(y5b.class, str);
    }

    public static y5b[] values() {
        return (y5b[]) d.clone();
    }
}

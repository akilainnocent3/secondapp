package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p0z {
    public static final p0z a;
    public static final p0z b;
    public static final p0z c;
    public static final p0z d;
    public static final /* synthetic */ p0z[] e;

    static {
        p0z p0zVar = new p0z("INIT", 0);
        a = p0zVar;
        p0z p0zVar2 = new p0z("ALL", 1);
        b = p0zVar2;
        p0z p0zVar3 = new p0z("CASH_OUT_AVAILABLE", 2);
        c = p0zVar3;
        p0z p0zVar4 = new p0z("LIVE_GAMES", 3);
        d = p0zVar4;
        e = new p0z[]{p0zVar, p0zVar2, p0zVar3, p0zVar4};
    }

    public p0z() {
        throw null;
    }

    public static p0z valueOf(String str) {
        return (p0z) Enum.valueOf(p0z.class, str);
    }

    public static p0z[] values() {
        return (p0z[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e1z {
    public static final e1z a;
    public static final e1z b;
    public static final e1z c;
    public static final /* synthetic */ e1z[] d;

    static {
        e1z e1zVar = new e1z("ALL", 0);
        a = e1zVar;
        e1z e1zVar2 = new e1z("CASHOUT_AVAILABLE", 1);
        b = e1zVar2;
        e1z e1zVar3 = new e1z("LIVE_GAMES", 2);
        c = e1zVar3;
        d = new e1z[]{e1zVar, e1zVar2, e1zVar3};
    }

    public e1z() {
        throw null;
    }

    public static e1z valueOf(String str) {
        return (e1z) Enum.valueOf(e1z.class, str);
    }

    public static e1z[] values() {
        return (e1z[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kxs {
    public static final kxs a;
    public static final kxs b;
    public static final kxs c;
    public static final /* synthetic */ kxs[] d;

    static {
        kxs kxsVar = new kxs("REFRESH", 0);
        a = kxsVar;
        kxs kxsVar2 = new kxs("PREPEND", 1);
        b = kxsVar2;
        kxs kxsVar3 = new kxs("APPEND", 2);
        c = kxsVar3;
        d = new kxs[]{kxsVar, kxsVar2, kxsVar3};
    }

    public kxs() {
        throw null;
    }

    public static kxs valueOf(String str) {
        return (kxs) Enum.valueOf(kxs.class, str);
    }

    public static kxs[] values() {
        return (kxs[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p7v {
    public static final p7v a;
    public static final p7v b;
    public static final /* synthetic */ p7v[] c;

    static {
        p7v p7vVar = new p7v("HOME", 0);
        a = p7vVar;
        p7v p7vVar2 = new p7v("AWAY", 1);
        b = p7vVar2;
        c = new p7v[]{p7vVar, p7vVar2};
    }

    public p7v() {
        throw null;
    }

    public static p7v valueOf(String str) {
        return (p7v) Enum.valueOf(p7v.class, str);
    }

    public static p7v[] values() {
        return (p7v[]) c.clone();
    }
}

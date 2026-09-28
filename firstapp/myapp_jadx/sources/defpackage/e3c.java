package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e3c {
    public static final e3c a;
    public static final e3c b;
    public static final e3c c;
    public static final /* synthetic */ e3c[] d;

    static {
        e3c e3cVar = new e3c("CROSSED", 0);
        a = e3cVar;
        e3c e3cVar2 = new e3c("NOT_CROSSED", 1);
        b = e3cVar2;
        e3c e3cVar3 = new e3c("COLLAPSED", 2);
        c = e3cVar3;
        d = new e3c[]{e3cVar, e3cVar2, e3cVar3};
    }

    public e3c() {
        throw null;
    }

    public static e3c valueOf(String str) {
        return (e3c) Enum.valueOf(e3c.class, str);
    }

    public static e3c[] values() {
        return (e3c[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l4f {
    public static final l4f a;
    public static final l4f b;
    public static final /* synthetic */ l4f[] c;

    static {
        l4f l4fVar = new l4f("WIN", 0);
        a = l4fVar;
        l4f l4fVar2 = new l4f("LOSE", 1);
        b = l4fVar2;
        c = new l4f[]{l4fVar, l4fVar2};
    }

    public l4f() {
        throw null;
    }

    public static l4f valueOf(String str) {
        return (l4f) Enum.valueOf(l4f.class, str);
    }

    public static l4f[] values() {
        return (l4f[]) c.clone();
    }
}

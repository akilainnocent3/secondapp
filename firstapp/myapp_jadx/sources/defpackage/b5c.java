package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b5c {
    public static final b5c a;
    public static final b5c b;
    public static final /* synthetic */ b5c[] c;

    static {
        b5c b5cVar = new b5c("HOME", 0);
        a = b5cVar;
        b5c b5cVar2 = new b5c("SECTION", 1);
        b = b5cVar2;
        c = new b5c[]{b5cVar, b5cVar2};
    }

    public b5c() {
        throw null;
    }

    public static b5c valueOf(String str) {
        return (b5c) Enum.valueOf(b5c.class, str);
    }

    public static b5c[] values() {
        return (b5c[]) c.clone();
    }
}

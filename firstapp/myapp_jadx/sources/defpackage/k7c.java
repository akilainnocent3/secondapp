package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k7c {
    public static final k7c a;
    public static final k7c b;
    public static final k7c c;
    public static final /* synthetic */ k7c[] d;

    static {
        k7c k7cVar = new k7c("CREATOR", 0);
        a = k7cVar;
        k7c k7cVar2 = new k7c("NOT_CREATOR", 1);
        b = k7cVar2;
        k7c k7cVar3 = new k7c("NOT_PERCEPTIBLE", 2);
        c = k7cVar3;
        d = new k7c[]{k7cVar, k7cVar2, k7cVar3};
    }

    public k7c() {
        throw null;
    }

    public static k7c valueOf(String str) {
        return (k7c) Enum.valueOf(k7c.class, str);
    }

    public static k7c[] values() {
        return (k7c[]) d.clone();
    }
}

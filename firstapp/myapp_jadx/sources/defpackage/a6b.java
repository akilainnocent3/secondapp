package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a6b {
    public static final a6b a;
    public static final a6b b;
    public static final a6b c;
    public static final a6b d;
    public static final /* synthetic */ a6b[] e;

    static {
        a6b a6bVar = new a6b("DEFAULT", 0);
        a = a6bVar;
        a6b a6bVar2 = new a6b("LAZY", 1);
        b = a6bVar2;
        a6b a6bVar3 = new a6b("ATOMIC", 2);
        c = a6bVar3;
        a6b a6bVar4 = new a6b("UNDISPATCHED", 3);
        d = a6bVar4;
        e = new a6b[]{a6bVar, a6bVar2, a6bVar3, a6bVar4};
    }

    public a6b() {
        throw null;
    }

    public static a6b valueOf(String str) {
        return (a6b) Enum.valueOf(a6b.class, str);
    }

    public static a6b[] values() {
        return (a6b[]) e.clone();
    }
}

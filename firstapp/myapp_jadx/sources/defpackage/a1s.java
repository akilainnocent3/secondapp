package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a1s {
    public static final a1s a;
    public static final a1s b;
    public static final a1s c;
    public static final /* synthetic */ a1s[] d;

    static {
        a1s a1sVar = new a1s("SYNCHRONIZED", 0);
        a = a1sVar;
        a1s a1sVar2 = new a1s("PUBLICATION", 1);
        b = a1sVar2;
        a1s a1sVar3 = new a1s("NONE", 2);
        c = a1sVar3;
        d = new a1s[]{a1sVar, a1sVar2, a1sVar3};
    }

    public a1s() {
        throw null;
    }

    public static a1s valueOf(String str) {
        return (a1s) Enum.valueOf(a1s.class, str);
    }

    public static a1s[] values() {
        return (a1s[]) d.clone();
    }
}

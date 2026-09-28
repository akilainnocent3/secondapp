package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class dwk {
    public static final dwk a;
    public static final dwk b;
    public static final /* synthetic */ dwk[] c;

    static {
        dwk dwkVar = new dwk("FULL", 0);
        a = dwkVar;
        dwk dwkVar2 = new dwk("PARTIAL", 1);
        b = dwkVar2;
        c = new dwk[]{dwkVar, dwkVar2};
    }

    public dwk() {
        throw null;
    }

    public static dwk valueOf(String str) {
        return (dwk) Enum.valueOf(dwk.class, str);
    }

    public static dwk[] values() {
        return (dwk[]) c.clone();
    }
}

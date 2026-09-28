package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class szs {
    public static final szs a;
    public static final szs b;
    public static final szs c;
    public static final /* synthetic */ szs[] d;

    static {
        szs szsVar = new szs("LOADING", 0);
        a = szsVar;
        szs szsVar2 = new szs("ERROR", 1);
        b = szsVar2;
        szs szsVar3 = new szs("EMPTY", 2);
        c = szsVar3;
        d = new szs[]{szsVar, szsVar2, szsVar3};
    }

    public szs() {
        throw null;
    }

    public static szs valueOf(String str) {
        return (szs) Enum.valueOf(szs.class, str);
    }

    public static szs[] values() {
        return (szs[]) d.clone();
    }
}

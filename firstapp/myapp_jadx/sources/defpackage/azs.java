package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class azs {
    public static final azs a;
    public static final azs b;
    public static final /* synthetic */ azs[] c;

    static {
        azs azsVar = new azs("GENERAL", 0);
        a = azsVar;
        azs azsVar2 = new azs("SPECIFIC", 1);
        b = azsVar2;
        c = new azs[]{azsVar, azsVar2};
    }

    public azs() {
        throw null;
    }

    public static azs valueOf(String str) {
        return (azs) Enum.valueOf(azs.class, str);
    }

    public static azs[] values() {
        return (azs[]) c.clone();
    }
}

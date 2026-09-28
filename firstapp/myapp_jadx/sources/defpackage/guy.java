package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class guy {
    public static final guy a;
    public static final guy b;
    public static final /* synthetic */ guy[] c;

    static {
        guy guyVar = new guy("BET_SLIP", 0);
        a = guyVar;
        guy guyVar2 = new guy("QUICK_BET", 1);
        b = guyVar2;
        c = new guy[]{guyVar, guyVar2};
    }

    public guy() {
        throw null;
    }

    public static guy valueOf(String str) {
        return (guy) Enum.valueOf(guy.class, str);
    }

    public static guy[] values() {
        return (guy[]) c.clone();
    }
}

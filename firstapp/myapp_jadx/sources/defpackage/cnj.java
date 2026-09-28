package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class cnj {
    public static final cnj a;
    public static final cnj b;
    public static final cnj c;
    public static final cnj d;
    public static final /* synthetic */ cnj[] e;

    static {
        cnj cnjVar = new cnj("NOT_SELECTED", 0);
        a = cnjVar;
        cnj cnjVar2 = new cnj("SELECTION_PENDING", 1);
        b = cnjVar2;
        cnj cnjVar3 = new cnj("SELECTED", 2);
        c = cnjVar3;
        cnj cnjVar4 = new cnj("SELECTION_FAILURE", 3);
        d = cnjVar4;
        e = new cnj[]{cnjVar, cnjVar2, cnjVar3, cnjVar4};
    }

    public cnj() {
        throw null;
    }

    public static cnj valueOf(String str) {
        return (cnj) Enum.valueOf(cnj.class, str);
    }

    public static cnj[] values() {
        return (cnj[]) e.clone();
    }
}

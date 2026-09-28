package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pco {
    public static final pco a;
    public static final pco b;
    public static final /* synthetic */ pco[] c;
    public static final /* synthetic */ uag d;

    static {
        pco pcoVar = new pco("SETTLED", 0);
        a = pcoVar;
        pco pcoVar2 = new pco("UNSETTLED", 1);
        b = pcoVar2;
        pco[] pcoVarArr = {pcoVar, pcoVar2, new pco("ALL", 2)};
        c = pcoVarArr;
        d = new uag(pcoVarArr);
    }

    public pco() {
        throw null;
    }

    public static pco valueOf(String str) {
        return (pco) Enum.valueOf(pco.class, str);
    }

    public static pco[] values() {
        return (pco[]) c.clone();
    }
}

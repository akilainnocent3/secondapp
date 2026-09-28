package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qhw {
    public static final qhw a;
    public static final qhw b;
    public static final qhw c;
    public static final qhw d;
    public static final qhw e;
    public static final qhw f;
    public static final /* synthetic */ qhw[] i;

    static {
        qhw qhwVar = new qhw("SPORT", 0);
        a = qhwVar;
        qhw qhwVar2 = new qhw("LEAGUE", 1);
        b = qhwVar2;
        qhw qhwVar3 = new qhw("MARKET", 2);
        c = qhwVar3;
        qhw qhwVar4 = new qhw("TIME", 3);
        d = qhwVar4;
        qhw qhwVar5 = new qhw("ODDS", 4);
        e = qhwVar5;
        qhw qhwVar6 = new qhw("CONFIRM", 5);
        f = qhwVar6;
        i = new qhw[]{qhwVar, qhwVar2, qhwVar3, qhwVar4, qhwVar5, qhwVar6};
    }

    public qhw() {
        throw null;
    }

    public static qhw valueOf(String str) {
        return (qhw) Enum.valueOf(qhw.class, str);
    }

    public static qhw[] values() {
        return (qhw[]) i.clone();
    }
}

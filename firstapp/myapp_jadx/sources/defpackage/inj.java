package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class inj {
    public static final inj a;
    public static final inj b;
    public static final inj c;
    public static final inj d;
    public static final inj e;
    public static final /* synthetic */ inj[] f;

    static {
        inj injVar = new inj("STAGE_1", 0);
        a = injVar;
        inj injVar2 = new inj("STAGE_2", 1);
        b = injVar2;
        inj injVar3 = new inj("STAGE_3", 2);
        c = injVar3;
        inj injVar4 = new inj("STAGE_4", 3);
        d = injVar4;
        inj injVar5 = new inj("STAGE_5", 4);
        e = injVar5;
        f = new inj[]{injVar, injVar2, injVar3, injVar4, injVar5};
    }

    public inj() {
        throw null;
    }

    public static inj valueOf(String str) {
        return (inj) Enum.valueOf(inj.class, str);
    }

    public static inj[] values() {
        return (inj[]) f.clone();
    }
}

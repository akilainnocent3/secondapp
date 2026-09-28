package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class hnj {
    public static final a a;
    public static final hnj b;
    public static final hnj c;
    public static final hnj d;
    public static final hnj e;
    public static final /* synthetic */ hnj[] f;

    public static final class a {
    }

    static {
        hnj hnjVar = new hnj("NONE", 0);
        b = hnjVar;
        hnj hnjVar2 = new hnj("XMAS", 1);
        c = hnjVar2;
        hnj hnjVar3 = new hnj("FUGU", 2);
        d = hnjVar3;
        hnj hnjVar4 = new hnj("WORLD_CUP", 3);
        e = hnjVar4;
        f = new hnj[]{hnjVar, hnjVar2, hnjVar3, hnjVar4};
        a = new a();
    }

    public hnj() {
        throw null;
    }

    public static hnj valueOf(String str) {
        return (hnj) Enum.valueOf(hnj.class, str);
    }

    public static hnj[] values() {
        return (hnj[]) f.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class gnj {
    public static final gnj a;
    public static final gnj b;
    public static final gnj c;
    public static final /* synthetic */ gnj[] d;

    static {
        gnj gnjVar = new gnj("FAVOURITE", 0);
        a = gnjVar;
        gnj gnjVar2 = new gnj("SEARCH", 1);
        b = gnjVar2;
        gnj gnjVar3 = new gnj("LOBBY", 2);
        c = gnjVar3;
        d = new gnj[]{gnjVar, gnjVar2, gnjVar3};
    }

    public gnj() {
        throw null;
    }

    public static gnj valueOf(String str) {
        return (gnj) Enum.valueOf(gnj.class, str);
    }

    public static gnj[] values() {
        return (gnj[]) d.clone();
    }
}

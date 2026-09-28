package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e8o {
    public static final e8o a;
    public static final /* synthetic */ e8o[] b;

    /* JADX INFO: Fake field, exist only in values array */
    e8o EF0;

    static {
        e8o e8oVar = new e8o("ALL", 0);
        e8o e8oVar2 = new e8o("INSTANT_VIRTUAL", 1);
        e8o e8oVar3 = new e8o("INSTANT_BASKETBALL", 2);
        e8o e8oVar4 = new e8o("BUILD_AND_GO", 3);
        e8o e8oVar5 = new e8o("INSTANT_DOG_RACING", 4);
        e8o e8oVar6 = new e8o("SPORTY_LEGEND", 5);
        e8o e8oVar7 = new e8o("SPORTY_AFRICAN_CUP", 6);
        e8o e8oVar8 = new e8o("VFOOTBALL", 7);
        e8o e8oVar9 = new e8o("UNKNOWN", 8);
        a = e8oVar9;
        b = new e8o[]{e8oVar, e8oVar2, e8oVar3, e8oVar4, e8oVar5, e8oVar6, e8oVar7, e8oVar8, e8oVar9};
    }

    public e8o() {
        throw null;
    }

    public static e8o valueOf(String str) {
        return (e8o) Enum.valueOf(e8o.class, str);
    }

    public static e8o[] values() {
        return (e8o[]) b.clone();
    }
}

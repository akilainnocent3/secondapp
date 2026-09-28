package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vpe {
    public static final vpe a;
    public static final vpe b;
    public static final vpe c;
    public static final /* synthetic */ vpe[] d;

    static {
        vpe vpeVar = new vpe("ITEM_TO_PLACEHOLDER", 0);
        a = vpeVar;
        vpe vpeVar2 = new vpe("PLACEHOLDER_TO_ITEM", 1);
        b = vpeVar2;
        vpe vpeVar3 = new vpe("PLACEHOLDER_POSITION_CHANGE", 2);
        c = vpeVar3;
        d = new vpe[]{vpeVar, vpeVar2, vpeVar3};
    }

    public vpe() {
        throw null;
    }

    public static vpe valueOf(String str) {
        return (vpe) Enum.valueOf(vpe.class, str);
    }

    public static vpe[] values() {
        return (vpe[]) d.clone();
    }
}

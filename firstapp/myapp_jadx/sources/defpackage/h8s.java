package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h8s {
    public static final h8s a;
    public static final h8s b;
    public static final h8s c;
    public static final h8s d;
    public static final h8s e;
    public static final /* synthetic */ h8s[] f;

    static {
        h8s h8sVar = new h8s("REJECTED_BY_BET_OR_MARKET_LIABILITY_CHECK_ON_PLACE_BET", 0);
        a = h8sVar;
        h8s h8sVar2 = new h8s("REJECTED_BY_BOOKING_CODE_LIABILITY_CHECK_ON_PLACE_BET", 1);
        b = h8sVar2;
        h8s h8sVar3 = new h8s("CLEAR_BETSLIP", 2);
        c = h8sVar3;
        h8s h8sVar4 = new h8s("ADD_SELECTION_VIA_RELATED_BET", 3);
        d = h8sVar4;
        h8s h8sVar5 = new h8s("CHANGE_SELECTIONS_VIA_MULTI_MAKER", 4);
        e = h8sVar5;
        f = new h8s[]{h8sVar, h8sVar2, h8sVar3, h8sVar4, h8sVar5};
    }

    public h8s() {
        throw null;
    }

    public static h8s valueOf(String str) {
        return (h8s) Enum.valueOf(h8s.class, str);
    }

    public static h8s[] values() {
        return (h8s[]) f.clone();
    }
}

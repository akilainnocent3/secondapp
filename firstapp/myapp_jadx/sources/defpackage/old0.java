package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class old0 {
    public static final old0 a;
    public static final old0 b;
    public static final old0 c;
    public static final old0 d;
    public static final /* synthetic */ old0[] e;

    static {
        old0 old0Var = new old0("STACKED_IN_CURRENT_ROUND", 0);
        a = old0Var;
        old0 old0Var2 = new old0("STACKED_IN_PREVIOUS_ROUND", 1);
        b = old0Var2;
        old0 old0Var3 = new old0(PBBetHistoryItemDTO.STATUS_PENDING, 2);
        c = old0Var3;
        old0 old0Var4 = new old0("LOST_IN_CURRENT_ROUND", 3);
        d = old0Var4;
        e = new old0[]{old0Var, old0Var2, old0Var3, old0Var4};
    }

    public old0() {
        throw null;
    }

    public static old0 valueOf(String str) {
        return (old0) Enum.valueOf(old0.class, str);
    }

    public static old0[] values() {
        return (old0[]) e.clone();
    }
}

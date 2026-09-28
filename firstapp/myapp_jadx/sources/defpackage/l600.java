package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l600 {
    public static final l600 a;
    public static final l600 b;
    public static final l600 c;
    public static final /* synthetic */ l600[] d;

    static {
        l600 l600Var = new l600("CHANNEL_ACTION", 0);
        a = l600Var;
        l600 l600Var2 = new l600("PROCEED_ANYWAY", 1);
        b = l600Var2;
        l600 l600Var3 = new l600(PBBetHistoryItemDTO.STATUS_CANCELLED, 2);
        c = l600Var3;
        d = new l600[]{l600Var, l600Var2, l600Var3};
    }

    public l600() {
        throw null;
    }

    public static l600 valueOf(String str) {
        return (l600) Enum.valueOf(l600.class, str);
    }

    public static l600[] values() {
        return (l600[]) d.clone();
    }
}

package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class uf4 {
    public static final uf4 a;
    public static final uf4 b;
    public static final uf4 c;
    public static final uf4 d;
    public static final uf4 e;
    public static final /* synthetic */ uf4[] f;

    static {
        uf4 uf4Var = new uf4("STACKED_IN_CURRENT_ROUND", 0);
        a = uf4Var;
        uf4 uf4Var2 = new uf4("STACKED_IN_PREVIOUS_ROUND", 1);
        b = uf4Var2;
        uf4 uf4Var3 = new uf4(PBBetHistoryItemDTO.STATUS_PENDING, 2);
        c = uf4Var3;
        uf4 uf4Var4 = new uf4("LOST_IN_CURRENT_ROUND", 3);
        d = uf4Var4;
        uf4 uf4Var5 = new uf4("EMPTY", 4);
        e = uf4Var5;
        f = new uf4[]{uf4Var, uf4Var2, uf4Var3, uf4Var4, uf4Var5};
    }

    public uf4() {
        throw null;
    }

    public static uf4 valueOf(String str) {
        return (uf4) Enum.valueOf(uf4.class, str);
    }

    public static uf4[] values() {
        return (uf4[]) f.clone();
    }
}

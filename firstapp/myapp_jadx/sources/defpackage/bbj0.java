package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class bbj0 {
    public static final bbj0 a;
    public static final bbj0 b;
    public static final bbj0 c;
    public static final bbj0 d;
    public static final /* synthetic */ bbj0[] e;

    static {
        bbj0 bbj0Var = new bbj0("ALL", 0);
        a = bbj0Var;
        bbj0 bbj0Var2 = new bbj0(PBBetHistoryItemDTO.STATUS_WON, 1);
        b = bbj0Var2;
        bbj0 bbj0Var3 = new bbj0(PBBetHistoryItemDTO.STATUS_LOST, 2);
        c = bbj0Var3;
        bbj0 bbj0Var4 = new bbj0("VOID", 3);
        d = bbj0Var4;
        e = new bbj0[]{bbj0Var, bbj0Var2, bbj0Var3, bbj0Var4};
    }

    public bbj0() {
        throw null;
    }

    public static bbj0 valueOf(String str) {
        return (bbj0) Enum.valueOf(bbj0.class, str);
    }

    public static bbj0[] values() {
        return (bbj0[]) e.clone();
    }
}

package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class rxg0 {
    public static final rxg0 a;
    public static final rxg0 b;
    public static final rxg0 c;
    public static final rxg0 d;
    public static final /* synthetic */ rxg0[] e;

    static {
        rxg0 rxg0Var = new rxg0("SUCCESSFUL", 0);
        a = rxg0Var;
        rxg0 rxg0Var2 = new rxg0("REREGISTER", 1);
        b = rxg0Var2;
        rxg0 rxg0Var3 = new rxg0(PBBetHistoryItemDTO.STATUS_CANCELLED, 2);
        c = rxg0Var3;
        rxg0 rxg0Var4 = new rxg0("ALREADY_SELECTED", 3);
        d = rxg0Var4;
        e = new rxg0[]{rxg0Var, rxg0Var2, rxg0Var3, rxg0Var4};
    }

    public rxg0() {
        throw null;
    }

    public static rxg0 valueOf(String str) {
        return (rxg0) Enum.valueOf(rxg0.class, str);
    }

    public static rxg0[] values() {
        return (rxg0[]) e.clone();
    }
}

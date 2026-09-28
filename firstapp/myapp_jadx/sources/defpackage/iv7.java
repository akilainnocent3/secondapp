package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iv7 {
    public static final /* synthetic */ iv7[] A;
    public static final iv7 a;
    public static final iv7 b;
    public static final iv7 c;
    public static final iv7 d;
    public static final iv7 e;
    public static final iv7 f;
    public static final iv7 i;
    public static final iv7 v;
    public static final iv7 w;
    public static final iv7 y;
    public static final iv7 z;

    static {
        iv7 iv7Var = new iv7("UPCOMING", 0);
        a = iv7Var;
        iv7 iv7Var2 = new iv7("ONGOING", 1);
        b = iv7Var2;
        iv7 iv7Var3 = new iv7(PBBetHistoryItemDTO.STATUS_WON, 2);
        c = iv7Var3;
        iv7 iv7Var4 = new iv7("FLASH_WIN", 3);
        d = iv7Var4;
        iv7 iv7Var5 = new iv7("FLASH_SAVE", 4);
        e = iv7Var5;
        iv7 iv7Var6 = new iv7("ONE_UP", 5);
        f = iv7Var6;
        iv7 iv7Var7 = new iv7("TWO_UP", 6);
        i = iv7Var7;
        iv7 iv7Var8 = new iv7("OVER_UNDER", 7);
        v = iv7Var8;
        iv7 iv7Var9 = new iv7("DC_ONE_UP", 8);
        w = iv7Var9;
        iv7 iv7Var10 = new iv7(PBBetHistoryItemDTO.STATUS_LOST, 9);
        y = iv7Var10;
        iv7 iv7Var11 = new iv7("VOID", 10);
        z = iv7Var11;
        A = new iv7[]{iv7Var, iv7Var2, iv7Var3, iv7Var4, iv7Var5, iv7Var6, iv7Var7, iv7Var8, iv7Var9, iv7Var10, iv7Var11, new iv7("REFUND_ALL", 11), new iv7("WIN_AND_REFUND_HALF", 12), new iv7("LOST_AND_REFUND_HALF", 13)};
    }

    public iv7() {
        throw null;
    }

    public static iv7 valueOf(String str) {
        return (iv7) Enum.valueOf(iv7.class, str);
    }

    public static iv7[] values() {
        return (iv7[]) A.clone();
    }
}

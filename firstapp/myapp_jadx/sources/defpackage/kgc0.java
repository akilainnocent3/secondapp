package defpackage;

import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoEvent;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kgc0 {
    public static final clc0 a(SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEvent, vlc0 vlc0Var) {
        sportyLegendsSettlementRoundInfoEvent.getClass();
        String strSubstring = sportyLegendsSettlementRoundInfoEvent.e;
        int iS = StringsKt.S(strSubstring, 'H', 0, 6);
        String strSubstring2 = iS != -1 ? strSubstring.substring(0, iS) : "";
        if (iS != -1) {
            strSubstring = strSubstring.substring(iS + 1);
        }
        int i = 0;
        for (int i2 = 0; i2 < strSubstring2.length(); i2++) {
            if (strSubstring2.charAt(i2) == 'A') {
                i++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < strSubstring2.length(); i4++) {
            if (strSubstring2.charAt(i4) == 'B') {
                i3++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < strSubstring.length(); i6++) {
            if (strSubstring.charAt(i6) == 'A') {
                i5++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < strSubstring.length(); i8++) {
            if (strSubstring.charAt(i8) == 'B') {
                i7++;
            }
        }
        clc0 clc0Var = new clc0(sportyLegendsSettlementRoundInfoEvent.a, sportyLegendsSettlementRoundInfoEvent.b, i + i5, sportyLegendsSettlementRoundInfoEvent.c, sportyLegendsSettlementRoundInfoEvent.d, i3 + i7, null);
        int iOrdinal = vlc0Var.ordinal();
        if (iOrdinal == 0) {
            return clc0.a(clc0Var, 0, 0, 27);
        }
        if (iOrdinal == 1) {
            return clc0Var;
        }
        uhc.a();
        return null;
    }
}

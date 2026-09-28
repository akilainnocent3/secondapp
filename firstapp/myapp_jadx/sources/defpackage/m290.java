package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class m290 {
    public static final Set<g08> a = ay0.V(new g08[]{g08.UNKNOWN, g08.SINGLE_PREMATCH_BET, g08.SINGLE_LIVE_BET, g08.COMBO_PREMATCH_BET, g08.COMBO_LIVE_BET, g08.SINGLE_BET_BUILDER_MATCH_PAGE, g08.SINGLE_PRE_CANNED_BET_BUILDER_MATCH_PAGE, g08.COMBO_BET_BUILDER_MATCH_PAGE, g08.COMBO_PRE_CANNED_BET_BUILDER_MATCH_PAGE, g08.PRE_CANNED_BET_BUILDER, g08.FEATURED_BET_BUILDER, g08.LOAD_BOOKING_CODE_EMPTY_BETSLIP, g08.LOAD_BOOKING_CODE_REMOVE_MATCH});

    public static String a(String str) {
        Object next;
        if (str == null || StringsKt.U(str)) {
            return "betslip";
        }
        uag uagVar = g08.W;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (!Intrinsics.g(((g08) next).name(), str));
        g08 g08Var = (g08) next;
        if (g08Var != null) {
            if (g08Var == g08.SHARE_BOOKING_CODE_LOAD_CODE) {
                return "share_link";
            }
            if (g08Var == g08.REBET_FROM_HISTORY) {
                return "rebet_from_bet_history";
            }
            if (g08Var == g08.REBET_FROM_OPEN_BETS) {
                return "rebet_from_open_bets";
            }
            if (g08Var == g08.FEATURED_BOOKING_CODE_EMPTY_BETSLIP) {
                return "recommended_code_at_empty_betslip";
            }
            if (g08Var == g08.RECOMMENDED_BOOKING_CODE_SUCCESSFUL) {
                return "recommended_codes_at_empty_open_bet";
            }
            if (a.contains(g08Var)) {
                return "betslip";
            }
        }
        return null;
    }
}

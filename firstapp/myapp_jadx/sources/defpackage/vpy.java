package defpackage;

import android.content.Context;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import com.sportygames.onboarding.common.EOOnboardingAmount;
import com.sportygames.onboarding.common.EOOnboardingAmountArrow;
import com.sportygames.onboarding.common.EOOnboardingBet;
import com.sportygames.onboarding.common.EOOnboardingBetArrow;
import com.sportygames.onboarding.common.RBOnboardingAmount;
import com.sportygames.onboarding.common.RBOnboardingAmountArrow;
import com.sportygames.onboarding.common.RBOnboardingBet;
import com.sportygames.onboarding.common.RBOnboardingBetArrow;
import com.sportygames.onboarding.common.RBOnboardingChat;
import com.sportygames.onboarding.common.RBOnboardingChatArrow;
import com.sportygames.onboarding.common.SDBOnboardingAmount;
import com.sportygames.onboarding.common.SDBOnboardingAmountArrow;
import com.sportygames.onboarding.common.SDBOnboardingBet;
import com.sportygames.onboarding.common.SDBOnboardingBetArrow;
import com.sportygames.onboarding.common.SDBOnboardingChat;
import com.sportygames.onboarding.common.SDBOnboardingChatArrow;
import com.sportygames.onboarding.evenodd.EOOnboardingChat;
import com.sportygames.onboarding.evenodd.EOOnboardingChatArrow;
import com.sportygames.onboarding.fruithunt.FHOnboardingChat;
import com.sportygames.onboarding.fruithunt.FHOnboardingChatArrow;
import com.sportygames.onboarding.fruithunt.FHOnboardingKnife;
import com.sportygames.onboarding.fruithunt.FHOnboardingThrow;
import com.sportygames.onboarding.pingPong.PPInteractiveOnboardingCashOut;
import com.sportygames.onboarding.pingPong.PPOnboardingBet;
import com.sportygames.onboarding.pingPong.PPOnboardingBetArrow;
import com.sportygames.onboarding.pocketrocket.PRInteractiveOnboardingCashOut;
import com.sportygames.onboarding.pocketrocket.PROnboardingBet;
import com.sportygames.onboarding.pocketrocket.PROnboardingBetArrow;
import com.sportygames.onboarding.rush.RushOnboardingAmount;
import com.sportygames.onboarding.rush.RushOnboardingAuto;
import com.sportygames.onboarding.rush.RushOnboardingAutoArrow;
import com.sportygames.onboarding.rush.RushOnboardingBet;
import com.sportygames.onboarding.rush.RushOnboardingBetArrow;
import com.sportygames.onboarding.rush.RushOnboardingChat;
import com.sportygames.onboarding.rush.RushOnboardingChatArrow;
import com.sportygames.onboarding.rush.RushOnboardingCoefficient;
import com.sportygames.onboarding.rush.RushOnboardingCoefficientArrow;
import com.sportygames.onboarding.spin2win.SWOnboardingBoard;
import com.sportygames.onboarding.spin2win.SWOnboardingBoardArrow;
import com.sportygames.onboarding.spin2win.SWOnboardingChat;
import com.sportygames.onboarding.spin2win.SWOnboardingChatArrow;
import com.sportygames.onboarding.spin2win.SWOnboardingChips;
import com.sportygames.onboarding.spin2win.SWOnboardingChipsArrow;
import com.sportygames.onboarding.spinmatch.FHOnboardingBet;
import com.sportygames.onboarding.spinmatch.FHOnboardingBetArrow;
import com.sportygames.onboarding.spinmatch.FHOnboardingKnifeArrow;
import com.sportygames.onboarding.spinmatch.FHOnboardingMenuSetting;
import com.sportygames.onboarding.spinmatch.FHOnboardingMenuSettingArrow;
import com.sportygames.onboarding.spinmatch.FHOnboardingThrowArrow;
import com.sportygames.onboarding.spinmatch.RushOnboardingAmountArrow;
import com.sportygames.onboarding.spinmatch.SMOnboardingChat;
import com.sportygames.onboarding.spinmatch.SMOnboardingChatArrow;
import com.sportygames.onboarding.spinmatch.SMOnboardingChips;
import com.sportygames.onboarding.spinmatch.SMOnboardingChipsArrow;
import com.sportygames.onboarding.spinmatch.SMOnboardingMultiplier;
import com.sportygames.onboarding.spinmatch.SMOnboardingMultiplierArrow;
import com.sportygames.onboarding.spinmatch.SMOnboardingSpin;
import com.sportygames.onboarding.spinmatch.SMOnboardingSpinArrow;
import com.sportygames.onboarding.spinmatch.SWOnboardingSpin;
import com.sportygames.onboarding.spinmatch.SWOnboardingSpinArrow;
import com.sportygames.onboarding.sportyhero.SHInteractiveOnboardingCashOut;
import com.sportygames.onboarding.sportyhero.SHOnboardingBet;
import com.sportygames.onboarding.sportyhero.SHOnboardingBetArrow;
import com.sportygames.onboarding.sportyhero.SHOnboardingValentineIntro;
import com.sportygames.onboarding.sportyhero.SHOnboardingValentineIntroArrow;
import com.sportygames.onboarding.sportyhero.SHOnboardingValentineSwitch;
import com.sportygames.onboarding.sportyhero.SHOnboardingValentineSwitchArrow;
import com.sportygames.onboarding.sportyjet.SJInteractiveOnboardingCashOut;
import com.sportygames.onboarding.sportyjet.SJOnboardingBetArrow;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vpy {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static DynamicOnboardingScreenBasicBase[] a(Context context, String str, String str2, Map map, boolean z, bm60 bm60Var, plz plzVar, glz glzVar, xn60 xn60Var) {
        int i;
        Float f;
        Float f2;
        Object obj;
        Object obj2;
        Object obj3;
        Float f3;
        Float f4;
        Float f5;
        Float f6;
        Float f7;
        Float f8;
        Float f9;
        Float f10;
        Float f11;
        Object obj4;
        Object obj5;
        Object obj6;
        Float f12;
        Float f13;
        Float f14;
        Float f15;
        Float f16;
        Float f17;
        str.getClass();
        try {
            i = "sporty-hero";
            try {
                try {
                    try {
                        if (Intrinsics.g(str2, "gh") || Intrinsics.g(str2, CaxEybC.ajXJupDEktlbFG)) {
                            switch (str.hashCode()) {
                                case -1790437656:
                                    if (str.equals("pocket-rockets")) {
                                        PRInteractiveOnboardingCashOut pRInteractiveOnboardingCashOut = new PRInteractiveOnboardingCashOut(context, null, 0, 14);
                                        if (map != null) {
                                            pRInteractiveOnboardingCashOut.i(map.containsKey("PR_BET1_PLACED") && Intrinsics.e((Float) map.get("PR_BET1_PLACED"), 1.0f), map.containsKey("PR_BET2_PLACED") && Intrinsics.e((Float) map.get("PR_BET2_PLACED"), 1.0f), map.containsKey("PR_BET3_PLACED") && Intrinsics.e((Float) map.get("PR_BET3_PLACED"), 1.0f));
                                            Unit unit = Unit.a;
                                        }
                                        pRInteractiveOnboardingCashOut.setPrOnboardingInteractionListener(plzVar);
                                        Unit unit2 = Unit.a;
                                        return new DynamicOnboardingScreenBasicBase[]{new PROnboardingBetArrow(context, null, 0, 14), pRInteractiveOnboardingCashOut};
                                    }
                                    break;
                                case -424980621:
                                    if (str.equals("ping-pong")) {
                                        PPInteractiveOnboardingCashOut pPInteractiveOnboardingCashOut = new PPInteractiveOnboardingCashOut(context, null, 0, 14);
                                        if (map != null) {
                                            pPInteractiveOnboardingCashOut.i(map.containsKey("PP_BET_PLACED") && Intrinsics.e((Float) map.get("PP_BET_PLACED"), 1.0f), map.containsKey("PP_BET1_PLACED") && Intrinsics.e((Float) map.get("PP_BET1_PLACED"), 1.0f));
                                            Unit unit3 = Unit.a;
                                        }
                                        pPInteractiveOnboardingCashOut.setPpOnboardingInteractionListener(glzVar);
                                        Unit unit4 = Unit.a;
                                        return new DynamicOnboardingScreenBasicBase[]{new PPOnboardingBetArrow(context, null, 0, 14), pPInteractiveOnboardingCashOut};
                                    }
                                    break;
                                case -23008317:
                                    if (str.equals("red-black")) {
                                        return z ? new DynamicOnboardingScreenBasicBase[]{new RBOnboardingAmountArrow(context, null, 0, 14), new RBOnboardingBetArrow(context, null, 0, 14), new RBOnboardingChatArrow(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new RBOnboardingAmountArrow(context, null, 0, 14), new RBOnboardingBetArrow(context, null, 0, 14)};
                                    }
                                    break;
                                case 3512280:
                                    if (str.equals("rush")) {
                                        RushOnboardingBetArrow rushOnboardingBetArrow = new RushOnboardingBetArrow(context, null, 0, 14);
                                        if (map != null) {
                                            if (map.containsKey("RUSH_BET_BUTTON_HEIGHT") && (f2 = (Float) map.get("RUSH_BET_BUTTON_HEIGHT")) != null) {
                                                rushOnboardingBetArrow.setBetHeight(f2.floatValue());
                                                Unit unit5 = Unit.a;
                                            }
                                            if (map.containsKey("RUSH_BET_BUTTON_WIDTH") && (f = (Float) map.get("RUSH_BET_BUTTON_WIDTH")) != null) {
                                                rushOnboardingBetArrow.setBetWidth(f.floatValue());
                                                Unit unit6 = Unit.a;
                                            }
                                            Unit unit7 = Unit.a;
                                        }
                                        return z ? new DynamicOnboardingScreenBasicBase[]{new RushOnboardingCoefficientArrow(context, null, 0, 14), new RushOnboardingAmountArrow(context, null, 0, 14), rushOnboardingBetArrow, new RushOnboardingAutoArrow(context, null, 0, 14), new RushOnboardingChatArrow(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new RushOnboardingCoefficientArrow(context, null, 0, 14), new RushOnboardingAmountArrow(context, null, 0, 14), rushOnboardingBetArrow, new RushOnboardingAutoArrow(context, null, 0, 14)};
                                    }
                                    break;
                                case 13143121:
                                    if (str.equals("sporty-jet")) {
                                        SJInteractiveOnboardingCashOut sJInteractiveOnboardingCashOut = new SJInteractiveOnboardingCashOut(context, null, 0, 14);
                                        if (map != null) {
                                            sJInteractiveOnboardingCashOut.i(map.containsKey("SJ_BET_PLACED") && Intrinsics.e((Float) map.get("SJ_BET_PLACED"), 1.0f), map.containsKey("SJ_BET1_PLACED") && Intrinsics.e((Float) map.get("SJ_BET1_PLACED"), 1.0f));
                                            Unit unit8 = Unit.a;
                                        }
                                        sJInteractiveOnboardingCashOut.setSjOnboardingInteractionListener(xn60Var);
                                        Unit unit9 = Unit.a;
                                        return new DynamicOnboardingScreenBasicBase[]{new SJOnboardingBetArrow(context, null, 0, 14), sJInteractiveOnboardingCashOut};
                                    }
                                    break;
                                case 276018684:
                                    if (str.equals("even-odd")) {
                                        return z ? new DynamicOnboardingScreenBasicBase[]{new EOOnboardingAmountArrow(context, null, 0, 14), new EOOnboardingBetArrow(context, null, 0, 14), new EOOnboardingChatArrow(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new EOOnboardingAmountArrow(context, null, 0, 14), new EOOnboardingBetArrow(context, null, 0, 14)};
                                    }
                                    break;
                                case 407377218:
                                    if (str.equals("sporty-hero")) {
                                        SHInteractiveOnboardingCashOut sHInteractiveOnboardingCashOut = new SHInteractiveOnboardingCashOut(context, null, 0, 14);
                                        if (map != null) {
                                            boolean z2 = map.containsKey("SH_BET_PLACED") && Intrinsics.e((Float) map.get("SH_BET_PLACED"), 1.0f);
                                            boolean z3 = map.containsKey("SH_BET1_PLACED") && Intrinsics.e((Float) map.get("SH_BET1_PLACED"), 1.0f);
                                            obj3 = "SH_IS_SIDE_BETS_ENABLED";
                                            boolean z4 = map.containsKey(obj3) && Intrinsics.e((Float) map.get(obj3), 1.0f);
                                            obj2 = "top_percent";
                                            Float f18 = (Float) map.get(obj2);
                                            float fFloatValue = f18 != null ? f18.floatValue() : 0.0f;
                                            Float f19 = (Float) map.get("top_percent1");
                                            float fFloatValue2 = f19 != null ? f19.floatValue() : 0.0f;
                                            obj = "container_height";
                                            Float f20 = (Float) map.get(obj);
                                            float fFloatValue3 = f20 != null ? f20.floatValue() : 0.0f;
                                            Float f21 = (Float) map.get("ui_type");
                                            sHInteractiveOnboardingCashOut.i(z2, z3, z4, fFloatValue, fFloatValue3, fFloatValue2, (int) (f21 != null ? f21.floatValue() : 2.0f));
                                            Unit unit10 = Unit.a;
                                        } else {
                                            obj = "container_height";
                                            obj2 = "top_percent";
                                            obj3 = "SH_IS_SIDE_BETS_ENABLED";
                                        }
                                        sHInteractiveOnboardingCashOut.setShOnboardingInteractionListener(bm60Var);
                                        Unit unit11 = Unit.a;
                                        SHOnboardingBetArrow sHOnboardingBetArrow = new SHOnboardingBetArrow(context, null, 0, 14);
                                        if (map != null && map.containsKey(obj3) && (f3 = (Float) map.get(obj3)) != null) {
                                            float fFloatValue4 = f3.floatValue();
                                            Float f22 = (Float) map.get(obj2);
                                            Float f23 = (Float) map.get(obj);
                                            sHOnboardingBetArrow.j(f22 != null ? f22.floatValue() : 0.0f, f23 != null ? f23.floatValue() : 0.0f, fFloatValue4 == 1.0f);
                                        }
                                        return (map != null && map.containsKey("SH_ONBOARDING_VALENTINES_THEME") && Intrinsics.e((Float) map.get("SH_ONBOARDING_VALENTINES_THEME"), 1.0f)) ? new DynamicOnboardingScreenBasicBase[]{sHOnboardingBetArrow, new SHOnboardingValentineIntroArrow(context, null, 0, 14), new SHOnboardingValentineSwitchArrow(context, null, 0, 14), sHInteractiveOnboardingCashOut} : new DynamicOnboardingScreenBasicBase[]{sHOnboardingBetArrow, sHInteractiveOnboardingCashOut};
                                    }
                                    break;
                                case 605180235:
                                    if (str.equals("spin-da-bottle")) {
                                        return z ? new DynamicOnboardingScreenBasicBase[]{new SDBOnboardingAmountArrow(context, null, 0, 14), new SDBOnboardingBetArrow(context, null, 0, 14), new SDBOnboardingChatArrow(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new SDBOnboardingAmountArrow(context, null, 0, 14), new SDBOnboardingBetArrow(context, null, 0, 14)};
                                    }
                                    break;
                                case 1143942266:
                                    if (str.equals("spin-match")) {
                                        SMOnboardingChipsArrow sMOnboardingChipsArrow = new SMOnboardingChipsArrow(context, null, 0, 14);
                                        SMOnboardingMultiplierArrow sMOnboardingMultiplierArrow = new SMOnboardingMultiplierArrow(context, null, 0, 14);
                                        if (map != null) {
                                            if (map.containsKey("SM_VIEW1_PERCENT") && (f5 = (Float) map.get("SM_VIEW1_PERCENT")) != null) {
                                                float fFloatValue5 = f5.floatValue();
                                                sMOnboardingChipsArrow.setFocusBox2Height1(Float.valueOf(fFloatValue5));
                                                sMOnboardingMultiplierArrow.setFocusBox2Height1(Float.valueOf(fFloatValue5));
                                                Unit unit12 = Unit.a;
                                            }
                                            if (map.containsKey("SM_VIEW2_PERCENT") && (f4 = (Float) map.get("SM_VIEW2_PERCENT")) != null) {
                                                float fFloatValue6 = f4.floatValue();
                                                sMOnboardingChipsArrow.setFocusBox2Height2(Float.valueOf(fFloatValue6));
                                                sMOnboardingMultiplierArrow.setFocusBox2Height2(Float.valueOf(fFloatValue6));
                                                Unit unit13 = Unit.a;
                                            }
                                            Unit unit14 = Unit.a;
                                        }
                                        return z ? new DynamicOnboardingScreenBasicBase[]{sMOnboardingMultiplierArrow, sMOnboardingChipsArrow, new SMOnboardingSpinArrow(context, null, 0, 14), new SMOnboardingChatArrow(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{sMOnboardingMultiplierArrow, sMOnboardingChipsArrow, new SMOnboardingSpinArrow(context, null, 0, 14)};
                                    }
                                    break;
                                case 1313709429:
                                    if (str.equals("spin-to-win")) {
                                        return z ? new DynamicOnboardingScreenBasicBase[]{new SWOnboardingBoardArrow(context, null, 0, 14), new SWOnboardingChipsArrow(context, null, 0, 14), new SWOnboardingSpinArrow(context, null, 0, 14), new SWOnboardingChatArrow(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new SWOnboardingBoardArrow(context, null, 0, 14), new SWOnboardingChipsArrow(context, null, 0, 14), new SWOnboardingSpinArrow(context, null, 0, 14)};
                                    }
                                    break;
                                case 1353819564:
                                    if (str.equals("fruit-hunt")) {
                                        FHOnboardingMenuSettingArrow fHOnboardingMenuSettingArrow = new FHOnboardingMenuSettingArrow(context, null, 0, 14);
                                        if (map != null) {
                                            if (map.containsKey("FH_HAM_ITEM0_HEIGHT") && (f9 = (Float) map.get("FH_HAM_ITEM0_HEIGHT")) != null) {
                                                fHOnboardingMenuSettingArrow.setItemHeight0(f9.floatValue());
                                                Unit unit15 = Unit.a;
                                            }
                                            if (map.containsKey("FH_HAM_ITEM1_HEIGHT") && (f8 = (Float) map.get("FH_HAM_ITEM1_HEIGHT")) != null) {
                                                fHOnboardingMenuSettingArrow.setItemHeight1(f8.floatValue());
                                                Unit unit16 = Unit.a;
                                            }
                                            if (map.containsKey("FH_HAM_ITEM2_HEIGHT") && (f7 = (Float) map.get("FH_HAM_ITEM2_HEIGHT")) != null) {
                                                fHOnboardingMenuSettingArrow.setItemHeight2(f7.floatValue());
                                                Unit unit17 = Unit.a;
                                            }
                                            if (map.containsKey("FH_HAM_ITEM_WIDTH") && (f6 = (Float) map.get("FH_HAM_ITEM_WIDTH")) != null) {
                                                fHOnboardingMenuSettingArrow.setItemWidth(f6.floatValue());
                                                Unit unit18 = Unit.a;
                                            }
                                            Unit unit19 = Unit.a;
                                        }
                                        return z ? new DynamicOnboardingScreenBasicBase[]{new FHOnboardingBetArrow(context, null, 0, 14), new FHOnboardingKnifeArrow(context, null, 0, 14), new FHOnboardingThrowArrow(context, null, 0, 14), new FHOnboardingChatArrow(context, null, 0, 14), fHOnboardingMenuSettingArrow} : new DynamicOnboardingScreenBasicBase[]{new FHOnboardingBetArrow(context, null, 0, 14), new FHOnboardingKnifeArrow(context, null, 0, 14), new FHOnboardingThrowArrow(context, null, 0, 14), fHOnboardingMenuSettingArrow};
                                    }
                                    break;
                            }
                            return new DynamicOnboardingScreenBasicBase[0];
                        }
                        switch (str.hashCode()) {
                            case -1790437656:
                                if (str.equals("pocket-rockets")) {
                                    PRInteractiveOnboardingCashOut pRInteractiveOnboardingCashOut2 = new PRInteractiveOnboardingCashOut(context, null, 0, 14);
                                    if (map != null) {
                                        pRInteractiveOnboardingCashOut2.i(map.containsKey("PR_BET1_PLACED") && Intrinsics.e((Float) map.get("PR_BET1_PLACED"), 1.0f), map.containsKey("PR_BET2_PLACED") && Intrinsics.e((Float) map.get("PR_BET2_PLACED"), 1.0f), map.containsKey("PR_BET3_PLACED") && Intrinsics.e((Float) map.get("PR_BET3_PLACED"), 1.0f));
                                        Unit unit20 = Unit.a;
                                    }
                                    pRInteractiveOnboardingCashOut2.setPrOnboardingInteractionListener(plzVar);
                                    Unit unit21 = Unit.a;
                                    return new DynamicOnboardingScreenBasicBase[]{new PROnboardingBet(context, null, 0, 14), pRInteractiveOnboardingCashOut2};
                                }
                                break;
                            case -424980621:
                                if (str.equals("ping-pong")) {
                                    PPInteractiveOnboardingCashOut pPInteractiveOnboardingCashOut2 = new PPInteractiveOnboardingCashOut(context, null, 0, 14);
                                    if (map != null) {
                                        pPInteractiveOnboardingCashOut2.i(map.containsKey("PP_BET_PLACED") && Intrinsics.e((Float) map.get("PP_BET_PLACED"), 1.0f), map.containsKey("PP_BET1_PLACED") && Intrinsics.e((Float) map.get("PP_BET1_PLACED"), 1.0f));
                                        Unit unit22 = Unit.a;
                                    }
                                    pPInteractiveOnboardingCashOut2.setPpOnboardingInteractionListener(glzVar);
                                    Unit unit23 = Unit.a;
                                    return new DynamicOnboardingScreenBasicBase[]{new PPOnboardingBet(context, null, 0, 14), pPInteractiveOnboardingCashOut2};
                                }
                                break;
                            case -23008317:
                                if (str.equals("red-black")) {
                                    return z ? new DynamicOnboardingScreenBasicBase[]{new RBOnboardingAmount(context, null, 0, 14), new RBOnboardingBet(context, null, 0, 14), new RBOnboardingChat(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new RBOnboardingAmount(context, null, 0, 14), new RBOnboardingBet(context, null, 0, 14)};
                                }
                                break;
                            case 3512280:
                                if (str.equals("rush")) {
                                    RushOnboardingBet rushOnboardingBet = new RushOnboardingBet(context, null, 0, 14);
                                    if (map != null) {
                                        if (map.containsKey("RUSH_BET_BUTTON_HEIGHT") && (f11 = (Float) map.get("RUSH_BET_BUTTON_HEIGHT")) != null) {
                                            rushOnboardingBet.setBetHeight(f11.floatValue());
                                            Unit unit24 = Unit.a;
                                        }
                                        if (map.containsKey("RUSH_BET_BUTTON_WIDTH") && (f10 = (Float) map.get("RUSH_BET_BUTTON_WIDTH")) != null) {
                                            rushOnboardingBet.setBetWidth(f10.floatValue());
                                            Unit unit25 = Unit.a;
                                        }
                                        Unit unit26 = Unit.a;
                                    }
                                    return z ? new DynamicOnboardingScreenBasicBase[]{new RushOnboardingCoefficient(context, null, 0, 14), new RushOnboardingAmount(context, null, 0, 14), rushOnboardingBet, new RushOnboardingAuto(context, null, 0, 14), new RushOnboardingChat(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new RushOnboardingCoefficient(context, null, 0, 14), new RushOnboardingAmount(context, null, 0, 14), rushOnboardingBet, new RushOnboardingAuto(context, null, 0, 14)};
                                }
                                break;
                            case 13143121:
                                if (str.equals("sporty-jet")) {
                                    SJInteractiveOnboardingCashOut sJInteractiveOnboardingCashOut2 = new SJInteractiveOnboardingCashOut(context, null, 0, 14);
                                    if (map != null) {
                                        sJInteractiveOnboardingCashOut2.i(map.containsKey("SJ_BET_PLACED") && Intrinsics.e((Float) map.get("SJ_BET_PLACED"), 1.0f), map.containsKey("SJ_BET1_PLACED") && Intrinsics.e((Float) map.get("SJ_BET1_PLACED"), 1.0f));
                                        Unit unit27 = Unit.a;
                                    }
                                    sJInteractiveOnboardingCashOut2.setSjOnboardingInteractionListener(xn60Var);
                                    Unit unit28 = Unit.a;
                                    return new DynamicOnboardingScreenBasicBase[]{new SJOnboardingBetArrow(context, null, 0, 14), sJInteractiveOnboardingCashOut2};
                                }
                                break;
                            case 276018684:
                                if (str.equals("even-odd")) {
                                    return z ? new DynamicOnboardingScreenBasicBase[]{new EOOnboardingAmount(context, null, 0, 14), new EOOnboardingBet(context, null, 0, 14), new EOOnboardingChat(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new EOOnboardingAmount(context, null, 0, 14), new EOOnboardingBet(context, null, 0, 14)};
                                }
                                break;
                            case 407377218:
                                if (str.equals("sporty-hero")) {
                                    SHInteractiveOnboardingCashOut sHInteractiveOnboardingCashOut2 = new SHInteractiveOnboardingCashOut(context, null, 0, 14);
                                    if (map != null) {
                                        boolean z5 = map.containsKey("SH_BET_PLACED") && Intrinsics.e((Float) map.get("SH_BET_PLACED"), 1.0f);
                                        boolean z6 = map.containsKey("SH_BET1_PLACED") && Intrinsics.e((Float) map.get("SH_BET1_PLACED"), 1.0f);
                                        obj6 = "SH_IS_SIDE_BETS_ENABLED";
                                        boolean z7 = map.containsKey(obj6) && Intrinsics.e((Float) map.get(obj6), 1.0f);
                                        obj5 = "top_percent";
                                        Float f24 = (Float) map.get(obj5);
                                        float fFloatValue7 = f24 != null ? f24.floatValue() : 0.0f;
                                        Float f25 = (Float) map.get("top_percent1");
                                        float fFloatValue8 = f25 != null ? f25.floatValue() : 0.0f;
                                        obj4 = "container_height";
                                        Float f26 = (Float) map.get(obj4);
                                        float fFloatValue9 = f26 != null ? f26.floatValue() : 0.0f;
                                        Float f27 = (Float) map.get("ui_type");
                                        sHInteractiveOnboardingCashOut2.i(z5, z6, z7, fFloatValue7, fFloatValue9, fFloatValue8, (int) (f27 != null ? f27.floatValue() : 2.0f));
                                        Unit unit29 = Unit.a;
                                    } else {
                                        obj4 = "container_height";
                                        obj5 = "top_percent";
                                        obj6 = "SH_IS_SIDE_BETS_ENABLED";
                                    }
                                    sHInteractiveOnboardingCashOut2.setShOnboardingInteractionListener(bm60Var);
                                    Unit unit30 = Unit.a;
                                    SHOnboardingBet sHOnboardingBet = new SHOnboardingBet(context, null, 0, 14);
                                    if (map != null && map.containsKey(obj6)) {
                                        Float f28 = (Float) map.get(obj6);
                                        Float f29 = (Float) map.get(obj5);
                                        Float f30 = (Float) map.get(obj4);
                                        if (f28 != null) {
                                            sHOnboardingBet.i(f29 != null ? f29.floatValue() : 0.0f, f30 != null ? f30.floatValue() : 0.0f, f28.floatValue() == 1.0f);
                                        }
                                    }
                                    return (map != null && map.containsKey("SH_ONBOARDING_VALENTINES_THEME") && Intrinsics.e((Float) map.get("SH_ONBOARDING_VALENTINES_THEME"), 1.0f)) ? new DynamicOnboardingScreenBasicBase[]{sHOnboardingBet, new SHOnboardingValentineIntro(context, null, 0, 14), new SHOnboardingValentineSwitch(context, null, 0, 14), sHInteractiveOnboardingCashOut2} : new DynamicOnboardingScreenBasicBase[]{sHOnboardingBet, sHInteractiveOnboardingCashOut2};
                                }
                                break;
                            case 605180235:
                                if (str.equals("spin-da-bottle")) {
                                    return z ? new DynamicOnboardingScreenBasicBase[]{new SDBOnboardingAmount(context, null, 0, 14), new SDBOnboardingBet(context, null, 0, 14), new SDBOnboardingChat(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new SDBOnboardingAmount(context, null, 0, 14), new SDBOnboardingBet(context, null, 0, 14)};
                                }
                                break;
                            case 1143942266:
                                if (str.equals("spin-match")) {
                                    SMOnboardingChips sMOnboardingChips = new SMOnboardingChips(context, null, 0, 14);
                                    SMOnboardingMultiplier sMOnboardingMultiplier = new SMOnboardingMultiplier(context, null, 0, 14);
                                    if (map != null) {
                                        if (map.containsKey("SM_VIEW1_PERCENT") && (f13 = (Float) map.get("SM_VIEW1_PERCENT")) != null) {
                                            float fFloatValue10 = f13.floatValue();
                                            sMOnboardingChips.setFocusBox2Height1(Float.valueOf(fFloatValue10));
                                            sMOnboardingMultiplier.setFocusBox2Height1(Float.valueOf(fFloatValue10));
                                            Unit unit31 = Unit.a;
                                        }
                                        if (map.containsKey("SM_VIEW2_PERCENT") && (f12 = (Float) map.get("SM_VIEW2_PERCENT")) != null) {
                                            float fFloatValue11 = f12.floatValue();
                                            sMOnboardingChips.setFocusBox2Height2(Float.valueOf(fFloatValue11));
                                            sMOnboardingMultiplier.setFocusBox2Height2(Float.valueOf(fFloatValue11));
                                            Unit unit32 = Unit.a;
                                        }
                                        Unit unit33 = Unit.a;
                                    }
                                    return z ? new DynamicOnboardingScreenBasicBase[]{sMOnboardingMultiplier, sMOnboardingChips, new SMOnboardingSpin(context, null, 0, 14), new SMOnboardingChat(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{sMOnboardingMultiplier, sMOnboardingChips, new SMOnboardingSpin(context, null, 0, 14)};
                                }
                                break;
                            case 1313709429:
                                if (str.equals("spin-to-win")) {
                                    return z ? new DynamicOnboardingScreenBasicBase[]{new SWOnboardingBoard(context, null, 0, 14), new SWOnboardingChips(context, null, 0, 14), new SWOnboardingSpin(context, null, 0, 14), new SWOnboardingChat(context, null, 0, 14)} : new DynamicOnboardingScreenBasicBase[]{new SWOnboardingBoard(context, null, 0, 14), new SWOnboardingChips(context, null, 0, 14), new SWOnboardingSpin(context, null, 0, 14)};
                                }
                                break;
                            case 1353819564:
                                if (str.equals("fruit-hunt")) {
                                    FHOnboardingMenuSetting fHOnboardingMenuSetting = new FHOnboardingMenuSetting(context, null, 0, 14);
                                    if (map != null) {
                                        if (map.containsKey("FH_HAM_ITEM0_HEIGHT") && (f17 = (Float) map.get("FH_HAM_ITEM0_HEIGHT")) != null) {
                                            fHOnboardingMenuSetting.setItemHeight0(f17.floatValue());
                                            Unit unit34 = Unit.a;
                                        }
                                        if (map.containsKey("FH_HAM_ITEM1_HEIGHT") && (f16 = (Float) map.get("FH_HAM_ITEM1_HEIGHT")) != null) {
                                            fHOnboardingMenuSetting.setItemHeight1(f16.floatValue());
                                            Unit unit35 = Unit.a;
                                        }
                                        if (map.containsKey("FH_HAM_ITEM2_HEIGHT") && (f15 = (Float) map.get("FH_HAM_ITEM2_HEIGHT")) != null) {
                                            fHOnboardingMenuSetting.setItemHeight2(f15.floatValue());
                                            Unit unit36 = Unit.a;
                                        }
                                        if (map.containsKey("FH_HAM_ITEM_WIDTH") && (f14 = (Float) map.get("FH_HAM_ITEM_WIDTH")) != null) {
                                            fHOnboardingMenuSetting.setItemWidth(f14.floatValue());
                                            Unit unit37 = Unit.a;
                                        }
                                        Unit unit38 = Unit.a;
                                    }
                                    return z ? new DynamicOnboardingScreenBasicBase[]{new FHOnboardingBet(context, null, 0, 14), new FHOnboardingKnife(context, null, 0, 14), new FHOnboardingThrow(context, null, 0, 14), new FHOnboardingChat(context, null, 0, 14), fHOnboardingMenuSetting} : new DynamicOnboardingScreenBasicBase[]{new FHOnboardingBet(context, null, 0, 14), new FHOnboardingKnife(context, null, 0, 14), new FHOnboardingThrow(context, null, 0, 14), fHOnboardingMenuSetting};
                                }
                                break;
                        }
                        return new DynamicOnboardingScreenBasicBase[0];
                    } catch (Exception unused) {
                        i = "spin-match";
                        return new DynamicOnboardingScreenBasicBase[i];
                    }
                } catch (Exception unused2) {
                    i = "SM_VIEW1_PERCENT";
                    return new DynamicOnboardingScreenBasicBase[i];
                }
            } catch (Exception unused3) {
                return new DynamicOnboardingScreenBasicBase[i];
            }
        } catch (Exception unused4) {
            i = 0;
        }
    }
}

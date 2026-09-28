package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class hd3 {
    public static final /* synthetic */ int a = 0;

    public static LinkedHashMap a(Double d, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Long l, Long l2, String str, String str2, Boolean bool10, String str3, String str4, Double d2, Double d3, List list, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, String str5, Integer num, Boolean bool20, int i) {
        Double d4 = (i & 1) != 0 ? null : d;
        Boolean bool21 = (i & 8) != 0 ? null : bool3;
        Boolean bool22 = (i & 16) != 0 ? null : bool4;
        Boolean bool23 = (i & 64) != 0 ? null : bool6;
        Boolean bool24 = (i & 128) != 0 ? null : bool7;
        Boolean bool25 = (i & 512) != 0 ? null : bool9;
        String str6 = (32768 & i) != 0 ? null : str3;
        String str7 = (65536 & i) != 0 ? null : str4;
        Double d5 = (131072 & i) != 0 ? null : d2;
        Boolean bool26 = (1048576 & i) != 0 ? null : bool11;
        Boolean bool27 = (2097152 & i) != 0 ? null : bool12;
        Boolean bool28 = (4194304 & i) != 0 ? null : bool13;
        Boolean bool29 = (8388608 & i) != 0 ? null : bool14;
        Boolean bool30 = (16777216 & i) != 0 ? null : bool15;
        Boolean bool31 = (i & 33554432) != 0 ? null : bool16;
        Boolean bool32 = (i & 67108864) != 0 ? null : bool17;
        Boolean bool33 = (i & 134217728) != 0 ? null : bool18;
        String str8 = (i & 536870912) != 0 ? null : str5;
        Boolean bool34 = bool32;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap, "currentBet", d4);
        b(linkedHashMap, "betPlaced", bool);
        b(linkedHashMap, "betInProgress", bool2);
        b(linkedHashMap, "cashOutDone", bool21);
        b(linkedHashMap, "cashOutInProgress", bool22);
        b(linkedHashMap, "isAutoBetEnabled", bool5);
        b(linkedHashMap, "autoBetFlagFromServer", bool23);
        b(linkedHashMap, "isOneTapEnabled", bool24);
        b(linkedHashMap, "isFbgSelected", bool8);
        b(linkedHashMap, "peerFbgSelected", bool25);
        b(linkedHashMap, "roundId", l);
        b(linkedHashMap, "currentRoundId", l2);
        b(linkedHashMap, "currentMultiplier", str);
        b(linkedHashMap, "messageType", str2);
        b(linkedHashMap, "hasEnded", bool10);
        b(linkedHashMap, "betState", str6);
        b(linkedHashMap, "cashOutValue", str7);
        b(linkedHashMap, "maxBetAmount", d5);
        b(linkedHashMap, "minBetAmount", d3);
        b(linkedHashMap, "betChipValues", list);
        b(linkedHashMap, "canDecrease", bool26);
        b(linkedHashMap, "canIncrease", bool27);
        b(linkedHashMap, "toShowFbg", bool28);
        b(linkedHashMap, "disableFbg", bool29);
        b(linkedHashMap, "giftResponseReceived", bool30);
        b(linkedHashMap, "isClickableHost", bool31);
        b(linkedHashMap, "isSportyBetFlavor", bool34);
        b(linkedHashMap, "cancelBetRequestInProgress", bool33);
        b(linkedHashMap, "guestUser", bool19);
        b(linkedHashMap, "betAmountInput", str8);
        b(linkedHashMap, "betIndex", num);
        b(linkedHashMap, "isKeyboardOpen", bool20);
        return linkedHashMap;
    }

    public static void b(LinkedHashMap linkedHashMap, String str, Object obj) {
        if (obj != null) {
            linkedHashMap.put(str, obj);
        }
    }
}

package defpackage;

import com.sporty.android.chat.data.CodeChatSelectionDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class cw7 {
    public static final boolean a(CodeChatSelectionDto codeChatSelectionDto) {
        Integer status;
        Integer status2;
        Integer status3;
        Integer status4;
        Integer status5;
        codeChatSelectionDto.getClass();
        Integer status6 = codeChatSelectionDto.getStatus();
        return (status6 != null && status6.intValue() == 1) || ((status = codeChatSelectionDto.getStatus()) != null && status.intValue() == 2) || (((status2 = codeChatSelectionDto.getStatus()) != null && status2.intValue() == 3) || (((status3 = codeChatSelectionDto.getStatus()) != null && status3.intValue() == 4) || (((status4 = codeChatSelectionDto.getStatus()) != null && status4.intValue() == 5) || ((status5 = codeChatSelectionDto.getStatus()) != null && status5.intValue() == 6))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public static final dw7 b(CodeChatSelectionDto codeChatSelectionDto) {
        String strConcat;
        String str;
        String str2;
        Integer status;
        iv7 iv7Var;
        Integer eventStatus;
        Integer eventStatus2;
        Integer eventStatus3;
        Integer eventStatus4;
        Integer eventStatus5;
        String marketDesc;
        codeChatSelectionDto.getClass();
        String outcomeDesc = codeChatSelectionDto.getOutcomeDesc();
        if (outcomeDesc == null) {
            outcomeDesc = "--";
        } else {
            if (StringsKt.U(outcomeDesc)) {
                outcomeDesc = null;
            }
            if (outcomeDesc == null) {
                outcomeDesc = "--";
            }
        }
        String odds = codeChatSelectionDto.getOdds();
        if (odds == null) {
            strConcat = null;
        } else {
            if (StringsKt.U(odds)) {
                odds = null;
            }
            if (odds != null) {
                strConcat = "@".concat(odds);
            } else {
                strConcat = null;
            }
        }
        if (strConcat == null) {
            strConcat = "";
        }
        List listK = b.k(outcomeDesc, strConcat);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (!StringsKt.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        String strA0 = CollectionsKt.a0(arrayList, " ", null, null, null, 62);
        String str3 = StringsKt.U(strA0) ? "--" : strA0;
        String eventId = codeChatSelectionDto.getEventId();
        if (eventId == null) {
            eventId = "";
        }
        if (!b3.U(eventId) || (marketDesc = codeChatSelectionDto.getMarketDesc()) == null || StringsKt.U(marketDesc)) {
            String home = codeChatSelectionDto.getHome();
            if (home == null) {
                home = "";
            }
            String away = codeChatSelectionDto.getAway();
            if (away == null) {
                away = "";
            }
            List listK2 = b.k(home, away);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listK2) {
                if (!StringsKt.U((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            String strA1 = CollectionsKt.a0(arrayList2, " vs ", null, null, null, 62);
            str = StringsKt.U(strA1) ? "--" : strA1;
        } else {
            String marketDesc2 = codeChatSelectionDto.getMarketDesc();
            str = marketDesc2 == null ? "" : marketDesc2;
        }
        String eventId2 = codeChatSelectionDto.getEventId();
        if (eventId2 == null) {
            eventId2 = "";
        }
        String marketId = codeChatSelectionDto.getMarketId();
        if (marketId == null) {
            marketId = "";
        }
        String outcomeId = codeChatSelectionDto.getOutcomeId();
        if (outcomeId == null) {
            outcomeId = "";
        }
        List listK3 = b.k(eventId2, marketId, outcomeId);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listK3) {
            if (!StringsKt.U((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        String strA2 = CollectionsKt.a0(arrayList3, "_", null, null, null, 62);
        String id = codeChatSelectionDto.getId();
        if (id == null) {
            str2 = strA2;
        } else {
            String str4 = StringsKt.U(id) ? null : id;
            if (str4 == null) {
                str2 = strA2;
            } else {
                str2 = str4;
            }
        }
        String sportId = codeChatSelectionDto.getSportId();
        String str5 = sportId == null ? "" : sportId;
        String marketDesc3 = codeChatSelectionDto.getMarketDesc();
        String str6 = marketDesc3 == null ? "" : marketDesc3;
        String tournamentIcon = codeChatSelectionDto.getTournamentIcon();
        String str7 = tournamentIcon == null ? "" : tournamentIcon;
        String homeTeamIcon = codeChatSelectionDto.getHomeTeamIcon();
        String str8 = homeTeamIcon == null ? "" : homeTeamIcon;
        String awayTeamIcon = codeChatSelectionDto.getAwayTeamIcon();
        String str9 = awayTeamIcon == null ? "" : awayTeamIcon;
        Integer status2 = codeChatSelectionDto.getStatus();
        if (status2 != null && status2.intValue() == 0 && (((eventStatus4 = codeChatSelectionDto.getEventStatus()) != null && eventStatus4.intValue() == 0) || ((eventStatus5 = codeChatSelectionDto.getEventStatus()) != null && eventStatus5.intValue() == 6))) {
            iv7Var = iv7.a;
        } else {
            Integer status3 = codeChatSelectionDto.getStatus();
            if (status3 != null && status3.intValue() == 0 && (((eventStatus = codeChatSelectionDto.getEventStatus()) != null && eventStatus.intValue() == 1) || (((eventStatus2 = codeChatSelectionDto.getEventStatus()) != null && eventStatus2.intValue() == 2) || ((eventStatus3 = codeChatSelectionDto.getEventStatus()) != null && eventStatus3.intValue() == 7)))) {
                iv7Var = iv7.b;
            } else {
                Integer status4 = codeChatSelectionDto.getStatus();
                if (status4 != null && status4.intValue() == 1) {
                    Integer settleType = codeChatSelectionDto.getSettleType();
                    if (settleType != null && settleType.intValue() == 1) {
                        iv7Var = iv7.d;
                    } else if (settleType != null && settleType.intValue() == 2) {
                        iv7Var = iv7.e;
                    } else if (settleType != null && settleType.intValue() == 5) {
                        iv7Var = iv7.f;
                    } else if (settleType != null && settleType.intValue() == 3) {
                        iv7Var = iv7.i;
                    } else if (settleType != null && settleType.intValue() == 6) {
                        iv7Var = iv7.v;
                    } else {
                        iv7Var = (settleType != null && settleType.intValue() == 7) ? iv7.w : iv7.c;
                    }
                } else {
                    Integer status5 = codeChatSelectionDto.getStatus();
                    if (status5 != null && status5.intValue() == 2) {
                        iv7Var = iv7.y;
                    } else {
                        Integer status6 = codeChatSelectionDto.getStatus();
                        if ((status6 != null && status6.intValue() == 3) || ((status = codeChatSelectionDto.getStatus()) != null && status.intValue() == 4)) {
                            iv7Var = iv7.z;
                        } else {
                            Integer status7 = codeChatSelectionDto.getStatus();
                            if (status7 != null && status7.intValue() == 5) {
                                iv7Var = iv7.c;
                            } else {
                                Integer status8 = codeChatSelectionDto.getStatus();
                                if (status8 != null && status8.intValue() == 6) {
                                    iv7Var = iv7.y;
                                } else {
                                    Integer status9 = codeChatSelectionDto.getStatus();
                                    iv7Var = (status9 != null && status9.intValue() == 0) ? iv7.b : iv7.a;
                                }
                            }
                        }
                    }
                }
            }
        }
        return new dw7(str2, str5, str3, str6, str, str7, str8, str9, iv7Var);
    }
}

package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventInRound;

/* JADX INFO: loaded from: classes5.dex */
public final class jr {
    public static final ir a(EventInRound eventInRound) {
        String str;
        String str2;
        String str3;
        eventInRound.getClass();
        String str4 = eventInRound.eventId;
        if (str4 == null) {
            str4 = "";
            str = str4;
        } else {
            str = "";
        }
        String str5 = eventInRound.leagueId;
        if (str5 == null) {
            str5 = str;
        }
        String str6 = eventInRound.leagueName;
        if (str6 == null) {
            str6 = str;
        }
        jp jpVar = new jp(str5, str6);
        String str7 = str;
        String str8 = eventInRound.homeTeamName;
        if (str8 == null) {
            str8 = str7;
        }
        String str9 = eventInRound.homeTeamLogo;
        if (str9 == null) {
            str9 = str7;
        }
        mq mqVar = new mq(str8, str9);
        String str10 = eventInRound.homeTeamScore;
        if (str10 == null) {
            str10 = str7;
        }
        String str11 = eventInRound.awayTeamName;
        if (str11 == null) {
            str11 = str7;
        }
        String str12 = eventInRound.awayTeamLogo;
        if (str12 == null) {
            str12 = str7;
        }
        mq mqVar2 = new mq(str11, str12);
        String str13 = eventInRound.awayTeamScore;
        if (str13 == null) {
            str13 = str7;
        }
        String str14 = eventInRound.resultSequence;
        if (str14 == null) {
            String str15 = str13;
            str3 = str7;
            str2 = str15;
        } else {
            str2 = str13;
            str3 = str14;
        }
        return new ir(str4, jpVar, mqVar, str10, mqVar2, str2, str3);
    }
}

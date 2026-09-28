package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventInRound;

/* JADX INFO: loaded from: classes5.dex */
public final class k6k0 {
    public static final j6k0 a(EventInRound eventInRound) {
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
        uyj0 uyj0Var = new uyj0(str5, str6);
        String str7 = str;
        String str8 = eventInRound.homeTeamName;
        if (str8 == null) {
            str8 = str7;
        }
        String str9 = eventInRound.homeTeamLogo;
        if (str9 == null) {
            str9 = str7;
        }
        m5k0 m5k0Var = new m5k0(str8, str9);
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
        m5k0 m5k0Var2 = new m5k0(str11, str12);
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
        return new j6k0(str4, uyj0Var, m5k0Var, str10, m5k0Var2, str2, str3);
    }
}

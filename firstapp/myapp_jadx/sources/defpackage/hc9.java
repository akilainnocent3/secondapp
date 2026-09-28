package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerEvent;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;

/* JADX INFO: loaded from: classes7.dex */
public final class hc9 {
    public static final op8 a = new op8(1192288884, new fc9(), false);
    public static final op8 b = new op8(-1226904803, new gc9(), false);

    public static final MultiMakerEvent a(Event event) {
        String str;
        Category category;
        Tournament tournament;
        if (event == null) {
            return new MultiMakerEvent(0);
        }
        String str2 = event.eventId;
        String str3 = str2 == null ? "" : str2;
        String str4 = event.productStatus;
        String str5 = str4 == null ? "" : str4;
        long j = event.estimateStartTime;
        int i = event.status;
        String str6 = event.matchStatus;
        String str7 = str6 == null ? "" : str6;
        String str8 = event.homeTeamName;
        String str9 = str8 == null ? "" : str8;
        String str10 = event.awayTeamName;
        String str11 = str10 == null ? "" : str10;
        Sport sport = event.sport;
        String str12 = null;
        String str13 = sport != null ? sport.id : null;
        String str14 = str13 == null ? "" : str13;
        String str15 = event.categoryId;
        String str16 = str15 == null ? "" : str15;
        Tournament tournament2 = event.tournament;
        String str17 = tournament2 != null ? tournament2.id : null;
        if (str17 == null) {
            str17 = "";
        }
        if (str17.length() == 0) {
            Sport sport2 = event.sport;
            if (sport2 != null && (category = sport2.category) != null && (tournament = category.tournament) != null) {
                str12 = tournament.id;
            }
            str = str12 != null ? str12 : "";
        } else {
            str = str17;
        }
        return new MultiMakerEvent(str3, str5, str7, str9, str11, str14, str16, str, j, i);
    }
}

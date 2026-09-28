package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.EventDataDto;
import com.sportybet.plugin.realsports.data.radio.RadioProvider;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class b7f0 {
    public static final Set<String> a = ay0.V(new String[]{"live", "notstarted"});

    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    public static final fng a(EventDataDto eventDataDto) {
        List listSplit$default;
        List listSplit$default2;
        String lowerCase;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        eventDataDto.getClass();
        String fixtureHomeTeamLogoUri = eventDataDto.getFixtureHomeTeamLogoUri();
        if (fixtureHomeTeamLogoUri == null) {
            fixtureHomeTeamLogoUri = eventDataDto.getHomeLogoUri();
        }
        String str7 = fixtureHomeTeamLogoUri;
        String fixtureAwayTeamLogoUri = eventDataDto.getFixtureAwayTeamLogoUri();
        if (fixtureAwayTeamLogoUri == null) {
            fixtureAwayTeamLogoUri = eventDataDto.getAwayLogoUri();
        }
        String str8 = fixtureAwayTeamLogoUri;
        String eventScore = eventDataDto.getEventScore();
        if (eventScore == null || (listSplit$default = StringsKt__StringsKt.split$default(eventScore, new String[]{":"}, false, 0, 6, null)) == null || listSplit$default.size() != 2) {
            listSplit$default = null;
        }
        List<String> eventGameScore = eventDataDto.getEventGameScore();
        if (eventGameScore == null || (str6 = (String) CollectionsKt.firstOrNull(eventGameScore)) == null || (listSplit$default2 = StringsKt__StringsKt.split$default(str6, new String[]{":"}, false, 0, 6, null)) == null || listSplit$default2.size() != 2) {
            listSplit$default2 = null;
        }
        Set<String> set = a;
        String eventStatus = eventDataDto.getEventStatus();
        if (eventStatus != null) {
            lowerCase = eventStatus.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        boolean zM = CollectionsKt.M(set, lowerCase);
        String eventId = eventDataDto.getEventId();
        String fixtureHomeTeamName = eventDataDto.getFixtureHomeTeamName();
        if (fixtureHomeTeamName == null) {
            fixtureHomeTeamName = "";
        }
        String fixtureAwayTeamName = eventDataDto.getFixtureAwayTeamName();
        String str9 = fixtureAwayTeamName != null ? fixtureAwayTeamName : "";
        String fixtureTournamentName = eventDataDto.getFixtureTournamentName();
        String str10 = fixtureHomeTeamName;
        String fixtureHomeTeamId = eventDataDto.getFixtureHomeTeamId();
        String str11 = str9;
        String fixtureAwayTeamId = eventDataDto.getFixtureAwayTeamId();
        String eventScore2 = eventDataDto.getEventScore();
        long fixtureStartTime = eventDataDto.getFixtureStartTime();
        String string = (listSplit$default == null || (str5 = (String) CollectionsKt.V(0, listSplit$default)) == null) ? null : StringsKt.t0(str5).toString();
        String string2 = (listSplit$default == null || (str4 = (String) CollectionsKt.V(1, listSplit$default)) == null) ? null : StringsKt.t0(str4).toString();
        String string3 = (listSplit$default2 == null || (str3 = (String) CollectionsKt.V(0, listSplit$default2)) == null) ? null : StringsKt.t0(str3).toString();
        String string4 = (listSplit$default2 == null || (str2 = (String) CollectionsKt.V(1, listSplit$default2)) == null) ? null : StringsKt.t0(str2).toString();
        boolean zG = Intrinsics.g(eventDataDto.getEventStatus(), "Live");
        String str12 = string3;
        String fixtureSportId = eventDataDto.getFixtureSportId();
        String str13 = string2;
        if (zM && eventDataDto.getLiveStreamProvider() != null) {
            str = string4;
            boolean z = Intrinsics.g(eventDataDto.getLiveStreamProvider(), RadioProvider.UNAVAILABLE) ? false : true;
            return new fng(eventId, str10, str11, fixtureTournamentName, fixtureHomeTeamId, fixtureAwayTeamId, str7, str8, eventScore2, fixtureStartTime, str12, str, string, str13, zG, fixtureSportId, z, (zM || eventDataDto.getAudioLiveProvider() == null || Intrinsics.g(eventDataDto.getAudioLiveProvider(), RadioProvider.UNAVAILABLE)) ? false : true);
        }
        str = string4;
        return new fng(eventId, str10, str11, fixtureTournamentName, fixtureHomeTeamId, fixtureAwayTeamId, str7, str8, eventScore2, fixtureStartTime, str12, str, string, str13, zG, fixtureSportId, z, (zM || eventDataDto.getAudioLiveProvider() == null || Intrinsics.g(eventDataDto.getAudioLiveProvider(), RadioProvider.UNAVAILABLE)) ? false : true);
    }
}

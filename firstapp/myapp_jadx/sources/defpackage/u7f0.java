package defpackage;

import com.sportybet.feature.dedicatedteampage.shared.data.model.PaginatedResponseDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.EventDataDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.FeedDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.TeamDetailDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.TournamentDto;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007JF\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lu7f0;", "", "", "teamId", "Lzi50;", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/TeamDetailDto;", "e", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "flag", "", "size", "Lcom/sportybet/feature/dedicatedteampage/shared/data/model/PaginatedResponseDto;", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/FeedDto;", "b", "(Ljava/lang/String;Ljava/lang/String;ILv1b;)Ljava/lang/Object;", "", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/TournamentDto;", "a", "tournamentIds", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/EventDataDto;", "c", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lv1b;)Ljava/lang/Object;", "d", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface u7f0 {
    @sbj("factsCenter/teams/{teamId}/tournaments")
    Object a(@dxz("teamId") String str, v1b<? super zi50<? extends List<TournamentDto>>> v1bVar);

    @sbj("factsCenter/teams/{teamId}/news")
    Object b(@dxz("teamId") String str, @db30("flag") String str2, @db30("size") int i, v1b<? super zi50<PaginatedResponseDto<FeedDto>>> v1bVar);

    @sbj("factsCenter/teams/{teamId}/results")
    Object c(@dxz("teamId") String str, @db30("tournamentIds") String str2, @db30("size") int i, @db30("flag") String str3, v1b<? super zi50<PaginatedResponseDto<EventDataDto>>> v1bVar);

    @sbj("factsCenter/teams/{teamId}/fixtures")
    Object d(@dxz("teamId") String str, @db30("tournamentIds") String str2, @db30("size") int i, @db30("flag") String str3, v1b<? super zi50<PaginatedResponseDto<EventDataDto>>> v1bVar);

    @sbj("factsCenter/teams/{teamId}")
    Object e(@dxz("teamId") String str, v1b<? super zi50<TeamDetailDto>> v1bVar);
}

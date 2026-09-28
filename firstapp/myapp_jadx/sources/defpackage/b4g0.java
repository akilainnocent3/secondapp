package defpackage;

import com.sportybet.feature.worldcup.tournament.data.model.TournamentGroupsResponseDto;
import com.sportybet.feature.worldcup.tournament.data.model.TournamentKnockoutsResponseDto;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lb4g0;", "", "", "tournamentId", "Lzi50;", "Lcom/sportybet/feature/worldcup/tournament/data/model/TournamentGroupsResponseDto;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/worldcup/tournament/data/model/TournamentKnockoutsResponseDto;", "b", "world-cup"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface b4g0 {
    @sbj("factsCenter/tournament/{tournamentId}/groups")
    Object a(@dxz("tournamentId") String str, v1b<? super zi50<TournamentGroupsResponseDto>> v1bVar);

    @sbj("factsCenter/tournament/{tournamentId}/knockouts")
    Object b(@dxz("tournamentId") String str, v1b<? super zi50<TournamentKnockoutsResponseDto>> v1bVar);
}

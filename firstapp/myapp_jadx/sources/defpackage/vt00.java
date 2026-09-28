package defpackage;

import com.sportybet.plugin.sportypicks.data.model.PickMarketsResponseDto;
import com.sportybet.plugin.sportypicks.data.model.PickTournamentDto;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lvt00;", "", "", "", "tournamentIds", "", "pageSize", "pageNum", "Lzi50;", "Lcom/sportybet/plugin/sportypicks/data/model/PickMarketsResponseDto;", "a", "(Ljava/util/List;IILv1b;)Ljava/lang/Object;", "Lcom/sportybet/plugin/sportypicks/data/model/PickTournamentDto;", "b", "(Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface vt00 {
    @sbj("factsCenter/pick/markets")
    Object a(@db30("tournamentIds") List<String> list, @db30("pageSize") int i, @db30("pageNum") int i2, v1b<? super zi50<PickMarketsResponseDto>> v1bVar);

    @sbj("factsCenter/pick/markets/top")
    Object b(v1b<? super zi50<? extends List<PickTournamentDto>>> v1bVar);
}

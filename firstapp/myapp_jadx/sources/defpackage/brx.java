package defpackage;

import com.sportybet.feature.dedicatedteampage.article.data.model.VideoDetailDto;
import com.sportybet.feature.dedicatedteampage.shared.data.model.PaginatedResponseDto;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lbrx;", "", "", "refId", "Lzi50;", "Lcom/sportybet/feature/dedicatedteampage/article/data/model/VideoDetailDto;", "b", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "flag", "", "size", "Lcom/sportybet/feature/dedicatedteampage/shared/data/model/PaginatedResponseDto;", "a", "(Ljava/lang/String;Ljava/lang/String;ILv1b;)Ljava/lang/Object;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface brx {
    @sbj("factsCenter/teams/news/video/recommendations")
    Object a(@db30("refId") String str, @db30("flag") String str2, @db30("size") int i, v1b<? super zi50<PaginatedResponseDto<VideoDetailDto>>> v1bVar);

    @sbj("factsCenter/teams/news/video/details")
    Object b(@db30("refId") String str, v1b<? super zi50<VideoDetailDto>> v1bVar);
}

package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.MatchVote;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.SimpleCommentInfo;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.UploadImageResponse;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteResponse;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u0010Ja\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001d0\u00050\u00042\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH'¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J:\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001d0\u00052\b\b\u0001\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b'\u0010(J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b,\u0010-¨\u0006.À\u0006\u0003"}, d2 = {"Lt8d0;", "", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lct90;", "Lbi50;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/VoteResponse;", "h", "(Ljava/lang/String;)Lct90;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/MatchVote;", "matchVote", "f", "(Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/MatchVote;)Lct90;", "", "commentId", "e", "(I)Lct90;", "Ljava/lang/Void;", "b", "countryCode", "flag", AnalyticsParam.MINI_GAMES_PAGE, "refId", "size", "sortingCriteria", "type", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/PostCommentResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lct90;", "", "eventIds", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/SimpleCommentInfo;", "g", "(Ljava/util/List;)Lct90;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/PostCommentData;", "commentVO", "c", "(Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/PostCommentData;)Lct90;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/CommentsData;", "i", "(IIILv1b;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "filePart", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/UploadImageResponse;", "a", "(Lokhttp3/MultipartBody$Part;)Lct90;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface t8d0 {
    @flz("/chat/images")
    @jmw
    ct90<bi50<UploadImageResponse>> a(@usz MultipartBody.Part filePart);

    @amc("/chat/comment/remove")
    @gil({"Content-Type: application/json"})
    ct90<bi50<Void>> b(@db30("commentId") int commentId);

    @flz("/chat/comment/add")
    @gil({"Content-Type: application/json"})
    ct90<bi50<Void>> c(@jh4 PostCommentData commentVO);

    @sbj("/chat/comment/list")
    @gil({"Content-Type: application/json"})
    ct90<bi50<PostCommentResponse>> d(@db30("countryCode") String countryCode, @db30("flag") String flag, @db30(AnalyticsParam.MINI_GAMES_PAGE) int page, @db30("refId") String refId, @db30("size") int size, @db30("sortingCriteria") String sortingCriteria, @db30("type") String type);

    @flz("/chat/comment/like")
    @gil({"Content-Type: application/json"})
    ct90<bi50<String>> e(@db30("commentId") int commentId);

    @flz("/news/facts/poll/vote")
    @gil({"Content-Type: application/json"})
    ct90<bi50<VoteResponse>> f(@jh4 MatchVote matchVote);

    @flz("/chat/comment/simpleCommentInfos")
    @gil({"Content-Type: application/json"})
    ct90<bi50<List<SimpleCommentInfo>>> g(@jh4 List<String> eventIds);

    @sbj("/news/facts/poll/{eventId}")
    @gil({"Content-Type: application/json"})
    ct90<bi50<VoteResponse>> h(@dxz(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String eventId);

    @sbj("/chat/comment/moreReplies")
    @gil({"Content-Type: application/json"})
    Object i(@db30("size") int i, @db30(AnalyticsParam.MINI_GAMES_PAGE) int i2, @db30("commentId") int i3, v1b<? super bi50<List<CommentsData>>> v1bVar);
}

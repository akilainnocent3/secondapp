package com.sportygames.speedybingo.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBBetHistoryDTO;", "", "hasMore", "", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "", "Lcom/sportygames/speedybingo/data/dto/SBBetHistoryItemDTO;", "<init>", "(ZLjava/util/List;)V", "getHasMore", "()Z", "getList", "()Ljava/util/List;", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SBBetHistoryDTO {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final List<SBBetHistoryItemDTO> list;

    public SBBetHistoryDTO(boolean z, List<SBBetHistoryItemDTO> list) {
        list.getClass();
        this.hasMore = z;
        this.list = list;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<SBBetHistoryItemDTO> getList() {
        return this.list;
    }
}

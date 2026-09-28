package com.sportygames.wheelanddeal.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDBetHistoryModel;", "", "hasMore", "", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "", "Lcom/sportygames/wheelanddeal/model/WDBetResponseModel;", "<init>", "(ZLjava/util/List;)V", "getHasMore", "()Z", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDBetHistoryModel {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final List<WDBetResponseModel> list;

    public WDBetHistoryModel(boolean z, List<WDBetResponseModel> list) {
        list.getClass();
        this.hasMore = z;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WDBetHistoryModel copy$default(WDBetHistoryModel wDBetHistoryModel, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wDBetHistoryModel.hasMore;
        }
        if ((i & 2) != 0) {
            list = wDBetHistoryModel.list;
        }
        return wDBetHistoryModel.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<WDBetResponseModel> component2() {
        return this.list;
    }

    public final WDBetHistoryModel copy(boolean hasMore, List<WDBetResponseModel> list) {
        list.getClass();
        return new WDBetHistoryModel(hasMore, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDBetHistoryModel)) {
            return false;
        }
        WDBetHistoryModel wDBetHistoryModel = (WDBetHistoryModel) other;
        return this.hasMore == wDBetHistoryModel.hasMore && Intrinsics.g(this.list, wDBetHistoryModel.list);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<WDBetResponseModel> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode() + (Boolean.hashCode(this.hasMore) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDBetHistoryModel(hasMore=");
        sb.append(this.hasMore);
        sb.append(", list=");
        return o8i.a(sb, this.list, ')');
    }
}

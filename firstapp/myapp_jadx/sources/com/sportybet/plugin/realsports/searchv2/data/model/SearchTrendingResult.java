package com.sportybet.plugin.realsports.searchv2.data.model;

import com.appsflyer.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTrendingResult;", "", "rank", "", "keyword", "", "<init>", "(ILjava/lang/String;)V", "getRank", "()I", "getKeyword", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchTrendingResult {
    public static final int $stable = 0;
    private final String keyword;
    private final int rank;

    public /* synthetic */ SearchTrendingResult(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ SearchTrendingResult copy$default(SearchTrendingResult searchTrendingResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = searchTrendingResult.rank;
        }
        if ((i2 & 2) != 0) {
            str = searchTrendingResult.keyword;
        }
        return searchTrendingResult.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    public final SearchTrendingResult copy(int rank, String keyword) {
        keyword.getClass();
        return new SearchTrendingResult(rank, keyword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTrendingResult)) {
            return false;
        }
        SearchTrendingResult searchTrendingResult = (SearchTrendingResult) other;
        return this.rank == searchTrendingResult.rank && Intrinsics.g(this.keyword, searchTrendingResult.keyword);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getRank() {
        return this.rank;
    }

    public int hashCode() {
        return this.keyword.hashCode() + (Integer.hashCode(this.rank) * 31);
    }

    public String toString() {
        return h.a(this.rank, "SearchTrendingResult(rank=", ", keyword=", this.keyword, ")");
    }

    public SearchTrendingResult(int i, String str) {
        str.getClass();
        this.rank = i;
        this.keyword = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchTrendingResult() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}

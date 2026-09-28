package com.sportybet.plugin.realsports.searchv2.data.model;

import defpackage.m2g;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTrending;", "", "source", "", "results", "", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTrendingResult;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSource", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchTrending {
    public static final int $stable = 8;
    private final List<SearchTrendingResult> results;
    private final String source;

    public SearchTrending(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchTrending copy$default(SearchTrending searchTrending, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTrending.source;
        }
        if ((i & 2) != 0) {
            list = searchTrending.results;
        }
        return searchTrending.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final List<SearchTrendingResult> component2() {
        return this.results;
    }

    public final SearchTrending copy(String source, List<SearchTrendingResult> results) {
        source.getClass();
        results.getClass();
        return new SearchTrending(source, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTrending)) {
            return false;
        }
        SearchTrending searchTrending = (SearchTrending) other;
        return Intrinsics.g(this.source, searchTrending.source) && Intrinsics.g(this.results, searchTrending.results);
    }

    public final List<SearchTrendingResult> getResults() {
        return this.results;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.results.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        return nf.b("SearchTrending(source=", this.source, ", results=", ")", this.results);
    }

    public SearchTrending(String str, List<SearchTrendingResult> list) {
        str.getClass();
        list.getClass();
        this.source = str;
        this.results = list;
    }

    public SearchTrending() {
        this(null, null, 3, null);
    }
}

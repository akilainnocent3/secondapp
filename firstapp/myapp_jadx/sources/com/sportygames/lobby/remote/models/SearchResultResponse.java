package com.sportygames.lobby.remote.models;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/sportygames/lobby/remote/models/SearchResultResponse;", "", "data", "", "Lcom/sportygames/lobby/remote/models/GameDetails;", "suggestions", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getSuggestions", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchResultResponse {
    public static final int $stable = 8;
    private final List<GameDetails> data;
    private final List<GameDetails> suggestions;

    public SearchResultResponse(List<GameDetails> list, List<GameDetails> list2) {
        this.data = list;
        this.suggestions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultResponse copy$default(SearchResultResponse searchResultResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchResultResponse.data;
        }
        if ((i & 2) != 0) {
            list2 = searchResultResponse.suggestions;
        }
        return searchResultResponse.copy(list, list2);
    }

    public final List<GameDetails> component1() {
        return this.data;
    }

    public final List<GameDetails> component2() {
        return this.suggestions;
    }

    public final SearchResultResponse copy(List<GameDetails> data, List<GameDetails> suggestions) {
        return new SearchResultResponse(data, suggestions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultResponse)) {
            return false;
        }
        SearchResultResponse searchResultResponse = (SearchResultResponse) other;
        return Intrinsics.g(this.data, searchResultResponse.data) && Intrinsics.g(this.suggestions, searchResultResponse.suggestions);
    }

    public final List<GameDetails> getData() {
        return this.data;
    }

    public final List<GameDetails> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        List<GameDetails> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GameDetails> list2 = this.suggestions;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return w9d.a("SearchResultResponse(data=", ", suggestions=", ")", this.data, this.suggestions);
    }
}

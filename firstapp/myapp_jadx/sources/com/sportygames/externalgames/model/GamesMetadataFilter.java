package com.sportygames.externalgames.model;

import defpackage.hfb0;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/sportygames/externalgames/model/GamesMetadataFilter;", "", "gameIds", "", "", "bizTypes", "categoryIds", "providerIds", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGameIds", "()Ljava/util/List;", "getBizTypes", "getCategoryIds", "getProviderIds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GamesMetadataFilter {
    public static final int $stable = 8;
    private final List<Integer> bizTypes;
    private final List<Integer> categoryIds;
    private final List<Integer> gameIds;
    private final List<Integer> providerIds;

    public /* synthetic */ GamesMetadataFilter(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GamesMetadataFilter copy$default(GamesMetadataFilter gamesMetadataFilter, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gamesMetadataFilter.gameIds;
        }
        if ((i & 2) != 0) {
            list2 = gamesMetadataFilter.bizTypes;
        }
        if ((i & 4) != 0) {
            list3 = gamesMetadataFilter.categoryIds;
        }
        if ((i & 8) != 0) {
            list4 = gamesMetadataFilter.providerIds;
        }
        return gamesMetadataFilter.copy(list, list2, list3, list4);
    }

    public final List<Integer> component1() {
        return this.gameIds;
    }

    public final List<Integer> component2() {
        return this.bizTypes;
    }

    public final List<Integer> component3() {
        return this.categoryIds;
    }

    public final List<Integer> component4() {
        return this.providerIds;
    }

    public final GamesMetadataFilter copy(List<Integer> gameIds, List<Integer> bizTypes, List<Integer> categoryIds, List<Integer> providerIds) {
        return new GamesMetadataFilter(gameIds, bizTypes, categoryIds, providerIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamesMetadataFilter)) {
            return false;
        }
        GamesMetadataFilter gamesMetadataFilter = (GamesMetadataFilter) other;
        return Intrinsics.g(this.gameIds, gamesMetadataFilter.gameIds) && Intrinsics.g(this.bizTypes, gamesMetadataFilter.bizTypes) && Intrinsics.g(this.categoryIds, gamesMetadataFilter.categoryIds) && Intrinsics.g(this.providerIds, gamesMetadataFilter.providerIds);
    }

    public final List<Integer> getBizTypes() {
        return this.bizTypes;
    }

    public final List<Integer> getCategoryIds() {
        return this.categoryIds;
    }

    public final List<Integer> getGameIds() {
        return this.gameIds;
    }

    public final List<Integer> getProviderIds() {
        return this.providerIds;
    }

    public int hashCode() {
        List<Integer> list = this.gameIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.bizTypes;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.categoryIds;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.providerIds;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        List<Integer> list = this.gameIds;
        List<Integer> list2 = this.bizTypes;
        return v9d.a(", providerIds=", ")", hfb0.a("GamesMetadataFilter(gameIds=", ", bizTypes=", ", categoryIds=", list, list2), this.categoryIds, this.providerIds);
    }

    public GamesMetadataFilter(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
        this.gameIds = list;
        this.bizTypes = list2;
        this.categoryIds = list3;
        this.providerIds = list4;
    }

    public GamesMetadataFilter() {
        this(null, null, null, null, 15, null);
    }
}

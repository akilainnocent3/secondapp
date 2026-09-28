package com.sportybet.android.multimaker.data.dto;

import defpackage.m2g;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/multimaker/data/dto/MultiMakerPreferenceDto;", "", "leagueIds", "", "", "marketIds", "oddsFilter", "Lcom/sportybet/android/multimaker/data/dto/MultiMakerOddsFilterDto;", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Lcom/sportybet/android/multimaker/data/dto/MultiMakerOddsFilterDto;)V", "getLeagueIds", "()Ljava/util/Collection;", "getMarketIds", "getOddsFilter", "()Lcom/sportybet/android/multimaker/data/dto/MultiMakerOddsFilterDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerPreferenceDto {
    public static final int $stable = MultiMakerOddsFilterDto.$stable;
    private final Collection<String> leagueIds;
    private final Collection<String> marketIds;
    private final MultiMakerOddsFilterDto oddsFilter;

    public MultiMakerPreferenceDto(Collection collection, Collection collection2, MultiMakerOddsFilterDto multiMakerOddsFilterDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : collection, (i & 2) != 0 ? m2g.a : collection2, (i & 4) != 0 ? new MultiMakerOddsFilterDto(null, null, null, 7, null) : multiMakerOddsFilterDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiMakerPreferenceDto copy$default(MultiMakerPreferenceDto multiMakerPreferenceDto, Collection collection, Collection collection2, MultiMakerOddsFilterDto multiMakerOddsFilterDto, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = multiMakerPreferenceDto.leagueIds;
        }
        if ((i & 2) != 0) {
            collection2 = multiMakerPreferenceDto.marketIds;
        }
        if ((i & 4) != 0) {
            multiMakerOddsFilterDto = multiMakerPreferenceDto.oddsFilter;
        }
        return multiMakerPreferenceDto.copy(collection, collection2, multiMakerOddsFilterDto);
    }

    public final Collection<String> component1() {
        return this.leagueIds;
    }

    public final Collection<String> component2() {
        return this.marketIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MultiMakerOddsFilterDto getOddsFilter() {
        return this.oddsFilter;
    }

    public final MultiMakerPreferenceDto copy(Collection<String> leagueIds, Collection<String> marketIds, MultiMakerOddsFilterDto oddsFilter) {
        leagueIds.getClass();
        marketIds.getClass();
        oddsFilter.getClass();
        return new MultiMakerPreferenceDto(leagueIds, marketIds, oddsFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerPreferenceDto)) {
            return false;
        }
        MultiMakerPreferenceDto multiMakerPreferenceDto = (MultiMakerPreferenceDto) other;
        return Intrinsics.g(this.leagueIds, multiMakerPreferenceDto.leagueIds) && Intrinsics.g(this.marketIds, multiMakerPreferenceDto.marketIds) && Intrinsics.g(this.oddsFilter, multiMakerPreferenceDto.oddsFilter);
    }

    public final Collection<String> getLeagueIds() {
        return this.leagueIds;
    }

    public final Collection<String> getMarketIds() {
        return this.marketIds;
    }

    public final MultiMakerOddsFilterDto getOddsFilter() {
        return this.oddsFilter;
    }

    public int hashCode() {
        return this.oddsFilter.hashCode() + ((this.marketIds.hashCode() + (this.leagueIds.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "MultiMakerPreferenceDto(leagueIds=" + this.leagueIds + ", marketIds=" + this.marketIds + ", oddsFilter=" + this.oddsFilter + ")";
    }

    public MultiMakerPreferenceDto(Collection<String> collection, Collection<String> collection2, MultiMakerOddsFilterDto multiMakerOddsFilterDto) {
        collection.getClass();
        collection2.getClass();
        multiMakerOddsFilterDto.getClass();
        this.leagueIds = collection;
        this.marketIds = collection2;
        this.oddsFilter = multiMakerOddsFilterDto;
    }

    public MultiMakerPreferenceDto() {
        this(null, null, null, 7, null);
    }
}

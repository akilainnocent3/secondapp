package com.sportybet.plugin.sportypicks.data.model;

import com.google.gson.annotations.SerializedName;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/plugin/sportypicks/data/model/PickMarketsResponseDto;", "", "tournaments", "", "Lcom/sportybet/plugin/realsports/data/Tournament;", "moreEvents", "", "<init>", "(Ljava/util/List;Z)V", "getTournaments", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMoreEvents", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PickMarketsResponseDto {
    public static final int $stable = 8;

    @SerializedName("moreEvents")
    private final boolean moreEvents;

    @SerializedName("tournaments")
    private final List<Tournament> tournaments;

    public /* synthetic */ PickMarketsResponseDto(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickMarketsResponseDto copy$default(PickMarketsResponseDto pickMarketsResponseDto, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pickMarketsResponseDto.tournaments;
        }
        if ((i & 2) != 0) {
            z = pickMarketsResponseDto.moreEvents;
        }
        return pickMarketsResponseDto.copy(list, z);
    }

    public final List<Tournament> component1() {
        return this.tournaments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMoreEvents() {
        return this.moreEvents;
    }

    public final PickMarketsResponseDto copy(List<? extends Tournament> tournaments, boolean moreEvents) {
        return new PickMarketsResponseDto(tournaments, moreEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickMarketsResponseDto)) {
            return false;
        }
        PickMarketsResponseDto pickMarketsResponseDto = (PickMarketsResponseDto) other;
        return Intrinsics.g(this.tournaments, pickMarketsResponseDto.tournaments) && this.moreEvents == pickMarketsResponseDto.moreEvents;
    }

    public final boolean getMoreEvents() {
        return this.moreEvents;
    }

    public final List<Tournament> getTournaments() {
        return this.tournaments;
    }

    public int hashCode() {
        List<Tournament> list = this.tournaments;
        return Boolean.hashCode(this.moreEvents) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public String toString() {
        return "PickMarketsResponseDto(tournaments=" + this.tournaments + ", moreEvents=" + this.moreEvents + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickMarketsResponseDto(List<? extends Tournament> list, boolean z) {
        this.tournaments = list;
        this.moreEvents = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickMarketsResponseDto() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}

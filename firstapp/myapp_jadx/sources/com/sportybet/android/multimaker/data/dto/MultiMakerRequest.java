package com.sportybet.android.multimaker.data.dto;

import defpackage.m2g;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010\"\u001a\u00020\rHÆ\u0003Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bÊ\u0001\u0002\b+Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006*"}, d2 = {"Lcom/sportybet/android/multimaker/data/dto/MultiMakerRequest;", "", "reqNum", "", "lockedSelections", "", "", "sportIds", "productIds", "startTime", "", "endTime", "preference", "Lcom/sportybet/android/multimaker/data/dto/MultiMakerPreferenceDto;", "<init>", "(ILjava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/Long;Ljava/lang/Long;Lcom/sportybet/android/multimaker/data/dto/MultiMakerPreferenceDto;)V", "getReqNum", "()I", "getLockedSelections", "()Ljava/util/Collection;", "getSportIds", "getProductIds", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getPreference", "()Lcom/sportybet/android/multimaker/data/dto/MultiMakerPreferenceDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/lang/Long;Ljava/lang/Long;Lcom/sportybet/android/multimaker/data/dto/MultiMakerPreferenceDto;)Lcom/sportybet/android/multimaker/data/dto/MultiMakerRequest;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerRequest {
    public static final int $stable = MultiMakerPreferenceDto.$stable;
    private final Long endTime;
    private final Collection<String> lockedSelections;
    private final MultiMakerPreferenceDto preference;
    private final Collection<Integer> productIds;
    private final int reqNum;
    private final Collection<String> sportIds;
    private final Long startTime;

    public MultiMakerRequest(int i, Collection collection, Collection collection2, Collection collection3, Long l, Long l2, MultiMakerPreferenceDto multiMakerPreferenceDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? m2g.a : collection, (i2 & 4) != 0 ? m2g.a : collection2, (i2 & 8) != 0 ? m2g.a : collection3, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? new MultiMakerPreferenceDto(null, null, null, 7, null) : multiMakerPreferenceDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiMakerRequest copy$default(MultiMakerRequest multiMakerRequest, int i, Collection collection, Collection collection2, Collection collection3, Long l, Long l2, MultiMakerPreferenceDto multiMakerPreferenceDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = multiMakerRequest.reqNum;
        }
        if ((i2 & 2) != 0) {
            collection = multiMakerRequest.lockedSelections;
        }
        if ((i2 & 4) != 0) {
            collection2 = multiMakerRequest.sportIds;
        }
        if ((i2 & 8) != 0) {
            collection3 = multiMakerRequest.productIds;
        }
        if ((i2 & 16) != 0) {
            l = multiMakerRequest.startTime;
        }
        if ((i2 & 32) != 0) {
            l2 = multiMakerRequest.endTime;
        }
        if ((i2 & 64) != 0) {
            multiMakerPreferenceDto = multiMakerRequest.preference;
        }
        Long l3 = l2;
        MultiMakerPreferenceDto multiMakerPreferenceDto2 = multiMakerPreferenceDto;
        Long l4 = l;
        Collection collection4 = collection2;
        return multiMakerRequest.copy(i, collection, collection4, collection3, l4, l3, multiMakerPreferenceDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getReqNum() {
        return this.reqNum;
    }

    public final Collection<String> component2() {
        return this.lockedSelections;
    }

    public final Collection<String> component3() {
        return this.sportIds;
    }

    public final Collection<Integer> component4() {
        return this.productIds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MultiMakerPreferenceDto getPreference() {
        return this.preference;
    }

    public final MultiMakerRequest copy(int reqNum, Collection<String> lockedSelections, Collection<String> sportIds, Collection<Integer> productIds, Long startTime, Long endTime, MultiMakerPreferenceDto preference) {
        lockedSelections.getClass();
        sportIds.getClass();
        productIds.getClass();
        preference.getClass();
        return new MultiMakerRequest(reqNum, lockedSelections, sportIds, productIds, startTime, endTime, preference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerRequest)) {
            return false;
        }
        MultiMakerRequest multiMakerRequest = (MultiMakerRequest) other;
        return this.reqNum == multiMakerRequest.reqNum && Intrinsics.g(this.lockedSelections, multiMakerRequest.lockedSelections) && Intrinsics.g(this.sportIds, multiMakerRequest.sportIds) && Intrinsics.g(this.productIds, multiMakerRequest.productIds) && Intrinsics.g(this.startTime, multiMakerRequest.startTime) && Intrinsics.g(this.endTime, multiMakerRequest.endTime) && Intrinsics.g(this.preference, multiMakerRequest.preference);
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final Collection<String> getLockedSelections() {
        return this.lockedSelections;
    }

    public final MultiMakerPreferenceDto getPreference() {
        return this.preference;
    }

    public final Collection<Integer> getProductIds() {
        return this.productIds;
    }

    public final int getReqNum() {
        return this.reqNum;
    }

    public final Collection<String> getSportIds() {
        return this.sportIds;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = (this.productIds.hashCode() + ((this.sportIds.hashCode() + ((this.lockedSelections.hashCode() + (Integer.hashCode(this.reqNum) * 31)) * 31)) * 31)) * 31;
        Long l = this.startTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        return this.preference.hashCode() + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "MultiMakerRequest(reqNum=" + this.reqNum + ", lockedSelections=" + this.lockedSelections + ", sportIds=" + this.sportIds + ", productIds=" + this.productIds + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", preference=" + this.preference + ")";
    }

    public MultiMakerRequest(int i, Collection<String> collection, Collection<String> collection2, Collection<Integer> collection3, Long l, Long l2, MultiMakerPreferenceDto multiMakerPreferenceDto) {
        collection.getClass();
        collection2.getClass();
        collection3.getClass();
        multiMakerPreferenceDto.getClass();
        this.reqNum = i;
        this.lockedSelections = collection;
        this.sportIds = collection2;
        this.productIds = collection3;
        this.startTime = l;
        this.endTime = l2;
        this.preference = multiMakerPreferenceDto;
    }

    public MultiMakerRequest() {
        this(0, null, null, null, null, null, null, 127, null);
    }
}

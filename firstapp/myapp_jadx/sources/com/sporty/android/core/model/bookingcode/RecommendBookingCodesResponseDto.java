package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ*\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR)\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodesResponseDto;", "", "recommendBookingCodes", "", "Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeDto;", "index", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getRecommendBookingCodes", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodesResponseDto;", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RecommendBookingCodesResponseDto {

    @SerializedName("index")
    private final Integer index;

    @SerializedName("recommendBookingCodes")
    private final List<RecommendBookingCodeDto> recommendBookingCodes;

    public RecommendBookingCodesResponseDto(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list, (i & 2) != 0 ? null : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendBookingCodesResponseDto copy$default(RecommendBookingCodesResponseDto recommendBookingCodesResponseDto, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendBookingCodesResponseDto.recommendBookingCodes;
        }
        if ((i & 2) != 0) {
            num = recommendBookingCodesResponseDto.index;
        }
        return recommendBookingCodesResponseDto.copy(list, num);
    }

    public final List<RecommendBookingCodeDto> component1() {
        return this.recommendBookingCodes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    public final RecommendBookingCodesResponseDto copy(List<RecommendBookingCodeDto> recommendBookingCodes, Integer index) {
        recommendBookingCodes.getClass();
        return new RecommendBookingCodesResponseDto(recommendBookingCodes, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendBookingCodesResponseDto)) {
            return false;
        }
        RecommendBookingCodesResponseDto recommendBookingCodesResponseDto = (RecommendBookingCodesResponseDto) other;
        return Intrinsics.g(this.recommendBookingCodes, recommendBookingCodesResponseDto.recommendBookingCodes) && Intrinsics.g(this.index, recommendBookingCodesResponseDto.index);
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final List<RecommendBookingCodeDto> getRecommendBookingCodes() {
        return this.recommendBookingCodes;
    }

    public int hashCode() {
        int iHashCode = this.recommendBookingCodes.hashCode() * 31;
        Integer num = this.index;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "RecommendBookingCodesResponseDto(recommendBookingCodes=" + this.recommendBookingCodes + ", index=" + this.index + ")";
    }

    public RecommendBookingCodesResponseDto(List<RecommendBookingCodeDto> list, Integer num) {
        list.getClass();
        this.recommendBookingCodes = list;
        this.index = num;
    }

    public RecommendBookingCodesResponseDto() {
        this(null, null, 3, null);
    }
}

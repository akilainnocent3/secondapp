package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import defpackage.m2g;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeDto;", "", "bookingCode", "", "outcomes", "", "Lcom/sporty/android/core/model/bookingcode/EventDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBookingCode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "shareCode", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RecommendBookingCodeDto {

    @SerializedName("shareCode")
    private final String bookingCode;

    @SerializedName("outcomes")
    private final List<EventDto> outcomes;

    public RecommendBookingCodeDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendBookingCodeDto copy$default(RecommendBookingCodeDto recommendBookingCodeDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendBookingCodeDto.bookingCode;
        }
        if ((i & 2) != 0) {
            list = recommendBookingCodeDto.outcomes;
        }
        return recommendBookingCodeDto.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final List<EventDto> component2() {
        return this.outcomes;
    }

    public final RecommendBookingCodeDto copy(String bookingCode, List<EventDto> outcomes) {
        outcomes.getClass();
        return new RecommendBookingCodeDto(bookingCode, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendBookingCodeDto)) {
            return false;
        }
        RecommendBookingCodeDto recommendBookingCodeDto = (RecommendBookingCodeDto) other;
        return Intrinsics.g(this.bookingCode, recommendBookingCodeDto.bookingCode) && Intrinsics.g(this.outcomes, recommendBookingCodeDto.outcomes);
    }

    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final List<EventDto> getOutcomes() {
        return this.outcomes;
    }

    public int hashCode() {
        String str = this.bookingCode;
        return this.outcomes.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return nf.b("RecommendBookingCodeDto(bookingCode=", this.bookingCode, ", outcomes=", ")", this.outcomes);
    }

    public RecommendBookingCodeDto(String str, List<EventDto> list) {
        list.getClass();
        this.bookingCode = str;
        this.outcomes = list;
    }

    public RecommendBookingCodeDto() {
        this(null, null, 3, null);
    }
}

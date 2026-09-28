package com.sporty.android.core.model.realsports.liabilitycheck;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckResponseDto;", "", "bookingCodeBlocked", "", "<init>", "(Ljava/lang/Boolean;)V", "getBookingCodeBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckResponseDto;", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuickLiabilityCheckResponseDto {
    private final Boolean bookingCodeBlocked;

    public QuickLiabilityCheckResponseDto(Boolean bool) {
        this.bookingCodeBlocked = bool;
    }

    public static /* synthetic */ QuickLiabilityCheckResponseDto copy$default(QuickLiabilityCheckResponseDto quickLiabilityCheckResponseDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = quickLiabilityCheckResponseDto.bookingCodeBlocked;
        }
        return quickLiabilityCheckResponseDto.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getBookingCodeBlocked() {
        return this.bookingCodeBlocked;
    }

    public final QuickLiabilityCheckResponseDto copy(Boolean bookingCodeBlocked) {
        return new QuickLiabilityCheckResponseDto(bookingCodeBlocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuickLiabilityCheckResponseDto) && Intrinsics.g(this.bookingCodeBlocked, ((QuickLiabilityCheckResponseDto) other).bookingCodeBlocked);
    }

    public final Boolean getBookingCodeBlocked() {
        return this.bookingCodeBlocked;
    }

    public int hashCode() {
        Boolean bool = this.bookingCodeBlocked;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "QuickLiabilityCheckResponseDto(bookingCodeBlocked=" + this.bookingCodeBlocked + ")";
    }
}

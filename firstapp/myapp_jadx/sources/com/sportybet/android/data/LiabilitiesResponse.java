package com.sportybet.android.data;

import defpackage.mtg0;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/data/LiabilitiesResponse;", "", "bookingCode", "", "disabled", "", "percentage", "", "<init>", "(Ljava/lang/String;ZD)V", "getBookingCode", "()Ljava/lang/String;", "getDisabled", "()Z", "getPercentage", "()D", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "common", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiabilitiesResponse {
    public static final int $stable = 0;
    private final String bookingCode;
    private final boolean disabled;
    private final double percentage;

    public /* synthetic */ LiabilitiesResponse(String str, boolean z, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0d : d);
    }

    public static /* synthetic */ LiabilitiesResponse copy$default(LiabilitiesResponse liabilitiesResponse, String str, boolean z, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liabilitiesResponse.bookingCode;
        }
        if ((i & 2) != 0) {
            z = liabilitiesResponse.disabled;
        }
        if ((i & 4) != 0) {
            d = liabilitiesResponse.percentage;
        }
        return liabilitiesResponse.copy(str, z, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBookingCode() {
        return this.bookingCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    public final LiabilitiesResponse copy(String bookingCode, boolean disabled, double percentage) {
        bookingCode.getClass();
        return new LiabilitiesResponse(bookingCode, disabled, percentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiabilitiesResponse)) {
            return false;
        }
        LiabilitiesResponse liabilitiesResponse = (LiabilitiesResponse) other;
        return Intrinsics.g(this.bookingCode, liabilitiesResponse.bookingCode) && this.disabled == liabilitiesResponse.disabled && Double.compare(this.percentage, liabilitiesResponse.percentage) == 0;
    }

    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        return Double.hashCode(this.percentage) + mtg0.a(this.bookingCode.hashCode() * 31, 31, this.disabled);
    }

    public String toString() {
        String str = this.bookingCode;
        boolean z = this.disabled;
        double d = this.percentage;
        StringBuilder sbA = z620.a("LiabilitiesResponse(bookingCode=", str, ", disabled=", ", percentage=", z);
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }

    public LiabilitiesResponse(String str, boolean z, double d) {
        str.getClass();
        this.bookingCode = str;
        this.disabled = z;
        this.percentage = d;
    }

    public LiabilitiesResponse() {
        this(null, false, 0.0d, 7, null);
    }
}

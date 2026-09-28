package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeRequest;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "requestSource", "", "index", "<init>", "(Ljava/lang/String;II)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRequestSource", "()I", "getIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RecommendBookingCodeRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("index")
    private final int index;

    @SerializedName("requestSource")
    private final int requestSource;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeRequest$Companion;", "", "<init>", "()V", "create", "Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeRequest;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "requestSource", "Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeRequestSource;", "index", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RecommendBookingCodeRequest create$default(Companion companion, String str, RecommendBookingCodeRequestSource recommendBookingCodeRequestSource, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return companion.create(str, recommendBookingCodeRequestSource, i);
        }

        public final RecommendBookingCodeRequest create(String eventId, RecommendBookingCodeRequestSource requestSource, int index) {
            eventId.getClass();
            requestSource.getClass();
            return new RecommendBookingCodeRequest(eventId, requestSource.getSource(), index);
        }

        private Companion() {
        }
    }

    public RecommendBookingCodeRequest(String str, int i, int i2) {
        str.getClass();
        this.eventId = str;
        this.requestSource = i;
        this.index = i2;
    }

    public static /* synthetic */ RecommendBookingCodeRequest copy$default(RecommendBookingCodeRequest recommendBookingCodeRequest, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = recommendBookingCodeRequest.eventId;
        }
        if ((i3 & 2) != 0) {
            i = recommendBookingCodeRequest.requestSource;
        }
        if ((i3 & 4) != 0) {
            i2 = recommendBookingCodeRequest.index;
        }
        return recommendBookingCodeRequest.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRequestSource() {
        return this.requestSource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final RecommendBookingCodeRequest copy(String eventId, int requestSource, int index) {
        eventId.getClass();
        return new RecommendBookingCodeRequest(eventId, requestSource, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendBookingCodeRequest)) {
            return false;
        }
        RecommendBookingCodeRequest recommendBookingCodeRequest = (RecommendBookingCodeRequest) other;
        return Intrinsics.g(this.eventId, recommendBookingCodeRequest.eventId) && this.requestSource == recommendBookingCodeRequest.requestSource && this.index == recommendBookingCodeRequest.index;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getRequestSource() {
        return this.requestSource;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + gpp.a(this.requestSource, this.eventId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.eventId;
        return zk1.a(this.index, ")", ml5.a(this.requestSource, "RecommendBookingCodeRequest(eventId=", str, ", requestSource=", ", index="));
    }

    public /* synthetic */ RecommendBookingCodeRequest(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? 0 : i2);
    }
}

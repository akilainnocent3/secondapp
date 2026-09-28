package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/bookingcode/SmartRemixEligibilityResponse;", "", "shareCode", "", "shareURL", "ticket", "Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketDto;", "outcomes", "", "Lcom/sporty/android/core/model/bookingcode/EventDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketDto;Ljava/util/List;)V", "getShareCode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getShareURL", "getTicket", "()Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketDto;", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SmartRemixEligibilityResponse {

    @SerializedName("outcomes")
    private final List<EventDto> outcomes;

    @SerializedName("shareCode")
    private final String shareCode;

    @SerializedName("shareURL")
    private final String shareURL;

    @SerializedName("ticket")
    private final SmartRemixTicketDto ticket;

    public /* synthetic */ SmartRemixEligibilityResponse(String str, String str2, SmartRemixTicketDto smartRemixTicketDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : smartRemixTicketDto, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartRemixEligibilityResponse copy$default(SmartRemixEligibilityResponse smartRemixEligibilityResponse, String str, String str2, SmartRemixTicketDto smartRemixTicketDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartRemixEligibilityResponse.shareCode;
        }
        if ((i & 2) != 0) {
            str2 = smartRemixEligibilityResponse.shareURL;
        }
        if ((i & 4) != 0) {
            smartRemixTicketDto = smartRemixEligibilityResponse.ticket;
        }
        if ((i & 8) != 0) {
            list = smartRemixEligibilityResponse.outcomes;
        }
        return smartRemixEligibilityResponse.copy(str, str2, smartRemixTicketDto, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareURL() {
        return this.shareURL;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SmartRemixTicketDto getTicket() {
        return this.ticket;
    }

    public final List<EventDto> component4() {
        return this.outcomes;
    }

    public final SmartRemixEligibilityResponse copy(String shareCode, String shareURL, SmartRemixTicketDto ticket, List<EventDto> outcomes) {
        return new SmartRemixEligibilityResponse(shareCode, shareURL, ticket, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartRemixEligibilityResponse)) {
            return false;
        }
        SmartRemixEligibilityResponse smartRemixEligibilityResponse = (SmartRemixEligibilityResponse) other;
        return Intrinsics.g(this.shareCode, smartRemixEligibilityResponse.shareCode) && Intrinsics.g(this.shareURL, smartRemixEligibilityResponse.shareURL) && Intrinsics.g(this.ticket, smartRemixEligibilityResponse.ticket) && Intrinsics.g(this.outcomes, smartRemixEligibilityResponse.outcomes);
    }

    public final List<EventDto> getOutcomes() {
        return this.outcomes;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getShareURL() {
        return this.shareURL;
    }

    public final SmartRemixTicketDto getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        String str = this.shareCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shareURL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SmartRemixTicketDto smartRemixTicketDto = this.ticket;
        int iHashCode3 = (iHashCode2 + (smartRemixTicketDto == null ? 0 : smartRemixTicketDto.hashCode())) * 31;
        List<EventDto> list = this.outcomes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.shareCode;
        String str2 = this.shareURL;
        SmartRemixTicketDto smartRemixTicketDto = this.ticket;
        List<EventDto> list = this.outcomes;
        StringBuilder sbA = ux5.a("SmartRemixEligibilityResponse(shareCode=", str, ", shareURL=", str2, ", ticket=");
        sbA.append(smartRemixTicketDto);
        sbA.append(", outcomes=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }

    public SmartRemixEligibilityResponse(String str, String str2, SmartRemixTicketDto smartRemixTicketDto, List<EventDto> list) {
        this.shareCode = str;
        this.shareURL = str2;
        this.ticket = smartRemixTicketDto;
        this.outcomes = list;
    }

    public SmartRemixEligibilityResponse() {
        this(null, null, null, null, 15, null);
    }
}

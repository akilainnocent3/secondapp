package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketSelectionDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "specifier", "childSelections", "", "sportId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketId", "getOutcomeId", "getSpecifier", "getChildSelections", "()Ljava/util/List;", "getSportId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SmartRemixTicketSelectionDto {

    @SerializedName("childSelections")
    private final List<SmartRemixTicketSelectionDto> childSelections;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("specifier")
    private final String specifier;

    @SerializedName("sportId")
    private final String sportId;

    public /* synthetic */ SmartRemixTicketSelectionDto(String str, String str2, String str3, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartRemixTicketSelectionDto copy$default(SmartRemixTicketSelectionDto smartRemixTicketSelectionDto, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartRemixTicketSelectionDto.eventId;
        }
        if ((i & 2) != 0) {
            str2 = smartRemixTicketSelectionDto.marketId;
        }
        if ((i & 4) != 0) {
            str3 = smartRemixTicketSelectionDto.outcomeId;
        }
        if ((i & 8) != 0) {
            str4 = smartRemixTicketSelectionDto.specifier;
        }
        if ((i & 16) != 0) {
            list = smartRemixTicketSelectionDto.childSelections;
        }
        if ((i & 32) != 0) {
            str5 = smartRemixTicketSelectionDto.sportId;
        }
        List list2 = list;
        String str6 = str5;
        return smartRemixTicketSelectionDto.copy(str, str2, str3, str4, list2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    public final List<SmartRemixTicketSelectionDto> component5() {
        return this.childSelections;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final SmartRemixTicketSelectionDto copy(String eventId, String marketId, String outcomeId, String specifier, List<SmartRemixTicketSelectionDto> childSelections, String sportId) {
        return new SmartRemixTicketSelectionDto(eventId, marketId, outcomeId, specifier, childSelections, sportId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartRemixTicketSelectionDto)) {
            return false;
        }
        SmartRemixTicketSelectionDto smartRemixTicketSelectionDto = (SmartRemixTicketSelectionDto) other;
        return Intrinsics.g(this.eventId, smartRemixTicketSelectionDto.eventId) && Intrinsics.g(this.marketId, smartRemixTicketSelectionDto.marketId) && Intrinsics.g(this.outcomeId, smartRemixTicketSelectionDto.outcomeId) && Intrinsics.g(this.specifier, smartRemixTicketSelectionDto.specifier) && Intrinsics.g(this.childSelections, smartRemixTicketSelectionDto.childSelections) && Intrinsics.g(this.sportId, smartRemixTicketSelectionDto.sportId);
    }

    public final List<SmartRemixTicketSelectionDto> getChildSelections() {
        return this.childSelections;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outcomeId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.specifier;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<SmartRemixTicketSelectionDto> list = this.childSelections;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.sportId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        String str3 = this.outcomeId;
        String str4 = this.specifier;
        List<SmartRemixTicketSelectionDto> list = this.childSelections;
        String str5 = this.sportId;
        StringBuilder sbA = ux5.a("SmartRemixTicketSelectionDto(eventId=", str, ", marketId=", str2, ", outcomeId=");
        hxa.c(sbA, str3, ", specifier=", str4, ", childSelections=");
        sbA.append(list);
        sbA.append(", sportId=");
        sbA.append(str5);
        sbA.append(")");
        return sbA.toString();
    }

    public SmartRemixTicketSelectionDto(String str, String str2, String str3, String str4, List<SmartRemixTicketSelectionDto> list, String str5) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.specifier = str4;
        this.childSelections = list;
        this.sportId = str5;
    }

    public SmartRemixTicketSelectionDto() {
        this(null, null, null, null, null, null, 63, null);
    }
}

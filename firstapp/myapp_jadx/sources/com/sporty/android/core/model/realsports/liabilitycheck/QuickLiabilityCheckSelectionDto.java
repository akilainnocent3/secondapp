package com.sporty.android.core.model.realsports.liabilitycheck;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckSelectionDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "specifier", "parentBetBuilderMarketId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getMarketId", "getOutcomeId", "getSpecifier", "getParentBetBuilderMarketId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuickLiabilityCheckSelectionDto {
    private final String eventId;
    private final String marketId;
    private final String outcomeId;
    private final String parentBetBuilderMarketId;
    private final String specifier;

    public QuickLiabilityCheckSelectionDto(String str, String str2, String str3, String str4, String str5) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.specifier = str4;
        this.parentBetBuilderMarketId = str5;
    }

    public static /* synthetic */ QuickLiabilityCheckSelectionDto copy$default(QuickLiabilityCheckSelectionDto quickLiabilityCheckSelectionDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickLiabilityCheckSelectionDto.eventId;
        }
        if ((i & 2) != 0) {
            str2 = quickLiabilityCheckSelectionDto.marketId;
        }
        if ((i & 4) != 0) {
            str3 = quickLiabilityCheckSelectionDto.outcomeId;
        }
        if ((i & 8) != 0) {
            str4 = quickLiabilityCheckSelectionDto.specifier;
        }
        if ((i & 16) != 0) {
            str5 = quickLiabilityCheckSelectionDto.parentBetBuilderMarketId;
        }
        String str6 = str5;
        String str7 = str3;
        return quickLiabilityCheckSelectionDto.copy(str, str2, str7, str4, str6);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParentBetBuilderMarketId() {
        return this.parentBetBuilderMarketId;
    }

    public final QuickLiabilityCheckSelectionDto copy(String eventId, String marketId, String outcomeId, String specifier, String parentBetBuilderMarketId) {
        return new QuickLiabilityCheckSelectionDto(eventId, marketId, outcomeId, specifier, parentBetBuilderMarketId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickLiabilityCheckSelectionDto)) {
            return false;
        }
        QuickLiabilityCheckSelectionDto quickLiabilityCheckSelectionDto = (QuickLiabilityCheckSelectionDto) other;
        return Intrinsics.g(this.eventId, quickLiabilityCheckSelectionDto.eventId) && Intrinsics.g(this.marketId, quickLiabilityCheckSelectionDto.marketId) && Intrinsics.g(this.outcomeId, quickLiabilityCheckSelectionDto.outcomeId) && Intrinsics.g(this.specifier, quickLiabilityCheckSelectionDto.specifier) && Intrinsics.g(this.parentBetBuilderMarketId, quickLiabilityCheckSelectionDto.parentBetBuilderMarketId);
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

    public final String getParentBetBuilderMarketId() {
        return this.parentBetBuilderMarketId;
    }

    public final String getSpecifier() {
        return this.specifier;
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
        String str5 = this.parentBetBuilderMarketId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        String str3 = this.outcomeId;
        String str4 = this.specifier;
        String str5 = this.parentBetBuilderMarketId;
        StringBuilder sbA = ux5.a("QuickLiabilityCheckSelectionDto(eventId=", str, ", marketId=", str2, ", outcomeId=");
        hxa.c(sbA, str3, ", specifier=", str4, ", parentBetBuilderMarketId=");
        return uf80.a(sbA, str5, ")");
    }
}

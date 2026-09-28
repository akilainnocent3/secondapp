package com.sporty.android.core.model.autobet;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.qn4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/core/model/autobet/AutoBetRequestSelection;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "productId", "sportId", "marketId", "specifier", "outcomeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getProductId", "getSportId", "getMarketId", "getSpecifier", "getOutcomeId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AutoBetRequestSelection {
    private final String eventId;
    private final String marketId;
    private final String outcomeId;
    private final String productId;
    private final String specifier;
    private final String sportId;

    public AutoBetRequestSelection(String str, String str2, String str3, String str4, String str5, String str6) {
        qn4.b(str, str2, str3, str4, str6);
        this.eventId = str;
        this.productId = str2;
        this.sportId = str3;
        this.marketId = str4;
        this.specifier = str5;
        this.outcomeId = str6;
    }

    public static /* synthetic */ AutoBetRequestSelection copy$default(AutoBetRequestSelection autoBetRequestSelection, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoBetRequestSelection.eventId;
        }
        if ((i & 2) != 0) {
            str2 = autoBetRequestSelection.productId;
        }
        if ((i & 4) != 0) {
            str3 = autoBetRequestSelection.sportId;
        }
        if ((i & 8) != 0) {
            str4 = autoBetRequestSelection.marketId;
        }
        if ((i & 16) != 0) {
            str5 = autoBetRequestSelection.specifier;
        }
        if ((i & 32) != 0) {
            str6 = autoBetRequestSelection.outcomeId;
        }
        String str7 = str5;
        String str8 = str6;
        return autoBetRequestSelection.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final AutoBetRequestSelection copy(String eventId, String productId, String sportId, String marketId, String specifier, String outcomeId) {
        eventId.getClass();
        productId.getClass();
        sportId.getClass();
        marketId.getClass();
        outcomeId.getClass();
        return new AutoBetRequestSelection(eventId, productId, sportId, marketId, specifier, outcomeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoBetRequestSelection)) {
            return false;
        }
        AutoBetRequestSelection autoBetRequestSelection = (AutoBetRequestSelection) other;
        return Intrinsics.g(this.eventId, autoBetRequestSelection.eventId) && Intrinsics.g(this.productId, autoBetRequestSelection.productId) && Intrinsics.g(this.sportId, autoBetRequestSelection.sportId) && Intrinsics.g(this.marketId, autoBetRequestSelection.marketId) && Intrinsics.g(this.specifier, autoBetRequestSelection.specifier) && Intrinsics.g(this.outcomeId, autoBetRequestSelection.outcomeId);
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

    public final String getProductId() {
        return this.productId;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.eventId.hashCode() * 31, 31, this.productId), 31, this.sportId), 31, this.marketId);
        String str = this.specifier;
        return this.outcomeId.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.productId;
        String str3 = this.sportId;
        String str4 = this.marketId;
        String str5 = this.specifier;
        String str6 = this.outcomeId;
        StringBuilder sbA = ux5.a("AutoBetRequestSelection(eventId=", str, ", productId=", str2, ", sportId=");
        hxa.c(sbA, str3, ", marketId=", str4, ", specifier=");
        return kwi.a(sbA, str5, ", outcomeId=", str6, ")");
    }
}

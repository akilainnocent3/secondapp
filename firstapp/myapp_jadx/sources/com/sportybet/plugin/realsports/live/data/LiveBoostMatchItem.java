package com.sportybet.plugin.realsports.live.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eÊ\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveBoostMatchItem;", "", "periodId", "", "sportId", "tournamentId", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "productId", "", "marketId", "specifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getPeriodId", "()Ljava/lang/String;", "getSportId", "getTournamentId", "getEventId", "getProductId", "()I", "getMarketId", "getSpecifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveBoostMatchItem {
    public static final int $stable = 0;
    private final String eventId;
    private final String marketId;
    private final String periodId;
    private final int productId;
    private final String specifier;
    private final String sportId;
    private final String tournamentId;

    public LiveBoostMatchItem(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.periodId = str;
        this.sportId = str2;
        this.tournamentId = str3;
        this.eventId = str4;
        this.productId = i;
        this.marketId = str5;
        this.specifier = str6;
    }

    public static /* synthetic */ LiveBoostMatchItem copy$default(LiveBoostMatchItem liveBoostMatchItem, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = liveBoostMatchItem.periodId;
        }
        if ((i2 & 2) != 0) {
            str2 = liveBoostMatchItem.sportId;
        }
        if ((i2 & 4) != 0) {
            str3 = liveBoostMatchItem.tournamentId;
        }
        if ((i2 & 8) != 0) {
            str4 = liveBoostMatchItem.eventId;
        }
        if ((i2 & 16) != 0) {
            i = liveBoostMatchItem.productId;
        }
        if ((i2 & 32) != 0) {
            str5 = liveBoostMatchItem.marketId;
        }
        if ((i2 & 64) != 0) {
            str6 = liveBoostMatchItem.specifier;
        }
        String str7 = str5;
        String str8 = str6;
        int i3 = i;
        String str9 = str3;
        return liveBoostMatchItem.copy(str, str2, str9, str4, i3, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeriodId() {
        return this.periodId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    public final LiveBoostMatchItem copy(String periodId, String sportId, String tournamentId, String eventId, int productId, String marketId, String specifier) {
        qn4.b(periodId, sportId, tournamentId, eventId, marketId);
        specifier.getClass();
        return new LiveBoostMatchItem(periodId, sportId, tournamentId, eventId, productId, marketId, specifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveBoostMatchItem)) {
            return false;
        }
        LiveBoostMatchItem liveBoostMatchItem = (LiveBoostMatchItem) other;
        return Intrinsics.g(this.periodId, liveBoostMatchItem.periodId) && Intrinsics.g(this.sportId, liveBoostMatchItem.sportId) && Intrinsics.g(this.tournamentId, liveBoostMatchItem.tournamentId) && Intrinsics.g(this.eventId, liveBoostMatchItem.eventId) && this.productId == liveBoostMatchItem.productId && Intrinsics.g(this.marketId, liveBoostMatchItem.marketId) && Intrinsics.g(this.specifier, liveBoostMatchItem.specifier);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getPeriodId() {
        return this.periodId;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        return this.specifier.hashCode() + gmf0.a(gpp.a(this.productId, gmf0.a(gmf0.a(gmf0.a(this.periodId.hashCode() * 31, 31, this.sportId), 31, this.tournamentId), 31, this.eventId), 31), 31, this.marketId);
    }

    public String toString() {
        String str = this.periodId;
        String str2 = this.sportId;
        String str3 = this.tournamentId;
        String str4 = this.eventId;
        int i = this.productId;
        String str5 = this.marketId;
        String str6 = this.specifier;
        StringBuilder sbA = ux5.a("LiveBoostMatchItem(periodId=", str, ", sportId=", str2, ", tournamentId=");
        hxa.c(sbA, str3, ", eventId=", str4, ", productId=");
        f78.b(i, ", marketId=", str5, ", specifier=", sbA);
        return uf80.a(sbA, str6, ")");
    }
}

package com.sporty.android.core.model.oddsboost;

import defpackage.kwi;
import defpackage.pq6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eÊ\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/oddsboost/OddsBoostDetails;", "", "productId", "", "tournamentId", "", "marketId", "specifier", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTournamentId", "()Ljava/lang/String;", "getMarketId", "getSpecifier", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/oddsboost/OddsBoostDetails;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OddsBoostDetails {
    private final String marketId;
    private final Integer productId;
    private final String specifier;
    private final String tournamentId;

    public /* synthetic */ OddsBoostDetails(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ OddsBoostDetails copy$default(OddsBoostDetails oddsBoostDetails, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oddsBoostDetails.productId;
        }
        if ((i & 2) != 0) {
            str = oddsBoostDetails.tournamentId;
        }
        if ((i & 4) != 0) {
            str2 = oddsBoostDetails.marketId;
        }
        if ((i & 8) != 0) {
            str3 = oddsBoostDetails.specifier;
        }
        return oddsBoostDetails.copy(num, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    public final OddsBoostDetails copy(Integer productId, String tournamentId, String marketId, String specifier) {
        return new OddsBoostDetails(productId, tournamentId, marketId, specifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsBoostDetails)) {
            return false;
        }
        OddsBoostDetails oddsBoostDetails = (OddsBoostDetails) other;
        return Intrinsics.g(this.productId, oddsBoostDetails.productId) && Intrinsics.g(this.tournamentId, oddsBoostDetails.tournamentId) && Intrinsics.g(this.marketId, oddsBoostDetails.marketId) && Intrinsics.g(this.specifier, oddsBoostDetails.specifier);
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final Integer getProductId() {
        return this.productId;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        Integer num = this.productId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tournamentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.marketId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.specifier;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.productId;
        String str = this.tournamentId;
        return kwi.a(pq6.a(num, "OddsBoostDetails(productId=", ", tournamentId=", str, ", marketId="), this.marketId, ", specifier=", this.specifier, ")");
    }

    public OddsBoostDetails(Integer num, String str, String str2, String str3) {
        this.productId = num;
        this.tournamentId = str;
        this.marketId = str2;
        this.specifier = str3;
    }

    public OddsBoostDetails() {
        this(null, null, null, null, 15, null);
    }
}

package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketOutcome;", "", "outcomeId", "", "marketId", "desc", "odds", "prob", "hit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getOutcomeId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketId", "getDesc", "getOdds", "getProb", "getHit", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyTicketOutcome {
    public static final int $stable = 0;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("hit")
    private final boolean hit;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("prob")
    private final String prob;

    public NetworkSportyPenaltyTicketOutcome(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.outcomeId = str;
        this.marketId = str2;
        this.desc = str3;
        this.odds = str4;
        this.prob = str5;
        this.hit = z;
    }

    public static /* synthetic */ NetworkSportyPenaltyTicketOutcome copy$default(NetworkSportyPenaltyTicketOutcome networkSportyPenaltyTicketOutcome, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSportyPenaltyTicketOutcome.outcomeId;
        }
        if ((i & 2) != 0) {
            str2 = networkSportyPenaltyTicketOutcome.marketId;
        }
        if ((i & 4) != 0) {
            str3 = networkSportyPenaltyTicketOutcome.desc;
        }
        if ((i & 8) != 0) {
            str4 = networkSportyPenaltyTicketOutcome.odds;
        }
        if ((i & 16) != 0) {
            str5 = networkSportyPenaltyTicketOutcome.prob;
        }
        if ((i & 32) != 0) {
            z = networkSportyPenaltyTicketOutcome.hit;
        }
        String str6 = str5;
        boolean z2 = z;
        return networkSportyPenaltyTicketOutcome.copy(str, str2, str3, str4, str6, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProb() {
        return this.prob;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    public final NetworkSportyPenaltyTicketOutcome copy(String outcomeId, String marketId, String desc, String odds, String prob, boolean hit) {
        return new NetworkSportyPenaltyTicketOutcome(outcomeId, marketId, desc, odds, prob, hit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyTicketOutcome)) {
            return false;
        }
        NetworkSportyPenaltyTicketOutcome networkSportyPenaltyTicketOutcome = (NetworkSportyPenaltyTicketOutcome) other;
        return Intrinsics.g(this.outcomeId, networkSportyPenaltyTicketOutcome.outcomeId) && Intrinsics.g(this.marketId, networkSportyPenaltyTicketOutcome.marketId) && Intrinsics.g(this.desc, networkSportyPenaltyTicketOutcome.desc) && Intrinsics.g(this.odds, networkSportyPenaltyTicketOutcome.odds) && Intrinsics.g(this.prob, networkSportyPenaltyTicketOutcome.prob) && this.hit == networkSportyPenaltyTicketOutcome.hit;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getHit() {
        return this.hit;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getProb() {
        return this.prob;
    }

    public int hashCode() {
        String str = this.outcomeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.odds;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.prob;
        return Boolean.hashCode(this.hit) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.outcomeId;
        String str2 = this.marketId;
        String str3 = this.desc;
        String str4 = this.odds;
        String str5 = this.prob;
        boolean z = this.hit;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltyTicketOutcome(outcomeId=", str, ", marketId=", str2, ", desc=");
        hxa.c(sbA, str3, ", odds=", str4, ", prob=");
        return x9d.a(str5, ", hit=", ")", sbA, z);
    }
}

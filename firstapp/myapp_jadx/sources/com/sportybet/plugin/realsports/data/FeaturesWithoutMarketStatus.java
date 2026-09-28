package com.sportybet.plugin.realsports.data;

import defpackage.gmf0;
import defpackage.k980;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010\u0010\"\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/sportybet/plugin/realsports/data/FeaturesWithoutMarketStatus;", "", "", "eventID", "outcomeOdds", "", "isUndo", "Lk980;", "source", "outcomeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLk980;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lk980;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLk980;Ljava/lang/String;)Lcom/sportybet/plugin/realsports/data/FeaturesWithoutMarketStatus;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventID", "getOutcomeOdds", "Z", "setUndo", "(Z)V", "Lk980;", "getSource", "getOutcomeId", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeaturesWithoutMarketStatus {
    public static final int $stable = 8;
    private final String eventID;
    private boolean isUndo;
    private final String outcomeId;
    private final String outcomeOdds;
    private final k980 source;

    public FeaturesWithoutMarketStatus(String str, String str2, boolean z, k980 k980Var, String str3) {
        str.getClass();
        str2.getClass();
        k980Var.getClass();
        str3.getClass();
        this.eventID = str;
        this.outcomeOdds = str2;
        this.isUndo = z;
        this.source = k980Var;
        this.outcomeId = str3;
    }

    public static /* synthetic */ FeaturesWithoutMarketStatus copy$default(FeaturesWithoutMarketStatus featuresWithoutMarketStatus, String str, String str2, boolean z, k980 k980Var, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featuresWithoutMarketStatus.eventID;
        }
        if ((i & 2) != 0) {
            str2 = featuresWithoutMarketStatus.outcomeOdds;
        }
        if ((i & 4) != 0) {
            z = featuresWithoutMarketStatus.isUndo;
        }
        if ((i & 8) != 0) {
            k980Var = featuresWithoutMarketStatus.source;
        }
        if ((i & 16) != 0) {
            str3 = featuresWithoutMarketStatus.outcomeId;
        }
        String str4 = str3;
        boolean z2 = z;
        return featuresWithoutMarketStatus.copy(str, str2, z2, k980Var, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventID() {
        return this.eventID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOutcomeOdds() {
        return this.outcomeOdds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsUndo() {
        return this.isUndo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final k980 getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final FeaturesWithoutMarketStatus copy(String eventID, String outcomeOdds, boolean isUndo, k980 source, String outcomeId) {
        eventID.getClass();
        outcomeOdds.getClass();
        source.getClass();
        outcomeId.getClass();
        return new FeaturesWithoutMarketStatus(eventID, outcomeOdds, isUndo, source, outcomeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturesWithoutMarketStatus)) {
            return false;
        }
        FeaturesWithoutMarketStatus featuresWithoutMarketStatus = (FeaturesWithoutMarketStatus) other;
        return Intrinsics.g(this.eventID, featuresWithoutMarketStatus.eventID) && Intrinsics.g(this.outcomeOdds, featuresWithoutMarketStatus.outcomeOdds) && this.isUndo == featuresWithoutMarketStatus.isUndo && this.source == featuresWithoutMarketStatus.source && Intrinsics.g(this.outcomeId, featuresWithoutMarketStatus.outcomeId);
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getOutcomeOdds() {
        return this.outcomeOdds;
    }

    public final k980 getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.outcomeId.hashCode() + ((this.source.hashCode() + mtg0.a(gmf0.a(this.eventID.hashCode() * 31, 31, this.outcomeOdds), 31, this.isUndo)) * 31);
    }

    public final boolean isUndo() {
        return this.isUndo;
    }

    public final void setUndo(boolean z) {
        this.isUndo = z;
    }

    public String toString() {
        String str = this.eventID;
        String str2 = this.outcomeOdds;
        boolean z = this.isUndo;
        k980 k980Var = this.source;
        String str3 = this.outcomeId;
        StringBuilder sbA = ux5.a("FeaturesWithoutMarketStatus(eventID=", str, ", outcomeOdds=", str2, ", isUndo=");
        sbA.append(z);
        sbA.append(", source=");
        sbA.append(k980Var);
        sbA.append(", outcomeId=");
        return uf80.a(sbA, str3, ")");
    }

    public /* synthetic */ FeaturesWithoutMarketStatus(String str, String str2, boolean z, k980 k980Var, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? k980.EDIT_BET : k980Var, str3);
    }
}

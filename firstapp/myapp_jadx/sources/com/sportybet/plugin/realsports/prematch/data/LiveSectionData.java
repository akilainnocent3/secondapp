package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Tournament;
import defpackage.ai50;
import defpackage.gpp;
import defpackage.mfb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JJ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/LiveSectionData;", "", "Lmfb0;", "sport", "", "allLiveCount", "liveBettingCount", "", "Lcom/sportybet/plugin/realsports/data/Tournament;", "tournaments", "Lcom/sportybet/plugin/realsports/data/BoostResult;", "boostResult", "<init>", "(Lmfb0;IILjava/util/List;Lcom/sportybet/plugin/realsports/data/BoostResult;)V", "component1", "()Lmfb0;", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/sportybet/plugin/realsports/data/BoostResult;", "copy", "(Lmfb0;IILjava/util/List;Lcom/sportybet/plugin/realsports/data/BoostResult;)Lcom/sportybet/plugin/realsports/prematch/data/LiveSectionData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmfb0;", "getSport", "I", "getAllLiveCount", "getLiveBettingCount", "Ljava/util/List;", "getTournaments", "Lcom/sportybet/plugin/realsports/data/BoostResult;", "getBoostResult", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveSectionData {
    public static final int $stable = 8;
    private final int allLiveCount;
    private final BoostResult boostResult;
    private final int liveBettingCount;
    private final mfb0 sport;
    private final List<Tournament> tournaments;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSectionData(mfb0 mfb0Var, int i, int i2, List<? extends Tournament> list, BoostResult boostResult) {
        mfb0Var.getClass();
        list.getClass();
        this.sport = mfb0Var;
        this.allLiveCount = i;
        this.liveBettingCount = i2;
        this.tournaments = list;
        this.boostResult = boostResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveSectionData copy$default(LiveSectionData liveSectionData, mfb0 mfb0Var, int i, int i2, List list, BoostResult boostResult, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            mfb0Var = liveSectionData.sport;
        }
        if ((i3 & 2) != 0) {
            i = liveSectionData.allLiveCount;
        }
        if ((i3 & 4) != 0) {
            i2 = liveSectionData.liveBettingCount;
        }
        if ((i3 & 8) != 0) {
            list = liveSectionData.tournaments;
        }
        if ((i3 & 16) != 0) {
            boostResult = liveSectionData.boostResult;
        }
        BoostResult boostResult2 = boostResult;
        int i4 = i2;
        return liveSectionData.copy(mfb0Var, i, i4, list, boostResult2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final mfb0 getSport() {
        return this.sport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAllLiveCount() {
        return this.allLiveCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLiveBettingCount() {
        return this.liveBettingCount;
    }

    public final List<Tournament> component4() {
        return this.tournaments;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BoostResult getBoostResult() {
        return this.boostResult;
    }

    public final LiveSectionData copy(mfb0 sport, int allLiveCount, int liveBettingCount, List<? extends Tournament> tournaments, BoostResult boostResult) {
        sport.getClass();
        tournaments.getClass();
        return new LiveSectionData(sport, allLiveCount, liveBettingCount, tournaments, boostResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSectionData)) {
            return false;
        }
        LiveSectionData liveSectionData = (LiveSectionData) other;
        return Intrinsics.g(this.sport, liveSectionData.sport) && this.allLiveCount == liveSectionData.allLiveCount && this.liveBettingCount == liveSectionData.liveBettingCount && Intrinsics.g(this.tournaments, liveSectionData.tournaments) && Intrinsics.g(this.boostResult, liveSectionData.boostResult);
    }

    public final int getAllLiveCount() {
        return this.allLiveCount;
    }

    public final BoostResult getBoostResult() {
        return this.boostResult;
    }

    public final int getLiveBettingCount() {
        return this.liveBettingCount;
    }

    public final mfb0 getSport() {
        return this.sport;
    }

    public final List<Tournament> getTournaments() {
        return this.tournaments;
    }

    public int hashCode() {
        int iA = ai50.a(gpp.a(this.liveBettingCount, gpp.a(this.allLiveCount, this.sport.hashCode() * 31, 31), 31), 31, this.tournaments);
        BoostResult boostResult = this.boostResult;
        return iA + (boostResult == null ? 0 : boostResult.hashCode());
    }

    public String toString() {
        return "LiveSectionData(sport=" + this.sport + ", allLiveCount=" + this.allLiveCount + ", liveBettingCount=" + this.liveBettingCount + ", tournaments=" + this.tournaments + ", boostResult=" + this.boostResult + ")";
    }
}

package com.sportybet.plugin.realsports.live.data;

import defpackage.mvs;
import defpackage.szs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveLoadingData;", "Lcom/sportybet/plugin/realsports/live/data/LiveSectionData;", "Lmvs;", "viewType", "Lszs;", "loadingType", "<init>", "(Lmvs;Lszs;)V", "component1", "()Lmvs;", "component2", "()Lszs;", "copy", "(Lmvs;Lszs;)Lcom/sportybet/plugin/realsports/live/data/LiveLoadingData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmvs;", "getViewType", "Lszs;", "getLoadingType", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveLoadingData implements LiveSectionData {
    public static final int $stable = 0;
    private final szs loadingType;
    private final mvs viewType;

    public LiveLoadingData(mvs mvsVar, szs szsVar) {
        mvsVar.getClass();
        szsVar.getClass();
        this.viewType = mvsVar;
        this.loadingType = szsVar;
    }

    public static /* synthetic */ LiveLoadingData copy$default(LiveLoadingData liveLoadingData, mvs mvsVar, szs szsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mvsVar = liveLoadingData.viewType;
        }
        if ((i & 2) != 0) {
            szsVar = liveLoadingData.loadingType;
        }
        return liveLoadingData.copy(mvsVar, szsVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final mvs getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final szs getLoadingType() {
        return this.loadingType;
    }

    public final LiveLoadingData copy(mvs viewType, szs loadingType) {
        viewType.getClass();
        loadingType.getClass();
        return new LiveLoadingData(viewType, loadingType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveLoadingData)) {
            return false;
        }
        LiveLoadingData liveLoadingData = (LiveLoadingData) other;
        return this.viewType == liveLoadingData.viewType && this.loadingType == liveLoadingData.loadingType;
    }

    public final szs getLoadingType() {
        return this.loadingType;
    }

    @Override // com.sportybet.plugin.realsports.live.data.LiveSectionData
    public mvs getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return this.loadingType.hashCode() + (this.viewType.hashCode() * 31);
    }

    public String toString() {
        return "LiveLoadingData(viewType=" + this.viewType + ", loadingType=" + this.loadingType + ")";
    }
}

package com.sportybet.plugin.realsports.live.data;

import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nve;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveSpinnerMeta;", "", "lastSelectedPos", "", "eventPos", "marketId", "", "specifierList", "", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "getLastSelectedPos", "()I", "getEventPos", "getMarketId", "()Ljava/lang/String;", "getSpecifierList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveSpinnerMeta {
    public static final int $stable = 8;
    private final int eventPos;
    private final int lastSelectedPos;
    private final String marketId;
    private final List<String> specifierList;

    public LiveSpinnerMeta(int i, int i2, String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.lastSelectedPos = i;
        this.eventPos = i2;
        this.marketId = str;
        this.specifierList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveSpinnerMeta copy$default(LiveSpinnerMeta liveSpinnerMeta, int i, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = liveSpinnerMeta.lastSelectedPos;
        }
        if ((i3 & 2) != 0) {
            i2 = liveSpinnerMeta.eventPos;
        }
        if ((i3 & 4) != 0) {
            str = liveSpinnerMeta.marketId;
        }
        if ((i3 & 8) != 0) {
            list = liveSpinnerMeta.specifierList;
        }
        return liveSpinnerMeta.copy(i, i2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLastSelectedPos() {
        return this.lastSelectedPos;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEventPos() {
        return this.eventPos;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    public final List<String> component4() {
        return this.specifierList;
    }

    public final LiveSpinnerMeta copy(int lastSelectedPos, int eventPos, String marketId, List<String> specifierList) {
        marketId.getClass();
        specifierList.getClass();
        return new LiveSpinnerMeta(lastSelectedPos, eventPos, marketId, specifierList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSpinnerMeta)) {
            return false;
        }
        LiveSpinnerMeta liveSpinnerMeta = (LiveSpinnerMeta) other;
        return this.lastSelectedPos == liveSpinnerMeta.lastSelectedPos && this.eventPos == liveSpinnerMeta.eventPos && Intrinsics.g(this.marketId, liveSpinnerMeta.marketId) && Intrinsics.g(this.specifierList, liveSpinnerMeta.specifierList);
    }

    public final int getEventPos() {
        return this.eventPos;
    }

    public final int getLastSelectedPos() {
        return this.lastSelectedPos;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final List<String> getSpecifierList() {
        return this.specifierList;
    }

    public int hashCode() {
        return this.specifierList.hashCode() + gmf0.a(gpp.a(this.eventPos, Integer.hashCode(this.lastSelectedPos) * 31, 31), 31, this.marketId);
    }

    public String toString() {
        int i = this.lastSelectedPos;
        int i2 = this.eventPos;
        return nve.a(this.marketId, ", specifierList=", ")", dy5.a("LiveSpinnerMeta(lastSelectedPos=", i, i2, ", eventPos=", ", marketId="), this.specifierList);
    }
}

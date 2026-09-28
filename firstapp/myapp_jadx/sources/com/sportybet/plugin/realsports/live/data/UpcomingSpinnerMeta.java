package com.sportybet.plugin.realsports.live.data;

import defpackage.gmf0;
import defpackage.ng1;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/UpcomingSpinnerMeta;", "", "eventPos", "", "marketId", "", "specifierList", "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getEventPos", "()I", "getMarketId", "()Ljava/lang/String;", "getSpecifierList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpcomingSpinnerMeta {
    public static final int $stable = 8;
    private final int eventPos;
    private final String marketId;
    private final List<String> specifierList;

    public UpcomingSpinnerMeta(int i, String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.eventPos = i;
        this.marketId = str;
        this.specifierList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcomingSpinnerMeta copy$default(UpcomingSpinnerMeta upcomingSpinnerMeta, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = upcomingSpinnerMeta.eventPos;
        }
        if ((i2 & 2) != 0) {
            str = upcomingSpinnerMeta.marketId;
        }
        if ((i2 & 4) != 0) {
            list = upcomingSpinnerMeta.specifierList;
        }
        return upcomingSpinnerMeta.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEventPos() {
        return this.eventPos;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    public final List<String> component3() {
        return this.specifierList;
    }

    public final UpcomingSpinnerMeta copy(int eventPos, String marketId, List<String> specifierList) {
        marketId.getClass();
        specifierList.getClass();
        return new UpcomingSpinnerMeta(eventPos, marketId, specifierList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingSpinnerMeta)) {
            return false;
        }
        UpcomingSpinnerMeta upcomingSpinnerMeta = (UpcomingSpinnerMeta) other;
        return this.eventPos == upcomingSpinnerMeta.eventPos && Intrinsics.g(this.marketId, upcomingSpinnerMeta.marketId) && Intrinsics.g(this.specifierList, upcomingSpinnerMeta.specifierList);
    }

    public final int getEventPos() {
        return this.eventPos;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final List<String> getSpecifierList() {
        return this.specifierList;
    }

    public int hashCode() {
        return this.specifierList.hashCode() + gmf0.a(Integer.hashCode(this.eventPos) * 31, 31, this.marketId);
    }

    public String toString() {
        int i = this.eventPos;
        String str = this.marketId;
        return ng1.a(uqe0.a(i, "UpcomingSpinnerMeta(eventPos=", ", marketId=", str, ", specifierList="), this.specifierList, ")");
    }
}

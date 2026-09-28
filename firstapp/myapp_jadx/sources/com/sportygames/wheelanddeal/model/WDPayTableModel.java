package com.sportygames.wheelanddeal.model;

import defpackage.ai50;
import defpackage.uvh;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDPayTableModel;", "", "rtp", "", "selections", "Lcom/sportygames/wheelanddeal/model/WDSelectionModel;", "payouts", "", "Lcom/sportygames/wheelanddeal/model/WDPayoutsModel;", "lastModifiedTimestamp", "", "<init>", "(ILcom/sportygames/wheelanddeal/model/WDSelectionModel;Ljava/util/List;J)V", "getRtp", "()I", "getSelections", "()Lcom/sportygames/wheelanddeal/model/WDSelectionModel;", "getPayouts", "()Ljava/util/List;", "getLastModifiedTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDPayTableModel {
    public static final int $stable = 8;
    private final long lastModifiedTimestamp;
    private final List<WDPayoutsModel> payouts;
    private final int rtp;
    private final WDSelectionModel selections;

    public WDPayTableModel(int i, WDSelectionModel wDSelectionModel, List<WDPayoutsModel> list, long j) {
        wDSelectionModel.getClass();
        list.getClass();
        this.rtp = i;
        this.selections = wDSelectionModel;
        this.payouts = list;
        this.lastModifiedTimestamp = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WDPayTableModel copy$default(WDPayTableModel wDPayTableModel, int i, WDSelectionModel wDSelectionModel, List list, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wDPayTableModel.rtp;
        }
        if ((i2 & 2) != 0) {
            wDSelectionModel = wDPayTableModel.selections;
        }
        if ((i2 & 4) != 0) {
            list = wDPayTableModel.payouts;
        }
        if ((i2 & 8) != 0) {
            j = wDPayTableModel.lastModifiedTimestamp;
        }
        List list2 = list;
        return wDPayTableModel.copy(i, wDSelectionModel, list2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRtp() {
        return this.rtp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WDSelectionModel getSelections() {
        return this.selections;
    }

    public final List<WDPayoutsModel> component3() {
        return this.payouts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final WDPayTableModel copy(int rtp, WDSelectionModel selections, List<WDPayoutsModel> payouts, long lastModifiedTimestamp) {
        selections.getClass();
        payouts.getClass();
        return new WDPayTableModel(rtp, selections, payouts, lastModifiedTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDPayTableModel)) {
            return false;
        }
        WDPayTableModel wDPayTableModel = (WDPayTableModel) other;
        return this.rtp == wDPayTableModel.rtp && Intrinsics.g(this.selections, wDPayTableModel.selections) && Intrinsics.g(this.payouts, wDPayTableModel.payouts) && this.lastModifiedTimestamp == wDPayTableModel.lastModifiedTimestamp;
    }

    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final List<WDPayoutsModel> getPayouts() {
        return this.payouts;
    }

    public final int getRtp() {
        return this.rtp;
    }

    public final WDSelectionModel getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return Long.hashCode(this.lastModifiedTimestamp) + ai50.a((this.selections.hashCode() + (Integer.hashCode(this.rtp) * 31)) * 31, 31, this.payouts);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDPayTableModel(rtp=");
        sb.append(this.rtp);
        sb.append(", selections=");
        sb.append(this.selections);
        sb.append(", payouts=");
        sb.append(this.payouts);
        sb.append(", lastModifiedTimestamp=");
        return uvh.a(sb, this.lastModifiedTimestamp, ')');
    }
}

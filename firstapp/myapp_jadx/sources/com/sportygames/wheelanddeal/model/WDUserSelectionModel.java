package com.sportygames.wheelanddeal.model;

import defpackage.rr1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDUserSelectionModel;", "", "risk", "", "segments", "", "<init>", "(Ljava/lang/String;I)V", "getRisk", "()Ljava/lang/String;", "getSegments", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDUserSelectionModel {
    public static final int $stable = 0;
    private final String risk;
    private final int segments;

    public WDUserSelectionModel(String str, int i) {
        str.getClass();
        this.risk = str;
        this.segments = i;
    }

    public static /* synthetic */ WDUserSelectionModel copy$default(WDUserSelectionModel wDUserSelectionModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wDUserSelectionModel.risk;
        }
        if ((i2 & 2) != 0) {
            i = wDUserSelectionModel.segments;
        }
        return wDUserSelectionModel.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRisk() {
        return this.risk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSegments() {
        return this.segments;
    }

    public final WDUserSelectionModel copy(String risk, int segments) {
        risk.getClass();
        return new WDUserSelectionModel(risk, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDUserSelectionModel)) {
            return false;
        }
        WDUserSelectionModel wDUserSelectionModel = (WDUserSelectionModel) other;
        return Intrinsics.g(this.risk, wDUserSelectionModel.risk) && this.segments == wDUserSelectionModel.segments;
    }

    public final String getRisk() {
        return this.risk;
    }

    public final int getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return Integer.hashCode(this.segments) + (this.risk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDUserSelectionModel(risk=");
        sb.append(this.risk);
        sb.append(", segments=");
        return rr1.b(sb, this.segments, ')');
    }
}

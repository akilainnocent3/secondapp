package com.sportygames.crashInitiated.model.response;

import com.appsflyer.internal.w;
import defpackage.mtg0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/crashInitiated/model/response/CrashInitiatedCoeffListResponse;", "", "houseCoefficient", "", "isWon", "", "isNew", "<init>", "(DZZ)V", "getHouseCoefficient", "()D", "()Z", "setNew", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrashInitiatedCoeffListResponse {
    public static final int $stable = 8;
    private final double houseCoefficient;
    private boolean isNew;
    private final boolean isWon;

    public CrashInitiatedCoeffListResponse(double d, boolean z, boolean z2) {
        this.houseCoefficient = d;
        this.isWon = z;
        this.isNew = z2;
    }

    public static /* synthetic */ CrashInitiatedCoeffListResponse copy$default(CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse, double d, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = crashInitiatedCoeffListResponse.houseCoefficient;
        }
        if ((i & 2) != 0) {
            z = crashInitiatedCoeffListResponse.isWon;
        }
        if ((i & 4) != 0) {
            z2 = crashInitiatedCoeffListResponse.isNew;
        }
        return crashInitiatedCoeffListResponse.copy(d, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWon() {
        return this.isWon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public final CrashInitiatedCoeffListResponse copy(double houseCoefficient, boolean isWon, boolean isNew) {
        return new CrashInitiatedCoeffListResponse(houseCoefficient, isWon, isNew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashInitiatedCoeffListResponse)) {
            return false;
        }
        CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse = (CrashInitiatedCoeffListResponse) other;
        return Double.compare(this.houseCoefficient, crashInitiatedCoeffListResponse.houseCoefficient) == 0 && this.isWon == crashInitiatedCoeffListResponse.isWon && this.isNew == crashInitiatedCoeffListResponse.isNew;
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNew) + mtg0.a(Double.hashCode(this.houseCoefficient) * 31, 31, this.isWon);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final boolean isWon() {
        return this.isWon;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    public String toString() {
        double d = this.houseCoefficient;
        boolean z = this.isWon;
        boolean z2 = this.isNew;
        StringBuilder sb = new StringBuilder("CrashInitiatedCoeffListResponse(houseCoefficient=");
        sb.append(d);
        sb.append(", isWon=");
        sb.append(z);
        return w.a(sb, ", isNew=", z2, ")");
    }
}

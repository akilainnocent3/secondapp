package com.sportygames.rush.model.response;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/sportygames/rush/model/response/RushCoeffListResponse;", "", "houseCoefficient", "", "isWon", "", "<init>", "(DZ)V", "getHouseCoefficient", "()D", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RushCoeffListResponse {
    public static final int $stable = 0;
    private final double houseCoefficient;
    private final boolean isWon;

    public RushCoeffListResponse(double d, boolean z) {
        this.houseCoefficient = d;
        this.isWon = z;
    }

    public static /* synthetic */ RushCoeffListResponse copy$default(RushCoeffListResponse rushCoeffListResponse, double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rushCoeffListResponse.houseCoefficient;
        }
        if ((i & 2) != 0) {
            z = rushCoeffListResponse.isWon;
        }
        return rushCoeffListResponse.copy(d, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWon() {
        return this.isWon;
    }

    public final RushCoeffListResponse copy(double houseCoefficient, boolean isWon) {
        return new RushCoeffListResponse(houseCoefficient, isWon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RushCoeffListResponse)) {
            return false;
        }
        RushCoeffListResponse rushCoeffListResponse = (RushCoeffListResponse) other;
        return Double.compare(this.houseCoefficient, rushCoeffListResponse.houseCoefficient) == 0 && this.isWon == rushCoeffListResponse.isWon;
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isWon) + (Double.hashCode(this.houseCoefficient) * 31);
    }

    public final boolean isWon() {
        return this.isWon;
    }

    public String toString() {
        return "RushCoeffListResponse(houseCoefficient=" + this.houseCoefficient + ", isWon=" + this.isWon + ")";
    }
}

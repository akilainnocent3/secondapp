package com.sportygames.pingpong.remote.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.fwv;
import defpackage.nrg0;
import defpackage.q6a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sportygames/pingpong/remote/models/Coefficients;", "", AnalyticsParam.EVENT_PARAM_ID, "", "houseCoefficient", "", "houseCoefficientStr", "", "<init>", "(JDLjava/lang/String;)V", "getId", "()J", "getHouseCoefficient", "()D", "getHouseCoefficientStr", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Coefficients {
    public static final int $stable = 0;
    private final double houseCoefficient;
    private final String houseCoefficientStr;
    private final long id;

    public Coefficients(long j, double d, String str) {
        str.getClass();
        this.id = j;
        this.houseCoefficient = d;
        this.houseCoefficientStr = str;
    }

    public static /* synthetic */ Coefficients copy$default(Coefficients coefficients, long j, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = coefficients.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = coefficients.houseCoefficient;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str = coefficients.houseCoefficientStr;
        }
        return coefficients.copy(j2, d2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    public final Coefficients copy(long id, double houseCoefficient, String houseCoefficientStr) {
        houseCoefficientStr.getClass();
        return new Coefficients(id, houseCoefficient, houseCoefficientStr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coefficients)) {
            return false;
        }
        Coefficients coefficients = (Coefficients) other;
        return this.id == coefficients.id && Double.compare(this.houseCoefficient, coefficients.houseCoefficient) == 0 && Intrinsics.g(this.houseCoefficientStr, coefficients.houseCoefficientStr);
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return this.houseCoefficientStr.hashCode() + nrg0.a(Long.hashCode(this.id) * 31, 31, this.houseCoefficient);
    }

    public String toString() {
        long j = this.id;
        double d = this.houseCoefficient;
        String str = this.houseCoefficientStr;
        StringBuilder sbA = q6a0.a(j, "Coefficients(id=", ", houseCoefficient=");
        fwv.a(d, ", houseCoefficientStr=", str, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}

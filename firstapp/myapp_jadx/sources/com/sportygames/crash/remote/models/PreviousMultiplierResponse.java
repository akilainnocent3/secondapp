package com.sportygames.crash.remote.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sportygames/crash/remote/models/PreviousMultiplierResponse;", "", "limit", "", "coefficients", "", "Lcom/sportygames/crash/remote/models/Coefficients;", "<init>", "(ILjava/util/List;)V", "getLimit", "()I", "getCoefficients", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PreviousMultiplierResponse {
    public static final int $stable = 8;
    private final List<Coefficients> coefficients;
    private final int limit;

    public PreviousMultiplierResponse(int i, List<Coefficients> list) {
        list.getClass();
        this.limit = i;
        this.coefficients = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviousMultiplierResponse copy$default(PreviousMultiplierResponse previousMultiplierResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = previousMultiplierResponse.limit;
        }
        if ((i2 & 2) != 0) {
            list = previousMultiplierResponse.coefficients;
        }
        return previousMultiplierResponse.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<Coefficients> component2() {
        return this.coefficients;
    }

    public final PreviousMultiplierResponse copy(int limit, List<Coefficients> coefficients) {
        coefficients.getClass();
        return new PreviousMultiplierResponse(limit, coefficients);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviousMultiplierResponse)) {
            return false;
        }
        PreviousMultiplierResponse previousMultiplierResponse = (PreviousMultiplierResponse) other;
        return this.limit == previousMultiplierResponse.limit && Intrinsics.g(this.coefficients, previousMultiplierResponse.coefficients);
    }

    public final List<Coefficients> getCoefficients() {
        return this.coefficients;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return this.coefficients.hashCode() + (Integer.hashCode(this.limit) * 31);
    }

    public String toString() {
        return "PreviousMultiplierResponse(limit=" + this.limit + ", coefficients=" + this.coefficients + ")";
    }
}

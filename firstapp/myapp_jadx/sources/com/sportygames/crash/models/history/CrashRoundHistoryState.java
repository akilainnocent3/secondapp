package com.sportygames.crash.models.history;

import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sportygames/crash/models/history/CrashRoundHistoryState;", "", "previousRoundsList", "Lcom/sportygames/crash/remote/models/PreviousMultiplierResponse;", "lastCoefficient", "Lcom/sportygames/crash/remote/models/Coefficients;", "<init>", "(Lcom/sportygames/crash/remote/models/PreviousMultiplierResponse;Lcom/sportygames/crash/remote/models/Coefficients;)V", "getPreviousRoundsList", "()Lcom/sportygames/crash/remote/models/PreviousMultiplierResponse;", "getLastCoefficient", "()Lcom/sportygames/crash/remote/models/Coefficients;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrashRoundHistoryState {
    public static final int $stable = 8;
    private final Coefficients lastCoefficient;
    private final PreviousMultiplierResponse previousRoundsList;

    public /* synthetic */ CrashRoundHistoryState(PreviousMultiplierResponse previousMultiplierResponse, Coefficients coefficients, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PreviousMultiplierResponse(0, new ArrayList()) : previousMultiplierResponse, (i & 2) != 0 ? new Coefficients(0, 0.0d, null, 0L, 0L, 0L, false, 127, null) : coefficients);
    }

    public static /* synthetic */ CrashRoundHistoryState copy$default(CrashRoundHistoryState crashRoundHistoryState, PreviousMultiplierResponse previousMultiplierResponse, Coefficients coefficients, int i, Object obj) {
        if ((i & 1) != 0) {
            previousMultiplierResponse = crashRoundHistoryState.previousRoundsList;
        }
        if ((i & 2) != 0) {
            coefficients = crashRoundHistoryState.lastCoefficient;
        }
        return crashRoundHistoryState.copy(previousMultiplierResponse, coefficients);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreviousMultiplierResponse getPreviousRoundsList() {
        return this.previousRoundsList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coefficients getLastCoefficient() {
        return this.lastCoefficient;
    }

    public final CrashRoundHistoryState copy(PreviousMultiplierResponse previousRoundsList, Coefficients lastCoefficient) {
        previousRoundsList.getClass();
        lastCoefficient.getClass();
        return new CrashRoundHistoryState(previousRoundsList, lastCoefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashRoundHistoryState)) {
            return false;
        }
        CrashRoundHistoryState crashRoundHistoryState = (CrashRoundHistoryState) other;
        return Intrinsics.g(this.previousRoundsList, crashRoundHistoryState.previousRoundsList) && Intrinsics.g(this.lastCoefficient, crashRoundHistoryState.lastCoefficient);
    }

    public final Coefficients getLastCoefficient() {
        return this.lastCoefficient;
    }

    public final PreviousMultiplierResponse getPreviousRoundsList() {
        return this.previousRoundsList;
    }

    public int hashCode() {
        return this.lastCoefficient.hashCode() + (this.previousRoundsList.hashCode() * 31);
    }

    public String toString() {
        return "CrashRoundHistoryState(previousRoundsList=" + this.previousRoundsList + ", lastCoefficient=" + this.lastCoefficient + ")";
    }

    public CrashRoundHistoryState(PreviousMultiplierResponse previousMultiplierResponse, Coefficients coefficients) {
        previousMultiplierResponse.getClass();
        coefficients.getClass();
        this.previousRoundsList = previousMultiplierResponse;
        this.lastCoefficient = coefficients;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CrashRoundHistoryState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

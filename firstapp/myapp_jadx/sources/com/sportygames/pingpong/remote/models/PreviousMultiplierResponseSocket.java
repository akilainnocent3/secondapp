package com.sportygames.pingpong.remote.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sportygames/pingpong/remote/models/PreviousMultiplierResponseSocket;", "", "data", "Lcom/sportygames/pingpong/remote/models/Coefficients;", "<init>", "(Lcom/sportygames/pingpong/remote/models/Coefficients;)V", "getData", "()Lcom/sportygames/pingpong/remote/models/Coefficients;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PreviousMultiplierResponseSocket {
    public static final int $stable = 0;
    private final Coefficients data;

    public PreviousMultiplierResponseSocket(Coefficients coefficients) {
        coefficients.getClass();
        this.data = coefficients;
    }

    public static /* synthetic */ PreviousMultiplierResponseSocket copy$default(PreviousMultiplierResponseSocket previousMultiplierResponseSocket, Coefficients coefficients, int i, Object obj) {
        if ((i & 1) != 0) {
            coefficients = previousMultiplierResponseSocket.data;
        }
        return previousMultiplierResponseSocket.copy(coefficients);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Coefficients getData() {
        return this.data;
    }

    public final PreviousMultiplierResponseSocket copy(Coefficients data) {
        data.getClass();
        return new PreviousMultiplierResponseSocket(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreviousMultiplierResponseSocket) && Intrinsics.g(this.data, ((PreviousMultiplierResponseSocket) other).data);
    }

    public final Coefficients getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "PreviousMultiplierResponseSocket(data=" + this.data + ")";
    }
}

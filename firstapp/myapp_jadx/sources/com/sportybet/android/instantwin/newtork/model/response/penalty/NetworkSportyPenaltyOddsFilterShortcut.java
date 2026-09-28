package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOddsFilterShortcut;", "", "risky", "", "simple", "<init>", "(FF)V", "getRisky", "()F", "Lcom/google/gson/annotations/SerializedName;", "value", "getSimple", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyOddsFilterShortcut {
    public static final int $stable = 0;

    @SerializedName("risky")
    private final float risky;

    @SerializedName("simple")
    private final float simple;

    public NetworkSportyPenaltyOddsFilterShortcut(float f, float f2) {
        this.risky = f;
        this.simple = f2;
    }

    public static /* synthetic */ NetworkSportyPenaltyOddsFilterShortcut copy$default(NetworkSportyPenaltyOddsFilterShortcut networkSportyPenaltyOddsFilterShortcut, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = networkSportyPenaltyOddsFilterShortcut.risky;
        }
        if ((i & 2) != 0) {
            f2 = networkSportyPenaltyOddsFilterShortcut.simple;
        }
        return networkSportyPenaltyOddsFilterShortcut.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getRisky() {
        return this.risky;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSimple() {
        return this.simple;
    }

    public final NetworkSportyPenaltyOddsFilterShortcut copy(float risky, float simple) {
        return new NetworkSportyPenaltyOddsFilterShortcut(risky, simple);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyOddsFilterShortcut)) {
            return false;
        }
        NetworkSportyPenaltyOddsFilterShortcut networkSportyPenaltyOddsFilterShortcut = (NetworkSportyPenaltyOddsFilterShortcut) other;
        return Float.compare(this.risky, networkSportyPenaltyOddsFilterShortcut.risky) == 0 && Float.compare(this.simple, networkSportyPenaltyOddsFilterShortcut.simple) == 0;
    }

    public final float getRisky() {
        return this.risky;
    }

    public final float getSimple() {
        return this.simple;
    }

    public int hashCode() {
        return Float.hashCode(this.simple) + (Float.hashCode(this.risky) * 31);
    }

    public String toString() {
        return "NetworkSportyPenaltyOddsFilterShortcut(risky=" + this.risky + ", simple=" + this.simple + ")";
    }
}

package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.gpp;
import defpackage.mq0;
import defpackage.zug0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0007HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eÊ\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketAttributes;", "", "hasSpanner", "", "spannerIndex", "", "defaultMarketPoolId", "", "layout", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketLayout;", "combo", "<init>", "(ZILjava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketLayout;Z)V", "getHasSpanner", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getSpannerIndex", "()I", "getDefaultMarketPoolId", "()Ljava/lang/String;", "getLayout", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketLayout;", "getCombo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMarketAttributes {
    public static final int $stable = NetworkScheduledFootballMarketLayout.$stable;

    @SerializedName("combo")
    private final boolean combo;

    @SerializedName("defaultMarketPoolId")
    private final String defaultMarketPoolId;

    @SerializedName("hasSpanner")
    private final boolean hasSpanner;

    @SerializedName("layout")
    private final NetworkScheduledFootballMarketLayout layout;

    @SerializedName("spannerIndex")
    private final int spannerIndex;

    public NetworkScheduledFootballMarketAttributes(boolean z, int i, String str, NetworkScheduledFootballMarketLayout networkScheduledFootballMarketLayout, boolean z2) {
        this.hasSpanner = z;
        this.spannerIndex = i;
        this.defaultMarketPoolId = str;
        this.layout = networkScheduledFootballMarketLayout;
        this.combo = z2;
    }

    public static /* synthetic */ NetworkScheduledFootballMarketAttributes copy$default(NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes, boolean z, int i, String str, NetworkScheduledFootballMarketLayout networkScheduledFootballMarketLayout, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = networkScheduledFootballMarketAttributes.hasSpanner;
        }
        if ((i2 & 2) != 0) {
            i = networkScheduledFootballMarketAttributes.spannerIndex;
        }
        if ((i2 & 4) != 0) {
            str = networkScheduledFootballMarketAttributes.defaultMarketPoolId;
        }
        if ((i2 & 8) != 0) {
            networkScheduledFootballMarketLayout = networkScheduledFootballMarketAttributes.layout;
        }
        if ((i2 & 16) != 0) {
            z2 = networkScheduledFootballMarketAttributes.combo;
        }
        boolean z3 = z2;
        String str2 = str;
        return networkScheduledFootballMarketAttributes.copy(z, i, str2, networkScheduledFootballMarketLayout, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasSpanner() {
        return this.hasSpanner;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSpannerIndex() {
        return this.spannerIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDefaultMarketPoolId() {
        return this.defaultMarketPoolId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NetworkScheduledFootballMarketLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCombo() {
        return this.combo;
    }

    public final NetworkScheduledFootballMarketAttributes copy(boolean hasSpanner, int spannerIndex, String defaultMarketPoolId, NetworkScheduledFootballMarketLayout layout, boolean combo) {
        return new NetworkScheduledFootballMarketAttributes(hasSpanner, spannerIndex, defaultMarketPoolId, layout, combo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMarketAttributes)) {
            return false;
        }
        NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes = (NetworkScheduledFootballMarketAttributes) other;
        return this.hasSpanner == networkScheduledFootballMarketAttributes.hasSpanner && this.spannerIndex == networkScheduledFootballMarketAttributes.spannerIndex && Intrinsics.g(this.defaultMarketPoolId, networkScheduledFootballMarketAttributes.defaultMarketPoolId) && Intrinsics.g(this.layout, networkScheduledFootballMarketAttributes.layout) && this.combo == networkScheduledFootballMarketAttributes.combo;
    }

    public final boolean getCombo() {
        return this.combo;
    }

    public final String getDefaultMarketPoolId() {
        return this.defaultMarketPoolId;
    }

    public final boolean getHasSpanner() {
        return this.hasSpanner;
    }

    public final NetworkScheduledFootballMarketLayout getLayout() {
        return this.layout;
    }

    public final int getSpannerIndex() {
        return this.spannerIndex;
    }

    public int hashCode() {
        int iA = gpp.a(this.spannerIndex, Boolean.hashCode(this.hasSpanner) * 31, 31);
        String str = this.defaultMarketPoolId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        NetworkScheduledFootballMarketLayout networkScheduledFootballMarketLayout = this.layout;
        return Boolean.hashCode(this.combo) + ((iHashCode + (networkScheduledFootballMarketLayout != null ? networkScheduledFootballMarketLayout.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z = this.hasSpanner;
        int i = this.spannerIndex;
        String str = this.defaultMarketPoolId;
        NetworkScheduledFootballMarketLayout networkScheduledFootballMarketLayout = this.layout;
        boolean z2 = this.combo;
        StringBuilder sbA = zug0.a("NetworkScheduledFootballMarketAttributes(hasSpanner=", ", spannerIndex=", ", defaultMarketPoolId=", i, z);
        sbA.append(str);
        sbA.append(", layout=");
        sbA.append(networkScheduledFootballMarketLayout);
        sbA.append(", combo=");
        return mq0.a(sbA, z2, ")");
    }
}

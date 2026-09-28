package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR)\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fÊ\u0001\u0002\b ¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/TierConfig;", "", "currency", "", "game", "", "instantWin", "realSport", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getCurrency", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getGame", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getInstantWin", "getRealSport", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/sporty/android/core/model/welcomereward/TierConfig;", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TierConfig {

    @SerializedName("currency")
    private final String currency;

    @SerializedName("game")
    private final Float game;

    @SerializedName("instantWin")
    private final Float instantWin;

    @SerializedName("realSport")
    private final Float realSport;

    public /* synthetic */ TierConfig(String str, Float f, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : f3);
    }

    public static /* synthetic */ TierConfig copy$default(TierConfig tierConfig, String str, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tierConfig.currency;
        }
        if ((i & 2) != 0) {
            f = tierConfig.game;
        }
        if ((i & 4) != 0) {
            f2 = tierConfig.instantWin;
        }
        if ((i & 8) != 0) {
            f3 = tierConfig.realSport;
        }
        return tierConfig.copy(str, f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getGame() {
        return this.game;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getInstantWin() {
        return this.instantWin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getRealSport() {
        return this.realSport;
    }

    public final TierConfig copy(String currency, Float game, Float instantWin, Float realSport) {
        return new TierConfig(currency, game, instantWin, realSport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TierConfig)) {
            return false;
        }
        TierConfig tierConfig = (TierConfig) other;
        return Intrinsics.g(this.currency, tierConfig.currency) && Intrinsics.g(this.game, tierConfig.game) && Intrinsics.g(this.instantWin, tierConfig.instantWin) && Intrinsics.g(this.realSport, tierConfig.realSport);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Float getGame() {
        return this.game;
    }

    public final Float getInstantWin() {
        return this.instantWin;
    }

    public final Float getRealSport() {
        return this.realSport;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.game;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.instantWin;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.realSport;
        return iHashCode3 + (f3 != null ? f3.hashCode() : 0);
    }

    public String toString() {
        return "TierConfig(currency=" + this.currency + ", game=" + this.game + ", instantWin=" + this.instantWin + ", realSport=" + this.realSport + ")";
    }

    public TierConfig(String str, Float f, Float f2, Float f3) {
        this.currency = str;
        this.game = f;
        this.instantWin = f2;
        this.realSport = f3;
    }

    public TierConfig() {
        this(null, null, null, null, 15, null);
    }
}

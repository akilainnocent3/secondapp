package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.gpp;
import defpackage.ka1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMultiBetBonus;", "", "enable", "", "qualifyingOddsLimit", "", "minSelections", "", "maxSelections", "bonusRatios", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMultiBetBonusBonusRatio;", "<init>", "(ZJIILjava/util/List;)V", "getEnable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getQualifyingOddsLimit", "()J", "getMinSelections", "()I", "getMaxSelections", "getBonusRatios", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingMultiBetBonus {
    public static final int $stable = 8;

    @SerializedName("bonusRatios")
    private final List<NetworkInstantRacingMultiBetBonusBonusRatio> bonusRatios;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("maxSelections")
    private final int maxSelections;

    @SerializedName("minSelections")
    private final int minSelections;

    @SerializedName("qualifyingOddsLimit")
    private final long qualifyingOddsLimit;

    public NetworkInstantRacingMultiBetBonus(boolean z, long j, int i, int i2, List<NetworkInstantRacingMultiBetBonusBonusRatio> list) {
        this.enable = z;
        this.qualifyingOddsLimit = j;
        this.minSelections = i;
        this.maxSelections = i2;
        this.bonusRatios = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingMultiBetBonus copy$default(NetworkInstantRacingMultiBetBonus networkInstantRacingMultiBetBonus, boolean z, long j, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = networkInstantRacingMultiBetBonus.enable;
        }
        if ((i3 & 2) != 0) {
            j = networkInstantRacingMultiBetBonus.qualifyingOddsLimit;
        }
        if ((i3 & 4) != 0) {
            i = networkInstantRacingMultiBetBonus.minSelections;
        }
        if ((i3 & 8) != 0) {
            i2 = networkInstantRacingMultiBetBonus.maxSelections;
        }
        if ((i3 & 16) != 0) {
            list = networkInstantRacingMultiBetBonus.bonusRatios;
        }
        List list2 = list;
        int i4 = i;
        return networkInstantRacingMultiBetBonus.copy(z, j, i4, i2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinSelections() {
        return this.minSelections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxSelections() {
        return this.maxSelections;
    }

    public final List<NetworkInstantRacingMultiBetBonusBonusRatio> component5() {
        return this.bonusRatios;
    }

    public final NetworkInstantRacingMultiBetBonus copy(boolean enable, long qualifyingOddsLimit, int minSelections, int maxSelections, List<NetworkInstantRacingMultiBetBonusBonusRatio> bonusRatios) {
        return new NetworkInstantRacingMultiBetBonus(enable, qualifyingOddsLimit, minSelections, maxSelections, bonusRatios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingMultiBetBonus)) {
            return false;
        }
        NetworkInstantRacingMultiBetBonus networkInstantRacingMultiBetBonus = (NetworkInstantRacingMultiBetBonus) other;
        return this.enable == networkInstantRacingMultiBetBonus.enable && this.qualifyingOddsLimit == networkInstantRacingMultiBetBonus.qualifyingOddsLimit && this.minSelections == networkInstantRacingMultiBetBonus.minSelections && this.maxSelections == networkInstantRacingMultiBetBonus.maxSelections && Intrinsics.g(this.bonusRatios, networkInstantRacingMultiBetBonus.bonusRatios);
    }

    public final List<NetworkInstantRacingMultiBetBonusBonusRatio> getBonusRatios() {
        return this.bonusRatios;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getMaxSelections() {
        return this.maxSelections;
    }

    public final int getMinSelections() {
        return this.minSelections;
    }

    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    public int hashCode() {
        int iA = gpp.a(this.maxSelections, gpp.a(this.minSelections, f87.a(Boolean.hashCode(this.enable) * 31, this.qualifyingOddsLimit, 31), 31), 31);
        List<NetworkInstantRacingMultiBetBonusBonusRatio> list = this.bonusRatios;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z = this.enable;
        long j = this.qualifyingOddsLimit;
        int i = this.minSelections;
        int i2 = this.maxSelections;
        List<NetworkInstantRacingMultiBetBonusBonusRatio> list = this.bonusRatios;
        StringBuilder sb = new StringBuilder("NetworkInstantRacingMultiBetBonus(enable=");
        sb.append(z);
        sb.append(", qualifyingOddsLimit=");
        sb.append(j);
        sb.append(", minSelections=");
        sb.append(i);
        sb.append(", maxSelections=");
        sb.append(i2);
        return ka1.a(sb, ", bonusRatios=", list, ")");
    }
}

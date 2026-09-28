package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.gpp;
import defpackage.zug0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballDynamicMultiBetBonus;", "", "enable", "", "factor", "", "qualifyingOddsLimit", "", "bonusRatios", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballDynamicMultiBetBonusBonusRatio;", "<init>", "(ZIJLjava/util/List;)V", "getEnable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getFactor", "()I", "getQualifyingOddsLimit", "()J", "getBonusRatios", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballDynamicMultiBetBonus {
    public static final int $stable = 8;

    @SerializedName("bonusRatios")
    private final List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> bonusRatios;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("factor")
    private final int factor;

    @SerializedName("qualifyingOddsLimit")
    private final long qualifyingOddsLimit;

    public NetworkScheduledFootballDynamicMultiBetBonus(boolean z, int i, long j, List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> list) {
        this.enable = z;
        this.factor = i;
        this.qualifyingOddsLimit = j;
        this.bonusRatios = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballDynamicMultiBetBonus copy$default(NetworkScheduledFootballDynamicMultiBetBonus networkScheduledFootballDynamicMultiBetBonus, boolean z, int i, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = networkScheduledFootballDynamicMultiBetBonus.enable;
        }
        if ((i2 & 2) != 0) {
            i = networkScheduledFootballDynamicMultiBetBonus.factor;
        }
        if ((i2 & 4) != 0) {
            j = networkScheduledFootballDynamicMultiBetBonus.qualifyingOddsLimit;
        }
        if ((i2 & 8) != 0) {
            list = networkScheduledFootballDynamicMultiBetBonus.bonusRatios;
        }
        List list2 = list;
        return networkScheduledFootballDynamicMultiBetBonus.copy(z, i, j, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFactor() {
        return this.factor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    public final List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> component4() {
        return this.bonusRatios;
    }

    public final NetworkScheduledFootballDynamicMultiBetBonus copy(boolean enable, int factor, long qualifyingOddsLimit, List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> bonusRatios) {
        return new NetworkScheduledFootballDynamicMultiBetBonus(enable, factor, qualifyingOddsLimit, bonusRatios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballDynamicMultiBetBonus)) {
            return false;
        }
        NetworkScheduledFootballDynamicMultiBetBonus networkScheduledFootballDynamicMultiBetBonus = (NetworkScheduledFootballDynamicMultiBetBonus) other;
        return this.enable == networkScheduledFootballDynamicMultiBetBonus.enable && this.factor == networkScheduledFootballDynamicMultiBetBonus.factor && this.qualifyingOddsLimit == networkScheduledFootballDynamicMultiBetBonus.qualifyingOddsLimit && Intrinsics.g(this.bonusRatios, networkScheduledFootballDynamicMultiBetBonus.bonusRatios);
    }

    public final List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> getBonusRatios() {
        return this.bonusRatios;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getFactor() {
        return this.factor;
    }

    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    public int hashCode() {
        int iA = f87.a(gpp.a(this.factor, Boolean.hashCode(this.enable) * 31, 31), this.qualifyingOddsLimit, 31);
        List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> list = this.bonusRatios;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z = this.enable;
        int i = this.factor;
        long j = this.qualifyingOddsLimit;
        List<NetworkScheduledFootballDynamicMultiBetBonusBonusRatio> list = this.bonusRatios;
        StringBuilder sbA = zug0.a("NetworkScheduledFootballDynamicMultiBetBonus(enable=", ", factor=", ", qualifyingOddsLimit=", i, z);
        sbA.append(j);
        sbA.append(", bonusRatios=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}

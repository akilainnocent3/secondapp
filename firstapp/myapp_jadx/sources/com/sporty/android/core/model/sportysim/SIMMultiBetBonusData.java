package com.sporty.android.core.model.sportysim;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.m2g;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/sportysim/SIMMultiBetBonusData;", "", "enable", "", "factor", "", "qualifyingOddsLimit", "bonusRatios", "", "Lcom/sporty/android/core/model/sportysim/SimBonusRatiosData;", "<init>", "(ZJJLjava/util/List;)V", "getEnable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getFactor", "()J", "getQualifyingOddsLimit", "getBonusRatios", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SIMMultiBetBonusData {

    @SerializedName("bonusRatios")
    private final List<SimBonusRatiosData> bonusRatios;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("factor")
    private final long factor;

    @SerializedName("qualifyingOddsLimit")
    private final long qualifyingOddsLimit;

    public SIMMultiBetBonusData(boolean z, long j, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SIMMultiBetBonusData copy$default(SIMMultiBetBonusData sIMMultiBetBonusData, boolean z, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sIMMultiBetBonusData.enable;
        }
        if ((i & 2) != 0) {
            j = sIMMultiBetBonusData.factor;
        }
        if ((i & 4) != 0) {
            j2 = sIMMultiBetBonusData.qualifyingOddsLimit;
        }
        if ((i & 8) != 0) {
            list = sIMMultiBetBonusData.bonusRatios;
        }
        List list2 = list;
        return sIMMultiBetBonusData.copy(z, j, j2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFactor() {
        return this.factor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    public final List<SimBonusRatiosData> component4() {
        return this.bonusRatios;
    }

    public final SIMMultiBetBonusData copy(boolean enable, long factor, long qualifyingOddsLimit, List<SimBonusRatiosData> bonusRatios) {
        return new SIMMultiBetBonusData(enable, factor, qualifyingOddsLimit, bonusRatios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIMMultiBetBonusData)) {
            return false;
        }
        SIMMultiBetBonusData sIMMultiBetBonusData = (SIMMultiBetBonusData) other;
        return this.enable == sIMMultiBetBonusData.enable && this.factor == sIMMultiBetBonusData.factor && this.qualifyingOddsLimit == sIMMultiBetBonusData.qualifyingOddsLimit && Intrinsics.g(this.bonusRatios, sIMMultiBetBonusData.bonusRatios);
    }

    public final List<SimBonusRatiosData> getBonusRatios() {
        return this.bonusRatios;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getFactor() {
        return this.factor;
    }

    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    public int hashCode() {
        int iA = f87.a(f87.a(Boolean.hashCode(this.enable) * 31, this.factor, 31), this.qualifyingOddsLimit, 31);
        List<SimBonusRatiosData> list = this.bonusRatios;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        boolean z = this.enable;
        long j = this.factor;
        long j2 = this.qualifyingOddsLimit;
        List<SimBonusRatiosData> list = this.bonusRatios;
        StringBuilder sb = new StringBuilder("SIMMultiBetBonusData(enable=");
        sb.append(z);
        sb.append(", factor=");
        sb.append(j);
        g41.a(j2, ", qualifyingOddsLimit=", ", bonusRatios=", sb);
        return ng1.a(sb, list, ")");
    }

    public SIMMultiBetBonusData(boolean z, long j, long j2, List<SimBonusRatiosData> list) {
        this.enable = z;
        this.factor = j;
        this.qualifyingOddsLimit = j2;
        this.bonusRatios = list;
    }

    public SIMMultiBetBonusData() {
        this(false, 0L, 0L, null, 15, null);
    }
}

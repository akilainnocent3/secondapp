package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.geo;
import defpackage.gpp;
import defpackage.zug0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006#"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;", "", "enable", "", "factor", "", "qualifyingOddsLimit", "", "bonusRatios", "", "Lcom/sportybet/android/instantwin/newtork/model/response/BonusRatio;", "<init>", "(ZIJLjava/util/List;)V", "getEnable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getFactor", "()I", "getQualifyingOddsLimit", "()J", "getBonusRatios", "()Ljava/util/List;", "getOddsThreshold", "Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DynamicMultiBetBonus {
    public static final int $stable = 8;

    @SerializedName("bonusRatios")
    private final List<BonusRatio> bonusRatios;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("factor")
    private final int factor;

    @SerializedName("qualifyingOddsLimit")
    private final long qualifyingOddsLimit;

    public DynamicMultiBetBonus(boolean z, int i, long j, List<BonusRatio> list) {
        list.getClass();
        this.enable = z;
        this.factor = i;
        this.qualifyingOddsLimit = j;
        this.bonusRatios = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicMultiBetBonus copy$default(DynamicMultiBetBonus dynamicMultiBetBonus, boolean z, int i, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dynamicMultiBetBonus.enable;
        }
        if ((i2 & 2) != 0) {
            i = dynamicMultiBetBonus.factor;
        }
        if ((i2 & 4) != 0) {
            j = dynamicMultiBetBonus.qualifyingOddsLimit;
        }
        if ((i2 & 8) != 0) {
            list = dynamicMultiBetBonus.bonusRatios;
        }
        List list2 = list;
        return dynamicMultiBetBonus.copy(z, i, j, list2);
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

    public final List<BonusRatio> component4() {
        return this.bonusRatios;
    }

    public final DynamicMultiBetBonus copy(boolean enable, int factor, long qualifyingOddsLimit, List<BonusRatio> bonusRatios) {
        bonusRatios.getClass();
        return new DynamicMultiBetBonus(enable, factor, qualifyingOddsLimit, bonusRatios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicMultiBetBonus)) {
            return false;
        }
        DynamicMultiBetBonus dynamicMultiBetBonus = (DynamicMultiBetBonus) other;
        return this.enable == dynamicMultiBetBonus.enable && this.factor == dynamicMultiBetBonus.factor && this.qualifyingOddsLimit == dynamicMultiBetBonus.qualifyingOddsLimit && Intrinsics.g(this.bonusRatios, dynamicMultiBetBonus.bonusRatios);
    }

    public final List<BonusRatio> getBonusRatios() {
        return this.bonusRatios;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getFactor() {
        return this.factor;
    }

    public final BigDecimal getOddsThreshold() {
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(this.qualifyingOddsLimit).divide(geo.a, 2, RoundingMode.HALF_UP);
        bigDecimalDivide.getClass();
        return bigDecimalDivide;
    }

    public final long getQualifyingOddsLimit() {
        return this.qualifyingOddsLimit;
    }

    public int hashCode() {
        return this.bonusRatios.hashCode() + f87.a(gpp.a(this.factor, Boolean.hashCode(this.enable) * 31, 31), this.qualifyingOddsLimit, 31);
    }

    public String toString() {
        boolean z = this.enable;
        int i = this.factor;
        long j = this.qualifyingOddsLimit;
        List<BonusRatio> list = this.bonusRatios;
        StringBuilder sbA = zug0.a("DynamicMultiBetBonus(enable=", ", factor=", ", qualifyingOddsLimit=", i, z);
        sbA.append(j);
        sbA.append(", bonusRatios=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}

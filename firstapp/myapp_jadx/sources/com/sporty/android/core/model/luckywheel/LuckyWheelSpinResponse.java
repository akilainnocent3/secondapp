package com.sporty.android.core.model.luckywheel;

import defpackage.b7f;
import defpackage.gpp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelSpinResponse;", "", "colorName", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelColor;", "areaAmount", "", "prizeAmount", "prizeType", "<init>", "(Lcom/sporty/android/core/model/luckywheel/LuckyWheelColor;III)V", "getColorName", "()Lcom/sporty/android/core/model/luckywheel/LuckyWheelColor;", "getAreaAmount", "()I", "getPrizeAmount", "getPrizeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LuckyWheelSpinResponse {
    private final int areaAmount;
    private final LuckyWheelColor colorName;
    private final int prizeAmount;
    private final int prizeType;

    public LuckyWheelSpinResponse(LuckyWheelColor luckyWheelColor, int i, int i2, int i3) {
        luckyWheelColor.getClass();
        this.colorName = luckyWheelColor;
        this.areaAmount = i;
        this.prizeAmount = i2;
        this.prizeType = i3;
    }

    public static /* synthetic */ LuckyWheelSpinResponse copy$default(LuckyWheelSpinResponse luckyWheelSpinResponse, LuckyWheelColor luckyWheelColor, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            luckyWheelColor = luckyWheelSpinResponse.colorName;
        }
        if ((i4 & 2) != 0) {
            i = luckyWheelSpinResponse.areaAmount;
        }
        if ((i4 & 4) != 0) {
            i2 = luckyWheelSpinResponse.prizeAmount;
        }
        if ((i4 & 8) != 0) {
            i3 = luckyWheelSpinResponse.prizeType;
        }
        return luckyWheelSpinResponse.copy(luckyWheelColor, i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LuckyWheelColor getColorName() {
        return this.colorName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAreaAmount() {
        return this.areaAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPrizeAmount() {
        return this.prizeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPrizeType() {
        return this.prizeType;
    }

    public final LuckyWheelSpinResponse copy(LuckyWheelColor colorName, int areaAmount, int prizeAmount, int prizeType) {
        colorName.getClass();
        return new LuckyWheelSpinResponse(colorName, areaAmount, prizeAmount, prizeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuckyWheelSpinResponse)) {
            return false;
        }
        LuckyWheelSpinResponse luckyWheelSpinResponse = (LuckyWheelSpinResponse) other;
        return this.colorName == luckyWheelSpinResponse.colorName && this.areaAmount == luckyWheelSpinResponse.areaAmount && this.prizeAmount == luckyWheelSpinResponse.prizeAmount && this.prizeType == luckyWheelSpinResponse.prizeType;
    }

    public final int getAreaAmount() {
        return this.areaAmount;
    }

    public final LuckyWheelColor getColorName() {
        return this.colorName;
    }

    public final int getPrizeAmount() {
        return this.prizeAmount;
    }

    public final int getPrizeType() {
        return this.prizeType;
    }

    public int hashCode() {
        return Integer.hashCode(this.prizeType) + gpp.a(this.prizeAmount, gpp.a(this.areaAmount, this.colorName.hashCode() * 31, 31), 31);
    }

    public String toString() {
        LuckyWheelColor luckyWheelColor = this.colorName;
        int i = this.areaAmount;
        int i2 = this.prizeAmount;
        int i3 = this.prizeType;
        StringBuilder sb = new StringBuilder("LuckyWheelSpinResponse(colorName=");
        sb.append(luckyWheelColor);
        sb.append(", areaAmount=");
        sb.append(i);
        sb.append(", prizeAmount=");
        return b7f.a(sb, i2, ", prizeType=", i3, ")");
    }
}

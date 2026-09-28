package com.sportygames.crash.models;

import defpackage.ffp;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sportygames/crash/models/ChipData;", "", "chipValue", "", "currentBet", "isSelected", "", "<init>", "(DDZ)V", "getChipValue", "()D", "getCurrentBet", "setCurrentBet", "(D)V", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChipData {
    public static final int $stable = 8;
    private final double chipValue;
    private double currentBet;
    private boolean isSelected;

    public /* synthetic */ ChipData(double d, double d2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? false : z);
    }

    public static /* synthetic */ ChipData copy$default(ChipData chipData, double d, double d2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = chipData.chipValue;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = chipData.currentBet;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            z = chipData.isSelected;
        }
        return chipData.copy(d3, d4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getChipValue() {
        return this.chipValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getCurrentBet() {
        return this.currentBet;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final ChipData copy(double chipValue, double currentBet, boolean isSelected) {
        return new ChipData(chipValue, currentBet, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipData)) {
            return false;
        }
        ChipData chipData = (ChipData) other;
        return Double.compare(this.chipValue, chipData.chipValue) == 0 && Double.compare(this.currentBet, chipData.currentBet) == 0 && this.isSelected == chipData.isSelected;
    }

    public final double getChipValue() {
        return this.chipValue;
    }

    public final double getCurrentBet() {
        return this.currentBet;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + nrg0.a(Double.hashCode(this.chipValue) * 31, 31, this.currentBet);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCurrentBet(double d) {
        this.currentBet = d;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        double d = this.chipValue;
        double d2 = this.currentBet;
        boolean z = this.isSelected;
        StringBuilder sbA = ffp.a(d, "ChipData(chipValue=", ", currentBet=");
        sbA.append(d2);
        sbA.append(", isSelected=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    public ChipData(double d, double d2, boolean z) {
        this.chipValue = d;
        this.currentBet = d2;
        this.isSelected = z;
    }
}

package com.sportygames.commons.models;

import defpackage.gmf0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/sportygames/commons/models/BetChipItem;", "", "betAmount", "", "chipColor", "", "betAmountDisplay", "isEnabled", "", "<init>", "(DLjava/lang/String;Ljava/lang/String;Z)V", "getBetAmount", "()D", "getChipColor", "()Ljava/lang/String;", "setChipColor", "(Ljava/lang/String;)V", "getBetAmountDisplay", "()Z", "setEnabled", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetChipItem {
    public static final int $stable = 8;
    private final double betAmount;
    private final String betAmountDisplay;
    private String chipColor;
    private boolean isEnabled;

    public BetChipItem(double d, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.betAmount = d;
        this.chipColor = str;
        this.betAmountDisplay = str2;
        this.isEnabled = z;
    }

    public static /* synthetic */ BetChipItem copy$default(BetChipItem betChipItem, double d, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = betChipItem.betAmount;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = betChipItem.chipColor;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = betChipItem.betAmountDisplay;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = betChipItem.isEnabled;
        }
        return betChipItem.copy(d2, str3, str4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChipColor() {
        return this.chipColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetAmountDisplay() {
        return this.betAmountDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final BetChipItem copy(double betAmount, String chipColor, String betAmountDisplay, boolean isEnabled) {
        chipColor.getClass();
        betAmountDisplay.getClass();
        return new BetChipItem(betAmount, chipColor, betAmountDisplay, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetChipItem)) {
            return false;
        }
        BetChipItem betChipItem = (BetChipItem) other;
        return Double.compare(this.betAmount, betChipItem.betAmount) == 0 && Intrinsics.g(this.chipColor, betChipItem.chipColor) && Intrinsics.g(this.betAmountDisplay, betChipItem.betAmountDisplay) && this.isEnabled == betChipItem.isEnabled;
    }

    public final double getBetAmount() {
        return this.betAmount;
    }

    public final String getBetAmountDisplay() {
        return this.betAmountDisplay;
    }

    public final String getChipColor() {
        return this.chipColor;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled) + gmf0.a(gmf0.a(Double.hashCode(this.betAmount) * 31, 31, this.chipColor), 31, this.betAmountDisplay);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setChipColor(String str) {
        str.getClass();
        this.chipColor = str;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public String toString() {
        return "BetChipItem(betAmount=" + this.betAmount + ", chipColor=" + this.chipColor + ", betAmountDisplay=" + this.betAmountDisplay + ", isEnabled=" + this.isEnabled + ")";
    }

    public /* synthetic */ BetChipItem(double d, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, (i & 8) != 0 ? false : z);
    }
}

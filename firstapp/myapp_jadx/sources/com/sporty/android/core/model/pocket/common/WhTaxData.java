package com.sporty.android.core.model.pocket.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.gpp;
import defpackage.zug;
import defpackage.zug0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0005J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005R$\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0092\u0002\u0002\b\u000e¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004\u0092\u0002\u0002\b\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0092\u0002\u0002\b\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\b\u0092\u0002\u0002\b\u000e¢\u0006\u0002\n\u0000Ê\u0001\u0002\b$Ê\u0001\u0002\b%¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/WhTaxData;", "Landroid/os/Parcelable;", "isActive", "", "effectiveDays", "", "percentage", "", "deductibleStake", "<init>", "(ZIJJ)V", "Lcom/google/gson/annotations/SerializedName;", "value", "active", "Lkotlin/jvm/JvmField;", "calculateWhTax", "Ljava/math/BigDecimal;", "amount", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WhTaxData implements Parcelable {
    public static final Parcelable.Creator<WhTaxData> CREATOR = new Creator();

    @SerializedName("deductibleStake")
    public final long deductibleStake;

    @SerializedName("effectiveDays")
    public final int effectiveDays;

    @SerializedName("active")
    public final boolean isActive;

    @SerializedName("percentage")
    public final long percentage;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WhTaxData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhTaxData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WhTaxData(parcel.readInt() != 0, parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhTaxData[] newArray(int i) {
            return new WhTaxData[i];
        }
    }

    public /* synthetic */ WhTaxData(boolean z, int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0L : j2);
    }

    public static /* synthetic */ WhTaxData copy$default(WhTaxData whTaxData, boolean z, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = whTaxData.isActive;
        }
        if ((i2 & 2) != 0) {
            i = whTaxData.effectiveDays;
        }
        if ((i2 & 4) != 0) {
            j = whTaxData.percentage;
        }
        if ((i2 & 8) != 0) {
            j2 = whTaxData.deductibleStake;
        }
        long j3 = j2;
        return whTaxData.copy(z, i, j, j3);
    }

    public final BigDecimal calculateWhTax(String amount) {
        amount.getClass();
        if (!this.isActive) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            return bigDecimal;
        }
        try {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.deductibleStake);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, 2, roundingMode);
            bigDecimalDivide.getClass();
            BigDecimal bigDecimalSubtract = new BigDecimal(amount).subtract(bigDecimalDivide);
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimalSubtract.compareTo(bigDecimal2) <= 0) {
                bigDecimal2.getClass();
                return bigDecimal2;
            }
            BigDecimal scale = bigDecimalSubtract.multiply(BigDecimal.valueOf(this.percentage).divide(BigDecimal.valueOf(10000L).multiply(BigDecimal.valueOf(100L)), 2, roundingMode)).setScale(2, RoundingMode.CEILING);
            scale.getClass();
            return scale;
        } catch (Exception unused) {
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            bigDecimal3.getClass();
            return bigDecimal3;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEffectiveDays() {
        return this.effectiveDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDeductibleStake() {
        return this.deductibleStake;
    }

    public final WhTaxData copy(boolean isActive, int effectiveDays, long percentage, long deductibleStake) {
        return new WhTaxData(isActive, effectiveDays, percentage, deductibleStake);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhTaxData)) {
            return false;
        }
        WhTaxData whTaxData = (WhTaxData) other;
        return this.isActive == whTaxData.isActive && this.effectiveDays == whTaxData.effectiveDays && this.percentage == whTaxData.percentage && this.deductibleStake == whTaxData.deductibleStake;
    }

    public int hashCode() {
        return Long.hashCode(this.deductibleStake) + f87.a(gpp.a(this.effectiveDays, Boolean.hashCode(this.isActive) * 31, 31), this.percentage, 31);
    }

    public String toString() {
        boolean z = this.isActive;
        int i = this.effectiveDays;
        long j = this.percentage;
        long j2 = this.deductibleStake;
        StringBuilder sbA = zug0.a("WhTaxData(isActive=", ", effectiveDays=", ", percentage=", i, z);
        sbA.append(j);
        return zug.a(j2, ", deductibleStake=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeInt(this.effectiveDays);
        dest.writeLong(this.percentage);
        dest.writeLong(this.deductibleStake);
    }

    public WhTaxData(boolean z, int i, long j, long j2) {
        this.isActive = z;
        this.effectiveDays = i;
        this.percentage = j;
        this.deductibleStake = j2;
    }

    public WhTaxData() {
        this(false, 0, 0L, 0L, 15, null);
    }
}

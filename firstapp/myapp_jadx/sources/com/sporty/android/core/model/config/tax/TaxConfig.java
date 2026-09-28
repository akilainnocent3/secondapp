package com.sporty.android.core.model.config.tax;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.MyLog;
import defpackage.hib0;
import defpackage.iib0;
import defpackage.itf0;
import defpackage.nrg0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00011B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0006\u0010%\u001a\u00020\u0003J\u0014\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eÊ\u0001\u0002\b3¨\u00062"}, d2 = {"Lcom/sporty/android/core/model/config/tax/TaxConfig;", "Landroid/os/Parcelable;", "type", "", "rate", "", "exciseTaxRateToShow", "exciseTaxRateToCharge", "exciseTaxRateToBonus", "<init>", "(IDDDD)V", "getType", "()I", "getRate", "()D", "getExciseTaxRateToShow", "getExciseTaxRateToCharge", "getExciseTaxRateToBonus", "isNetType", "", "hasRate", "hasExciseTaxRate", "getRateAsPercentage", "getExciseTax", "Ljava/math/BigDecimal;", "stake", "getChargeExciseTax", "getBonusExciseTax", "getTax", "potWin", "getNetWin", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TaxConfig implements Parcelable {
    private final double exciseTaxRateToBonus;
    private final double exciseTaxRateToCharge;
    private final double exciseTaxRateToShow;
    private final double rate;
    private final int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<TaxConfig> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005H\u0007b\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/core/model/config/tax/TaxConfig$Companion;", "", "<init>", "()V", "getDefault", "Lcom/sporty/android/core/model/config/tax/TaxConfig;", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TaxConfig getDefault() {
            return new TaxConfig(0, 0.0d, 0.0d, 0.0d, 0.0d);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TaxConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxConfig createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TaxConfig(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxConfig[] newArray(int i) {
            return new TaxConfig[i];
        }
    }

    public /* synthetic */ TaxConfig(int i, double d, double d2, double d3, double d4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, d, d2, d3, d4);
    }

    public static /* synthetic */ TaxConfig copy$default(TaxConfig taxConfig, int i, double d, double d2, double d3, double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = taxConfig.type;
        }
        if ((i2 & 2) != 0) {
            d = taxConfig.rate;
        }
        if ((i2 & 4) != 0) {
            d2 = taxConfig.exciseTaxRateToShow;
        }
        if ((i2 & 8) != 0) {
            d3 = taxConfig.exciseTaxRateToCharge;
        }
        if ((i2 & 16) != 0) {
            d4 = taxConfig.exciseTaxRateToBonus;
        }
        double d5 = d4;
        double d6 = d3;
        return taxConfig.copy(i, d, d2, d6, d5);
    }

    public static final TaxConfig getDefault() {
        return INSTANCE.getDefault();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getExciseTaxRateToShow() {
        return this.exciseTaxRateToShow;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getExciseTaxRateToCharge() {
        return this.exciseTaxRateToCharge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getExciseTaxRateToBonus() {
        return this.exciseTaxRateToBonus;
    }

    public final TaxConfig copy(int type, double rate, double exciseTaxRateToShow, double exciseTaxRateToCharge, double exciseTaxRateToBonus) {
        return new TaxConfig(type, rate, exciseTaxRateToShow, exciseTaxRateToCharge, exciseTaxRateToBonus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxConfig)) {
            return false;
        }
        TaxConfig taxConfig = (TaxConfig) other;
        return this.type == taxConfig.type && Double.compare(this.rate, taxConfig.rate) == 0 && Double.compare(this.exciseTaxRateToShow, taxConfig.exciseTaxRateToShow) == 0 && Double.compare(this.exciseTaxRateToCharge, taxConfig.exciseTaxRateToCharge) == 0 && Double.compare(this.exciseTaxRateToBonus, taxConfig.exciseTaxRateToBonus) == 0;
    }

    public final BigDecimal getBonusExciseTax(BigDecimal stake) {
        stake.getClass();
        BigDecimal bigDecimalMultiply = stake.multiply(new BigDecimal(String.valueOf(this.exciseTaxRateToBonus)));
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public final BigDecimal getChargeExciseTax(BigDecimal stake) {
        stake.getClass();
        BigDecimal bigDecimalMultiply = stake.multiply(new BigDecimal(String.valueOf(this.exciseTaxRateToCharge)));
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public final BigDecimal getExciseTax(BigDecimal stake) {
        stake.getClass();
        BigDecimal bigDecimalMultiply = stake.multiply(new BigDecimal(String.valueOf(this.exciseTaxRateToShow)));
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public final double getExciseTaxRateToBonus() {
        return this.exciseTaxRateToBonus;
    }

    public final double getExciseTaxRateToCharge() {
        return this.exciseTaxRateToCharge;
    }

    public final double getExciseTaxRateToShow() {
        return this.exciseTaxRateToShow;
    }

    public final BigDecimal getNetWin(BigDecimal potWin, BigDecimal stake) {
        potWin.getClass();
        stake.getClass();
        BigDecimal tax = getTax(potWin, stake);
        BigDecimal scale = potWin.subtract(tax).setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        int i = this.type;
        StringBuilder sb = new StringBuilder("[getNetWin] type = ");
        sb.append(i);
        sb.append(", wh tax = ");
        sb.append(tax);
        sb.append(", net win = ");
        iib0.b(sb, scale, ", pt win = ", potWin, ", stake = ");
        sb.append(stake);
        aVar.g(sb.toString(), new Object[0]);
        return scale;
    }

    public final double getRate() {
        return this.rate;
    }

    public final int getRateAsPercentage() {
        return (int) (this.rate * 100.0d);
    }

    public final BigDecimal getTax(BigDecimal potWin, BigDecimal stake) {
        BigDecimal bigDecimalMultiply;
        potWin.getClass();
        stake.getClass();
        int i = this.type;
        if (i == 1) {
            bigDecimalMultiply = potWin.multiply(new BigDecimal(String.valueOf(this.rate)));
            bigDecimalMultiply.getClass();
        } else if (i != 2) {
            bigDecimalMultiply = BigDecimal.ZERO;
            bigDecimalMultiply.getClass();
        } else {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.g("[NET] type = " + this.type + ", rate = " + this.rate, new Object[0]);
            bigDecimalMultiply = potWin.subtract(stake).multiply(new BigDecimal(String.valueOf(this.rate)));
            bigDecimalMultiply.getClass();
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalMultiply.compareTo(bigDecimal) >= 0) {
            return bigDecimalMultiply;
        }
        bigDecimal.getClass();
        return bigDecimal;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean hasExciseTaxRate() {
        return !(this.exciseTaxRateToShow == 0.0d);
    }

    public final boolean hasRate() {
        return !(this.rate == 0.0d);
    }

    public int hashCode() {
        return Double.hashCode(this.exciseTaxRateToBonus) + nrg0.a(nrg0.a(nrg0.a(Integer.hashCode(this.type) * 31, 31, this.rate), 31, this.exciseTaxRateToShow), 31, this.exciseTaxRateToCharge);
    }

    public final boolean isNetType() {
        return 2 == this.type;
    }

    public String toString() {
        int i = this.type;
        double d = this.rate;
        double d2 = this.exciseTaxRateToShow;
        double d3 = this.exciseTaxRateToCharge;
        double d4 = this.exciseTaxRateToBonus;
        StringBuilder sb = new StringBuilder("TaxConfig(type=");
        sb.append(i);
        sb.append(", rate=");
        sb.append(d);
        hib0.b(d2, ", exciseTaxRateToShow=", ", exciseTaxRateToCharge=", sb);
        sb.append(d3);
        sb.append(", exciseTaxRateToBonus=");
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.type);
        dest.writeDouble(this.rate);
        dest.writeDouble(this.exciseTaxRateToShow);
        dest.writeDouble(this.exciseTaxRateToCharge);
        dest.writeDouble(this.exciseTaxRateToBonus);
    }

    public TaxConfig(int i, double d, double d2, double d3, double d4) {
        this.type = i;
        this.rate = d;
        this.exciseTaxRateToShow = d2;
        this.exciseTaxRateToCharge = d3;
        this.exciseTaxRateToBonus = d4;
    }
}

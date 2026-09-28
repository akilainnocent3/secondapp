package com.sportygames.fbg_dialog.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.vnk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jl\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00102J\u0006\u00103\u001a\u00020\fJ\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\fHÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006?"}, d2 = {"Lcom/sportygames/fbg_dialog/data/model/GiftItem;", "Landroid/os/Parcelable;", "curBal", "", "currency", "", "displayTitle", "giftId", "initBal", "expireTime", "", AnalyticsParam.EVENT_STATUS, "", "partialBal", "metadata", "Lcom/sportygames/fbg_dialog/data/model/Metadata;", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DJILjava/lang/Double;Lcom/sportygames/fbg_dialog/data/model/Metadata;)V", "getCurBal", "()D", "setCurBal", "(D)V", "getCurrency", "()Ljava/lang/String;", "getDisplayTitle", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getInitBal", "getExpireTime", "()J", "getStatus", "()I", "getPartialBal", "()Ljava/lang/Double;", "setPartialBal", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMetadata", "()Lcom/sportygames/fbg_dialog/data/model/Metadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DJILjava/lang/Double;Lcom/sportygames/fbg_dialog/data/model/Metadata;)Lcom/sportygames/fbg_dialog/data/model/GiftItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "fbg-dialog_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GiftItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GiftItem> CREATOR = new a();
    private double curBal;
    private final String currency;
    private final String displayTitle;
    private final long expireTime;
    private String giftId;
    private final double initBal;
    private final Metadata metadata;
    private Double partialBal;
    private final int status;

    public static final class a implements Parcelable.Creator<GiftItem> {
        @Override // android.os.Parcelable.Creator
        public final GiftItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GiftItem(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Metadata.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftItem[] newArray(int i) {
            return new GiftItem[i];
        }
    }

    public /* synthetic */ GiftItem(double d, String str, String str2, String str3, double d2, long j, int i, Double d3, Metadata metadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, d2, j, i, (i2 & 128) != 0 ? Double.valueOf(0.0d) : d3, (i2 & 256) != 0 ? null : metadata);
    }

    public static /* synthetic */ GiftItem copy$default(GiftItem giftItem, double d, String str, String str2, String str3, double d2, long j, int i, Double d3, Metadata metadata, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = giftItem.curBal;
        }
        return giftItem.copy(d, (i2 & 2) != 0 ? giftItem.currency : str, (i2 & 4) != 0 ? giftItem.displayTitle : str2, (i2 & 8) != 0 ? giftItem.giftId : str3, (i2 & 16) != 0 ? giftItem.initBal : d2, (i2 & 32) != 0 ? giftItem.expireTime : j, (i2 & 64) != 0 ? giftItem.status : i, (i2 & 128) != 0 ? giftItem.partialBal : d3, (i2 & 256) != 0 ? giftItem.metadata : metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getCurBal() {
        return this.curBal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getInitBal() {
        return this.initBal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getPartialBal() {
        return this.partialBal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final GiftItem copy(double curBal, String currency, String displayTitle, String giftId, double initBal, long expireTime, int status, Double partialBal, Metadata metadata) {
        currency.getClass();
        displayTitle.getClass();
        giftId.getClass();
        return new GiftItem(curBal, currency, displayTitle, giftId, initBal, expireTime, status, partialBal, metadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftItem)) {
            return false;
        }
        GiftItem giftItem = (GiftItem) other;
        return Double.compare(this.curBal, giftItem.curBal) == 0 && Intrinsics.g(this.currency, giftItem.currency) && Intrinsics.g(this.displayTitle, giftItem.displayTitle) && Intrinsics.g(this.giftId, giftItem.giftId) && Double.compare(this.initBal, giftItem.initBal) == 0 && this.expireTime == giftItem.expireTime && this.status == giftItem.status && Intrinsics.g(this.partialBal, giftItem.partialBal) && Intrinsics.g(this.metadata, giftItem.metadata);
    }

    public final double getCurBal() {
        return this.curBal;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final double getInitBal() {
        return this.initBal;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Double getPartialBal() {
        return this.partialBal;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = gpp.a(this.status, f87.a(nrg0.a(gmf0.a(gmf0.a(gmf0.a(Double.hashCode(this.curBal) * 31, 31, this.currency), 31, this.displayTitle), 31, this.giftId), 31, this.initBal), this.expireTime, 31), 31);
        Double d = this.partialBal;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Metadata metadata = this.metadata;
        return iHashCode + (metadata != null ? metadata.hashCode() : 0);
    }

    public final void setCurBal(double d) {
        this.curBal = d;
    }

    public final void setGiftId(String str) {
        str.getClass();
        this.giftId = str;
    }

    public final void setPartialBal(Double d) {
        this.partialBal = d;
    }

    public String toString() {
        return "GiftItem(curBal=" + this.curBal + ", currency=" + this.currency + ", displayTitle=" + this.displayTitle + ", giftId=" + this.giftId + ", initBal=" + this.initBal + ", expireTime=" + this.expireTime + ", status=" + this.status + ", partialBal=" + this.partialBal + ", metadata=" + this.metadata + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeDouble(this.curBal);
        dest.writeString(this.currency);
        dest.writeString(this.displayTitle);
        dest.writeString(this.giftId);
        dest.writeDouble(this.initBal);
        dest.writeLong(this.expireTime);
        dest.writeInt(this.status);
        Double d = this.partialBal;
        if (d == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d);
        }
        Metadata metadata = this.metadata;
        if (metadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            metadata.writeToParcel(dest, flags);
        }
    }

    public GiftItem(double d, String str, String str2, String str3, double d2, long j, int i, Double d3, Metadata metadata) {
        m.a(str, str2, str3);
        this.curBal = d;
        this.currency = str;
        this.displayTitle = str2;
        this.giftId = str3;
        this.initBal = d2;
        this.expireTime = j;
        this.status = i;
        this.partialBal = d3;
        this.metadata = metadata;
    }
}

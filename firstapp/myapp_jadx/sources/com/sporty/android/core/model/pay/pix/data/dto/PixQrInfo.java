package com.sporty.android.core.model.pay.pix.data.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/pay/pix/data/dto/PixQrInfo;", "Landroid/os/Parcelable;", "qrCode", "", "qrImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQrCode", "()Ljava/lang/String;", "getQrImage", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PixQrInfo implements Parcelable {
    public static final Parcelable.Creator<PixQrInfo> CREATOR = new Creator();
    private final String qrCode;
    private final String qrImage;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PixQrInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PixQrInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PixQrInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PixQrInfo[] newArray(int i) {
            return new PixQrInfo[i];
        }
    }

    public PixQrInfo(String str, String str2) {
        this.qrCode = str;
        this.qrImage = str2;
    }

    public static /* synthetic */ PixQrInfo copy$default(PixQrInfo pixQrInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pixQrInfo.qrCode;
        }
        if ((i & 2) != 0) {
            str2 = pixQrInfo.qrImage;
        }
        return pixQrInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQrImage() {
        return this.qrImage;
    }

    public final PixQrInfo copy(String qrCode, String qrImage) {
        return new PixQrInfo(qrCode, qrImage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixQrInfo)) {
            return false;
        }
        PixQrInfo pixQrInfo = (PixQrInfo) other;
        return Intrinsics.g(this.qrCode, pixQrInfo.qrCode) && Intrinsics.g(this.qrImage, pixQrInfo.qrImage);
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getQrImage() {
        return this.qrImage;
    }

    public int hashCode() {
        String str = this.qrCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.qrImage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("PixQrInfo(qrCode=", this.qrCode, ", qrImage=", this.qrImage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.qrCode);
        dest.writeString(this.qrImage);
    }
}

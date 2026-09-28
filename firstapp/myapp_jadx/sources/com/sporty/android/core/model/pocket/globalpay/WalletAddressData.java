package com.sporty.android.core.model.pocket.globalpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.t160;
import defpackage.uf80;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rÊ\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/pocket/globalpay/WalletAddressData;", "Landroid/os/Parcelable;", "isDefault", "", "walletId", "", "walletAddress", "walletName", AnalyticsParam.EVENT_STATUS, "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getWalletId", "()Ljava/lang/String;", "getWalletAddress", "getWalletName", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WalletAddressData implements Parcelable {
    public static final Parcelable.Creator<WalletAddressData> CREATOR = new Creator();
    private final boolean isDefault;
    private final String status;
    private final String walletAddress;
    private final String walletId;
    private final String walletName;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WalletAddressData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAddressData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WalletAddressData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAddressData[] newArray(int i) {
            return new WalletAddressData[i];
        }
    }

    public WalletAddressData(boolean z, String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.isDefault = z;
        this.walletId = str;
        this.walletAddress = str2;
        this.walletName = str3;
        this.status = str4;
    }

    public static /* synthetic */ WalletAddressData copy$default(WalletAddressData walletAddressData, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = walletAddressData.isDefault;
        }
        if ((i & 2) != 0) {
            str = walletAddressData.walletId;
        }
        if ((i & 4) != 0) {
            str2 = walletAddressData.walletAddress;
        }
        if ((i & 8) != 0) {
            str3 = walletAddressData.walletName;
        }
        if ((i & 16) != 0) {
            str4 = walletAddressData.status;
        }
        String str5 = str4;
        String str6 = str2;
        return walletAddressData.copy(z, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWalletName() {
        return this.walletName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final WalletAddressData copy(boolean isDefault, String walletId, String walletAddress, String walletName, String status) {
        walletId.getClass();
        walletAddress.getClass();
        walletName.getClass();
        status.getClass();
        return new WalletAddressData(isDefault, walletId, walletAddress, walletName, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletAddressData)) {
            return false;
        }
        WalletAddressData walletAddressData = (WalletAddressData) other;
        return this.isDefault == walletAddressData.isDefault && Intrinsics.g(this.walletId, walletAddressData.walletId) && Intrinsics.g(this.walletAddress, walletAddressData.walletAddress) && Intrinsics.g(this.walletName, walletAddressData.walletName) && Intrinsics.g(this.status, walletAddressData.status);
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getWalletAddress() {
        return this.walletAddress;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public final String getWalletName() {
        return this.walletName;
    }

    public int hashCode() {
        return this.status.hashCode() + gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(this.isDefault) * 31, 31, this.walletId), 31, this.walletAddress), 31, this.walletName);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        boolean z = this.isDefault;
        String str = this.walletId;
        String str2 = this.walletAddress;
        String str3 = this.walletName;
        String str4 = this.status;
        StringBuilder sbA = t160.a("WalletAddressData(isDefault=", ", walletId=", str, ", walletAddress=", z);
        hxa.c(sbA, str2, ", walletName=", str3, ", status=");
        return uf80.a(sbA, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.isDefault ? 1 : 0);
        dest.writeString(this.walletId);
        dest.writeString(this.walletAddress);
        dest.writeString(this.walletName);
        dest.writeString(this.status);
    }
}

package com.sporty.android.core.model.pocket.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ai50;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.kya0;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.uqe0;
import defpackage.wxa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003Jk\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0006\u0010%\u001a\u00020\u0003J\u0014\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aÊ\u0001\u0002\b1¨\u00060"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/PaymentChannel;", "Landroid/os/Parcelable;", "payChId", "", "channelShowName", "", "channelSendName", "channelIconResId", "channelIconUrl", "significantNumbers", "", "isSupportMobileMoneyDeposit", "", "isSupportMobileMoneyWithdraw", "isSupportPaybill", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZZZ)V", "getPayChId", "()I", "getChannelShowName", "()Ljava/lang/String;", "getChannelSendName", "getChannelIconResId", "getChannelIconUrl", "getSignificantNumbers", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PaymentChannel implements Parcelable {
    public static final Parcelable.Creator<PaymentChannel> CREATOR = new Creator();
    private final int channelIconResId;
    private final String channelIconUrl;
    private final String channelSendName;
    private final String channelShowName;
    private final boolean isSupportMobileMoneyDeposit;
    private final boolean isSupportMobileMoneyWithdraw;
    private final boolean isSupportPaybill;
    private final int payChId;
    private final List<String> significantNumbers;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentChannel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentChannel createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z = false;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new PaymentChannel(i, string, string2, i2, string3, arrayListCreateStringArrayList, z, z2, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentChannel[] newArray(int i) {
            return new PaymentChannel[i];
        }
    }

    public /* synthetic */ PaymentChannel(int i, String str, String str2, int i2, String str3, List list, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, (i3 & 16) != 0 ? null : str3, list, z, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentChannel copy$default(PaymentChannel paymentChannel, int i, String str, String str2, int i2, String str3, List list, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = paymentChannel.payChId;
        }
        if ((i3 & 2) != 0) {
            str = paymentChannel.channelShowName;
        }
        if ((i3 & 4) != 0) {
            str2 = paymentChannel.channelSendName;
        }
        if ((i3 & 8) != 0) {
            i2 = paymentChannel.channelIconResId;
        }
        if ((i3 & 16) != 0) {
            str3 = paymentChannel.channelIconUrl;
        }
        if ((i3 & 32) != 0) {
            list = paymentChannel.significantNumbers;
        }
        if ((i3 & 64) != 0) {
            z = paymentChannel.isSupportMobileMoneyDeposit;
        }
        if ((i3 & 128) != 0) {
            z2 = paymentChannel.isSupportMobileMoneyWithdraw;
        }
        if ((i3 & 256) != 0) {
            z3 = paymentChannel.isSupportPaybill;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        List list2 = list;
        boolean z6 = z;
        String str4 = str3;
        String str5 = str2;
        return paymentChannel.copy(i, str, str5, i2, str4, list2, z6, z4, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayChId() {
        return this.payChId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelShowName() {
        return this.channelShowName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelSendName() {
        return this.channelSendName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChannelIconResId() {
        return this.channelIconResId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelIconUrl() {
        return this.channelIconUrl;
    }

    public final List<String> component6() {
        return this.significantNumbers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSupportMobileMoneyDeposit() {
        return this.isSupportMobileMoneyDeposit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsSupportMobileMoneyWithdraw() {
        return this.isSupportMobileMoneyWithdraw;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsSupportPaybill() {
        return this.isSupportPaybill;
    }

    public final PaymentChannel copy(int payChId, String channelShowName, String channelSendName, int channelIconResId, String channelIconUrl, List<String> significantNumbers, boolean isSupportMobileMoneyDeposit, boolean isSupportMobileMoneyWithdraw, boolean isSupportPaybill) {
        channelShowName.getClass();
        channelSendName.getClass();
        significantNumbers.getClass();
        return new PaymentChannel(payChId, channelShowName, channelSendName, channelIconResId, channelIconUrl, significantNumbers, isSupportMobileMoneyDeposit, isSupportMobileMoneyWithdraw, isSupportPaybill);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentChannel)) {
            return false;
        }
        PaymentChannel paymentChannel = (PaymentChannel) other;
        return this.payChId == paymentChannel.payChId && Intrinsics.g(this.channelShowName, paymentChannel.channelShowName) && Intrinsics.g(this.channelSendName, paymentChannel.channelSendName) && this.channelIconResId == paymentChannel.channelIconResId && Intrinsics.g(this.channelIconUrl, paymentChannel.channelIconUrl) && Intrinsics.g(this.significantNumbers, paymentChannel.significantNumbers) && this.isSupportMobileMoneyDeposit == paymentChannel.isSupportMobileMoneyDeposit && this.isSupportMobileMoneyWithdraw == paymentChannel.isSupportMobileMoneyWithdraw && this.isSupportPaybill == paymentChannel.isSupportPaybill;
    }

    public final int getChannelIconResId() {
        return this.channelIconResId;
    }

    public final String getChannelIconUrl() {
        return this.channelIconUrl;
    }

    public final String getChannelSendName() {
        return this.channelSendName;
    }

    public final String getChannelShowName() {
        return this.channelShowName;
    }

    public final int getPayChId() {
        return this.payChId;
    }

    public final List<String> getSignificantNumbers() {
        return this.significantNumbers;
    }

    public int hashCode() {
        int iA = gpp.a(this.channelIconResId, gmf0.a(gmf0.a(Integer.hashCode(this.payChId) * 31, 31, this.channelShowName), 31, this.channelSendName), 31);
        String str = this.channelIconUrl;
        return Boolean.hashCode(this.isSupportPaybill) + mtg0.a(mtg0.a(ai50.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.significantNumbers), 31, this.isSupportMobileMoneyDeposit), 31, this.isSupportMobileMoneyWithdraw);
    }

    public final boolean isSupportMobileMoneyDeposit() {
        return this.isSupportMobileMoneyDeposit;
    }

    public final boolean isSupportMobileMoneyWithdraw() {
        return this.isSupportMobileMoneyWithdraw;
    }

    public final boolean isSupportPaybill() {
        return this.isSupportPaybill;
    }

    public String toString() {
        int i = this.payChId;
        String str = this.channelShowName;
        String str2 = this.channelSendName;
        int i2 = this.channelIconResId;
        String str3 = this.channelIconUrl;
        List<String> list = this.significantNumbers;
        boolean z = this.isSupportMobileMoneyDeposit;
        boolean z2 = this.isSupportMobileMoneyWithdraw;
        boolean z3 = this.isSupportPaybill;
        StringBuilder sbA = uqe0.a(i, "PaymentChannel(payChId=", ", channelShowName=", str, ", channelSendName=");
        wxa.b(i2, str2, ", channelIconResId=", ", channelIconUrl=", sbA);
        kya0.b(str3, ", significantNumbers=", ", isSupportMobileMoneyDeposit=", sbA, list);
        nng.a(", isSupportMobileMoneyWithdraw=", ", isSupportPaybill=", sbA, z, z2);
        return mq0.a(sbA, z3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.payChId);
        dest.writeString(this.channelShowName);
        dest.writeString(this.channelSendName);
        dest.writeInt(this.channelIconResId);
        dest.writeString(this.channelIconUrl);
        dest.writeStringList(this.significantNumbers);
        dest.writeInt(this.isSupportMobileMoneyDeposit ? 1 : 0);
        dest.writeInt(this.isSupportMobileMoneyWithdraw ? 1 : 0);
        dest.writeInt(this.isSupportPaybill ? 1 : 0);
    }

    public PaymentChannel(int i, String str, String str2, int i2, String str3, List<String> list, boolean z, boolean z2, boolean z3) {
        bt6.a(str, str2, list);
        this.payChId = i;
        this.channelShowName = str;
        this.channelSendName = str2;
        this.channelIconResId = i2;
        this.channelIconUrl = str3;
        this.significantNumbers = list;
        this.isSupportMobileMoneyDeposit = z;
        this.isSupportMobileMoneyWithdraw = z2;
        this.isSupportPaybill = z3;
    }
}

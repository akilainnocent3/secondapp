package com.sportybet.android.verifybet.apidata;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.plugin.realsports.data.RTicket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u001dÊ\u0001\u0002\b\u001eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/verifybet/apidata/VerifyBetData;", "Landroid/os/Parcelable;", "orderInfoVO", "Lcom/sportybet/plugin/realsports/data/RTicket;", "userName", "", "<init>", "(Lcom/sportybet/plugin/realsports/data/RTicket;Ljava/lang/String;)V", "getOrderInfoVO", "()Lcom/sportybet/plugin/realsports/data/RTicket;", "getUserName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VerifyBetData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VerifyBetData> CREATOR = new a();
    private final RTicket orderInfoVO;
    private final String userName;

    public static final class a implements Parcelable.Creator<VerifyBetData> {
        @Override // android.os.Parcelable.Creator
        public final VerifyBetData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VerifyBetData((RTicket) parcel.readParcelable(VerifyBetData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerifyBetData[] newArray(int i) {
            return new VerifyBetData[i];
        }
    }

    public VerifyBetData(RTicket rTicket, String str) {
        rTicket.getClass();
        str.getClass();
        this.orderInfoVO = rTicket;
        this.userName = str;
    }

    public static /* synthetic */ VerifyBetData copy$default(VerifyBetData verifyBetData, RTicket rTicket, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            rTicket = verifyBetData.orderInfoVO;
        }
        if ((i & 2) != 0) {
            str = verifyBetData.userName;
        }
        return verifyBetData.copy(rTicket, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RTicket getOrderInfoVO() {
        return this.orderInfoVO;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    public final VerifyBetData copy(RTicket orderInfoVO, String userName) {
        orderInfoVO.getClass();
        userName.getClass();
        return new VerifyBetData(orderInfoVO, userName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyBetData)) {
            return false;
        }
        VerifyBetData verifyBetData = (VerifyBetData) other;
        return Intrinsics.g(this.orderInfoVO, verifyBetData.orderInfoVO) && Intrinsics.g(this.userName, verifyBetData.userName);
    }

    public final RTicket getOrderInfoVO() {
        return this.orderInfoVO;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return this.userName.hashCode() + (this.orderInfoVO.hashCode() * 31);
    }

    public String toString() {
        return "VerifyBetData(orderInfoVO=" + this.orderInfoVO + ", userName=" + this.userName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeParcelable(this.orderInfoVO, flags);
        dest.writeString(this.userName);
    }
}

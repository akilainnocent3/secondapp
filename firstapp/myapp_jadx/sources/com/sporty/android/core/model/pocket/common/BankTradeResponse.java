package com.sporty.android.core.model.pocket.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.pay.pix.data.dto.PixQrInfo;
import defpackage.eal;
import defpackage.tcp;
import defpackage.uf80;

/* JADX INFO: loaded from: classes4.dex */
public class BankTradeResponse implements Parcelable {
    public static final Parcelable.Creator<BankTradeResponse> CREATOR = new Parcelable.Creator<BankTradeResponse>() { // from class: com.sporty.android.core.model.pocket.common.BankTradeResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankTradeResponse createFromParcel(Parcel parcel) {
            return new BankTradeResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankTradeResponse[] newArray(int i) {
            return new BankTradeResponse[i];
        }
    };
    public long acceptTime;
    public String amount;

    @SerializedName("obj")
    public tcp assetId;
    public String bankAccName;
    public int bankId;
    public String counterAuthority;
    public String counterIconUrl;
    public String counterPart;
    public String dialNumber;
    public String displayMsg;
    public String embeddedFrame;
    public int feeAmount;
    public int feeType;
    public String gatewayResponse;
    public String htmlContent;
    public int htmlContentReloadCount;
    public String initAmount;
    public String jumpUrl;
    public String mobileOperatorName;
    public String name;
    public int payChId;
    public PixQrInfo pix;
    public int status;
    public String tradeId;
    public String transactionRef;

    public BankTradeResponse(Parcel parcel) {
        this.tradeId = parcel.readString();
        this.acceptTime = parcel.readLong();
        this.feeType = parcel.readInt();
        this.feeAmount = parcel.readInt();
        this.status = parcel.readInt();
        this.amount = parcel.readString();
        this.initAmount = parcel.readString();
        this.jumpUrl = parcel.readString();
        this.htmlContent = parcel.readString();
        this.htmlContentReloadCount = parcel.readInt();
        this.payChId = parcel.readInt();
        this.bankId = parcel.readInt();
        this.mobileOperatorName = parcel.readString();
        this.counterPart = parcel.readString();
        this.counterAuthority = parcel.readString();
        this.counterIconUrl = parcel.readString();
        this.bankAccName = parcel.readString();
        this.displayMsg = parcel.readString();
        this.gatewayResponse = parcel.readString();
        String string = parcel.readString();
        if (string != null) {
            this.assetId = (tcp) new eal().e(string, tcp.class);
        }
        this.pix = (PixQrInfo) parcel.readParcelable(PixQrInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BankTradeResponse{tradeId='");
        sb.append(this.tradeId);
        sb.append("', payChId=");
        sb.append(this.payChId);
        sb.append(", bankId=");
        sb.append(this.bankId);
        sb.append(", mobileOperatorName='");
        sb.append(this.mobileOperatorName);
        sb.append("', acceptTime=");
        sb.append(this.acceptTime);
        sb.append(", feeType=");
        sb.append(this.feeType);
        sb.append(", feeAmount=");
        sb.append(this.feeAmount);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", amount='");
        sb.append(this.amount);
        sb.append("', initAmount='");
        sb.append(this.initAmount);
        sb.append("', jumpUrl='");
        sb.append(this.jumpUrl);
        sb.append("', htmlContent='");
        sb.append(this.htmlContent);
        sb.append("', htmlContentReloadCount='");
        sb.append(this.htmlContentReloadCount);
        sb.append("', counterPart='");
        sb.append(this.counterPart);
        sb.append("', counterAuthority='");
        sb.append(this.counterAuthority);
        sb.append("', counterIconUrl='");
        sb.append(this.counterIconUrl);
        sb.append("', bankAccName='");
        sb.append(this.bankAccName);
        sb.append("', displayMsg='");
        sb.append(this.displayMsg);
        sb.append("', dialNumber='");
        sb.append(this.dialNumber);
        sb.append("', transactionRef='");
        sb.append(this.transactionRef);
        sb.append("', name='");
        return uf80.a(sb, this.name, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tradeId);
        parcel.writeLong(this.acceptTime);
        parcel.writeInt(this.feeType);
        parcel.writeInt(this.feeAmount);
        parcel.writeInt(this.status);
        parcel.writeString(this.amount);
        parcel.writeString(this.initAmount);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.htmlContent);
        parcel.writeInt(this.htmlContentReloadCount);
        parcel.writeInt(this.payChId);
        parcel.writeInt(this.bankId);
        parcel.writeString(this.mobileOperatorName);
        parcel.writeString(this.counterPart);
        parcel.writeString(this.counterAuthority);
        parcel.writeString(this.counterIconUrl);
        parcel.writeString(this.bankAccName);
        parcel.writeString(this.displayMsg);
        parcel.writeString(this.gatewayResponse);
        tcp tcpVar = this.assetId;
        parcel.writeString(tcpVar != null ? tcpVar.toString() : null);
        parcel.writeParcelable(this.pix, i);
    }

    public BankTradeResponse() {
    }
}

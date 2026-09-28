package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\b¢\u0006\u0002\n\u0000Ê\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/BetDetail;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "betId", "betGroupId", "settleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "getCustomKey", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetDetail implements Parcelable {

    @SerializedName("betGroupId")
    public String betGroupId;

    @SerializedName("betId")
    public String betId;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    public final String eventId;

    @SerializedName("marketId")
    public final String marketId;

    @SerializedName("outcomeId")
    public final String outcomeId;

    @SerializedName("settleType")
    public final String settleType;
    public static final Parcelable.Creator<BetDetail> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BetDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetDetail createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BetDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetDetail[] newArray(int i) {
            return new BetDetail[i];
        }
    }

    public BetDetail(String str, String str2, String str3, String str4, String str5, String str6) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.betId = str4;
        this.betGroupId = str5;
        this.settleType = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCustomKey() {
        return this.eventId + "-" + this.marketId + "-" + this.outcomeId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.eventId);
        dest.writeString(this.marketId);
        dest.writeString(this.outcomeId);
        dest.writeString(this.betId);
        dest.writeString(this.betGroupId);
        dest.writeString(this.settleType);
    }
}

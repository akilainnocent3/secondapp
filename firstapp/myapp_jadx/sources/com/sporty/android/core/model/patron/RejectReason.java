package com.sporty.android.core.model.patron;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/patron/RejectReason;", "Landroid/os/Parcelable;", "requirementId", "", "requirementName", "rejectReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequirementId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRequirementName", "getRejectReason", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RejectReason implements Parcelable {
    public static final Parcelable.Creator<RejectReason> CREATOR = new Creator();

    @SerializedName("rejectReason")
    private final String rejectReason;

    @SerializedName("requirementId")
    private final String requirementId;

    @SerializedName("requirementName")
    private final String requirementName;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RejectReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RejectReason createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RejectReason(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RejectReason[] newArray(int i) {
            return new RejectReason[i];
        }
    }

    public RejectReason(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.requirementId = str;
        this.requirementName = str2;
        this.rejectReason = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getRejectReason() {
        return this.rejectReason;
    }

    public final String getRequirementId() {
        return this.requirementId;
    }

    public final String getRequirementName() {
        return this.requirementName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.requirementId);
        dest.writeString(this.requirementName);
        dest.writeString(this.rejectReason);
    }
}

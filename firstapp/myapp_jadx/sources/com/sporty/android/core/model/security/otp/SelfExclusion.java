package com.sporty.android.core.model.security.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.d020;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/security/otp/SelfExclusion;", "Landroid/os/Parcelable;", "endDate", "", "<init>", "(J)V", "getEndDate", "()J", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelfExclusion implements Parcelable {
    public static final Parcelable.Creator<SelfExclusion> CREATOR = new Creator();

    @SerializedName("endDate")
    private final long endDate;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelfExclusion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfExclusion createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SelfExclusion(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfExclusion[] newArray(int i) {
            return new SelfExclusion[i];
        }
    }

    public SelfExclusion(long j) {
        this.endDate = j;
    }

    public static /* synthetic */ SelfExclusion copy$default(SelfExclusion selfExclusion, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = selfExclusion.endDate;
        }
        return selfExclusion.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    public final SelfExclusion copy(long endDate) {
        return new SelfExclusion(endDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelfExclusion) && this.endDate == ((SelfExclusion) other).endDate;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public int hashCode() {
        return Long.hashCode(this.endDate);
    }

    public String toString() {
        return d020.a(this.endDate, "SelfExclusion(endDate=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.endDate);
    }
}

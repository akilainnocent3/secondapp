package com.sporty.android.core.model.security.biometric;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u001bÊ\u0001\u0002\b\u001c¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/BioAuthRegisterResponse;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_RESULT, "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BioAuthRegisterResponse implements Parcelable {
    public static final Parcelable.Creator<BioAuthRegisterResponse> CREATOR = new Creator();
    private final String result;
    private final String token;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BioAuthRegisterResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BioAuthRegisterResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BioAuthRegisterResponse(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BioAuthRegisterResponse[] newArray(int i) {
            return new BioAuthRegisterResponse[i];
        }
    }

    public BioAuthRegisterResponse(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.result = str;
        this.token = str2;
    }

    public static /* synthetic */ BioAuthRegisterResponse copy$default(BioAuthRegisterResponse bioAuthRegisterResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bioAuthRegisterResponse.result;
        }
        if ((i & 2) != 0) {
            str2 = bioAuthRegisterResponse.token;
        }
        return bioAuthRegisterResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final BioAuthRegisterResponse copy(String result, String token) {
        result.getClass();
        token.getClass();
        return new BioAuthRegisterResponse(result, token);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioAuthRegisterResponse)) {
            return false;
        }
        BioAuthRegisterResponse bioAuthRegisterResponse = (BioAuthRegisterResponse) other;
        return Intrinsics.g(this.result, bioAuthRegisterResponse.result) && Intrinsics.g(this.token, bioAuthRegisterResponse.token);
    }

    public final String getResult() {
        return this.result;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.result.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("BioAuthRegisterResponse(result=", this.result, ", token=", this.token, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.result);
        dest.writeString(this.token);
    }
}

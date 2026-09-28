package com.sporty.android.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import defpackage.eal;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0006J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\"Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sporty/android/common/data/ErrorResponse;", "Landroid/os/Parcelable;", "causeMsg", "", "errorName", "errorCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCauseMsg", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getErrorName", "getErrorCode", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "common", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ErrorResponse implements Parcelable {

    @SerializedName("causeMsg")
    private final String causeMsg;

    @SerializedName("errorCode")
    private final int errorCode;

    @SerializedName("errorName")
    private final String errorName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ErrorResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007b\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/common/data/ErrorResponse$Companion;", "", "<init>", "()V", "getErrorResponse", "Lcom/sporty/android/common/data/ErrorResponse;", "responseBody", "Lokhttp3/ResponseBody;", "Lkotlin/jvm/JvmStatic;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorResponse getErrorResponse(ResponseBody responseBody) {
            if (responseBody == null) {
                return null;
            }
            try {
                return (ErrorResponse) new eal().d(responseBody.charStream(), TypeToken.get(ErrorResponse.class));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ErrorResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ErrorResponse(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorResponse[] newArray(int i) {
            return new ErrorResponse[i];
        }
    }

    public /* synthetic */ ErrorResponse(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorResponse.causeMsg;
        }
        if ((i2 & 2) != 0) {
            str2 = errorResponse.errorName;
        }
        if ((i2 & 4) != 0) {
            i = errorResponse.errorCode;
        }
        return errorResponse.copy(str, str2, i);
    }

    public static final ErrorResponse getErrorResponse(ResponseBody responseBody) {
        return INSTANCE.getErrorResponse(responseBody);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCauseMsg() {
        return this.causeMsg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    public final ErrorResponse copy(String causeMsg, String errorName, int errorCode) {
        causeMsg.getClass();
        errorName.getClass();
        return new ErrorResponse(causeMsg, errorName, errorCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.g(this.causeMsg, errorResponse.causeMsg) && Intrinsics.g(this.errorName, errorResponse.errorName) && this.errorCode == errorResponse.errorCode;
    }

    public final String getCauseMsg() {
        return this.causeMsg;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorName() {
        return this.errorName;
    }

    public int hashCode() {
        return Integer.hashCode(this.errorCode) + gmf0.a(this.causeMsg.hashCode() * 31, 31, this.errorName);
    }

    public String toString() {
        return zk1.a(this.errorCode, ")", ux5.a("ErrorResponse(causeMsg=", this.causeMsg, ", errorName=", this.errorName, ", errorCode="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.causeMsg);
        dest.writeString(this.errorName);
        dest.writeInt(this.errorCode);
    }

    public ErrorResponse(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.causeMsg = str;
        this.errorName = str2;
        this.errorCode = i;
    }

    public ErrorResponse() {
        this(null, null, 0, 7, null);
    }
}

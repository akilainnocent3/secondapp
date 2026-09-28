package com.sportybet.android.instantwin.newtork.model.error;

import com.google.gson.annotations.SerializedName;
import defpackage.uf80;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/error/ErrorBody;", "", "errorCode", "", "errorName", "", "causeMessage", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getErrorName", "()Ljava/lang/String;", "getCauseMessage", "causeMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ErrorBody {
    public static final int $stable = 0;

    @SerializedName("causeMsg")
    private final String causeMessage;

    @SerializedName("errorCode")
    private final int errorCode;

    @SerializedName("errorName")
    private final String errorName;

    public ErrorBody(int i, String str, String str2) {
        this.errorCode = i;
        this.errorName = str;
        this.causeMessage = str2;
    }

    public static /* synthetic */ ErrorBody copy$default(ErrorBody errorBody, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = errorBody.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = errorBody.errorName;
        }
        if ((i2 & 4) != 0) {
            str2 = errorBody.causeMessage;
        }
        return errorBody.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCauseMessage() {
        return this.causeMessage;
    }

    public final ErrorBody copy(int errorCode, String errorName, String causeMessage) {
        return new ErrorBody(errorCode, errorName, causeMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorBody)) {
            return false;
        }
        ErrorBody errorBody = (ErrorBody) other;
        return this.errorCode == errorBody.errorCode && Intrinsics.g(this.errorName, errorBody.errorName) && Intrinsics.g(this.causeMessage, errorBody.causeMessage);
    }

    public final String getCauseMessage() {
        return this.causeMessage;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorName() {
        return this.errorName;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        String str = this.errorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.causeMessage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.errorCode;
        String str = this.errorName;
        return uf80.a(uqe0.a(i, "ErrorBody(errorCode=", ", errorName=", str, ", causeMessage="), this.causeMessage, ")");
    }
}

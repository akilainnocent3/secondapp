package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lok0;
import defpackage.qok0;
import defpackage.scy;
import defpackage.tnk0;
import defpackage.uif;
import defpackage.uwk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new uwk0();
    public final ErrorCode a;
    public final String b;

    public ErrorResponseData(int i, String str) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (i == errorCode.a) {
                this.a = errorCode;
                this.b = str;
            }
        }
        errorCode = ErrorCode.OTHER_ERROR;
        this.a = errorCode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return scy.a(this.a, errorResponseData.a) && scy.a(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        lok0 lok0VarA = qok0.a(this);
        String strValueOf = String.valueOf(this.a.a);
        tnk0 tnk0Var = new tnk0();
        lok0VarA.c.c = tnk0Var;
        lok0VarA.c = tnk0Var;
        tnk0Var.b = strValueOf;
        tnk0Var.a = "errorCode";
        String str = this.b;
        if (str != null) {
            lok0VarA.a(str, "errorMessage");
        }
        return lok0VarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        int i2 = this.a.a;
        uif.o(parcel, 2, 4);
        parcel.writeInt(i2);
        uif.i(parcel, 3, this.b, false);
        uif.n(parcel, iM);
    }
}

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tug;

/* JADX INFO: loaded from: classes4.dex */
public enum PublicKeyCredentialType implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC_KEY;

    public static final Parcelable.Creator<PublicKeyCredentialType> CREATOR = new c();

    public static class a extends Exception {
    }

    public static PublicKeyCredentialType a(String str) throws a {
        for (PublicKeyCredentialType publicKeyCredentialType : values()) {
            publicKeyCredentialType.getClass();
            if (str.equals("public-key")) {
                return publicKeyCredentialType;
            }
        }
        throw new a(tug.a("PublicKeyCredentialType ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tug;

/* JADX INFO: loaded from: classes4.dex */
public enum Attachment implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new b();
    public final String a;

    public static class a extends Exception {
    }

    Attachment(String str) {
        this.a = str;
    }

    public static Attachment a(String str) throws a {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.a)) {
                return attachment;
            }
        }
        throw new a(tug.a("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}

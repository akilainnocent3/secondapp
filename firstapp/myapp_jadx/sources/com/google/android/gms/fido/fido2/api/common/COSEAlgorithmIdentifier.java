package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pe4;
import defpackage.qhf;
import defpackage.rr30;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();
    public final com.google.android.gms.fido.fido2.api.common.a a;

    public static class a extends Exception {
    }

    public COSEAlgorithmIdentifier(com.google.android.gms.fido.fido2.api.common.a aVar) {
        this.a = aVar;
    }

    public static COSEAlgorithmIdentifier a(int i) throws a {
        com.google.android.gms.fido.fido2.api.common.a aVar;
        if (i != -262) {
            for (rr30 rr30Var : rr30.values()) {
                if (rr30Var.a == i) {
                    aVar = rr30Var;
                }
            }
            for (qhf qhfVar : qhf.values()) {
                if (qhfVar.a == i) {
                    aVar = qhfVar;
                }
            }
            throw new a(pe4.b(i, "Algorithm with COSE value ", " not supported"));
        }
        aVar = rr30.b;
        return new COSEAlgorithmIdentifier(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.a() == ((COSEAlgorithmIdentifier) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.e0l0;
import defpackage.he4;
import defpackage.rmk0;
import defpackage.scy;
import defpackage.uif;
import defpackage.y4s;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new rmk0();
    public final long a;
    public final int b;
    public final boolean c;
    public final ClientIdentity d;

    public LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.a == lastLocationRequest.a && this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && scy.a(this.d, lastLocationRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sbA = y4s.a("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sbA.append("maxAge=");
            e0l0.a(j, sbA);
        }
        int i = this.b;
        if (i != 0) {
            sbA.append(", ");
            sbA.append(he4.e(i));
        }
        if (this.c) {
            sbA.append(", bypass");
        }
        ClientIdentity clientIdentity = this.d;
        if (clientIdentity != null) {
            sbA.append(", impersonation=");
            sbA.append(clientIdentity);
        }
        sbA.append(']');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uif.h(parcel, 5, this.d, i, false);
        uif.n(parcel, iM);
    }
}

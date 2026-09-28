package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rkk0;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Claim extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Claim> CREATOR = new rkk0();
    public final String a;
    public final boolean b;

    public Claim(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Claim) {
            Claim claim = (Claim) obj;
            if (this.a.equals(claim.a) && this.b == claim.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uif.n(parcel, iM);
    }
}

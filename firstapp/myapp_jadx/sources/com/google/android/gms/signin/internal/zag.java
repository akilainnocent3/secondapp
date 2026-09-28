package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bj50;
import defpackage.jik0;
import defpackage.uif;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zag extends AbstractSafeParcelable implements bj50 {
    public static final Parcelable.Creator<zag> CREATOR = new jik0();
    public final List a;
    public final String b;

    public zag(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.bj50
    public final Status getStatus() {
        return this.b != null ? Status.e : Status.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.j(parcel, 1, this.a);
        uif.i(parcel, 2, this.b, false);
        uif.n(parcel, iM);
    }
}

package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.pkk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new pkk0();
    public final PendingIntent a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        hm20.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.n(parcel, iM);
    }
}

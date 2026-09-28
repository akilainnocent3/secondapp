package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bj50;
import defpackage.hok0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements bj50 {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new hok0();
    public final Status a;
    public final LocationSettingsStates b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.a = status;
        this.b = locationSettingsStates;
    }

    @Override // defpackage.bj50
    public final Status getStatus() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.h(parcel, 2, this.b, i, false);
        uif.n(parcel, iM);
    }
}

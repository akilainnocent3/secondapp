package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.lfk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new lfk0();
    public final boolean a;
    public final int b;

    public ModuleAvailabilityResponse(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.n(parcel, iM);
    }
}

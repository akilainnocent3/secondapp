package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hmk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new hmk0();
    public final Intent a;

    public CloudMessage(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.n(parcel, iM);
    }
}

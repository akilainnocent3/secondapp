package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gqm;
import defpackage.tug;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        try {
            for (Transport transport : Transport.values()) {
                if (string.equals(transport.a)) {
                    return transport;
                }
            }
            if (string.equals("hybrid")) {
                return Transport.HYBRID;
            }
            throw new Transport.a(tug.a("Transport ", string, " not supported"));
        } catch (Transport.a e) {
            gqm.a(e);
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}

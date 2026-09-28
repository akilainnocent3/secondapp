package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.d0l0;
import defpackage.r0l0;
import defpackage.uif;
import defpackage.v0l0;
import defpackage.x0l0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new d0l0();
    public final v0l0 a;
    public final PendingIntent b;
    public final String c;

    public zzem(ArrayList arrayList, PendingIntent pendingIntent, String str) {
        v0l0 v0l0VarI;
        if (arrayList == null) {
            r0l0 r0l0Var = v0l0.b;
            v0l0VarI = x0l0.e;
        } else {
            v0l0VarI = v0l0.i(arrayList);
        }
        this.a = v0l0VarI;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.j(parcel, 1, this.a);
        uif.h(parcel, 2, this.b, i, false);
        uif.i(parcel, 3, this.c, false);
        uif.n(parcel, iM);
    }
}

package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hb5;
import defpackage.uhk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new uhk0();
    public final int a;
    public final int b;
    public final Long c;
    public final Long d;
    public final int e;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = l;
        this.d = l2;
        this.e = i3;
        if (l == null || l2 == null || l2.longValue() == 0 || l2.longValue() != 0) {
            return;
        }
        hb5.a("Given Long is zero");
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.g(parcel, 3, this.c);
        uif.g(parcel, 4, this.d);
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.e);
        uif.n(parcel, iM);
    }
}

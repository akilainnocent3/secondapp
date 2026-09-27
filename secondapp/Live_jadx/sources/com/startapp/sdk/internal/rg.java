package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class rg extends t6 {
    public static final Parcelable.Creator<rg> CREATOR = new qg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f75466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f75467g;

    public rg() {
        this.f75466f = 0.9f;
        this.f75467g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.sdk.internal.t6, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f75466f);
        parcel.writeFloat(this.f75467g);
    }

    public rg(Parcel parcel) {
        super(parcel);
        this.f75466f = parcel.readFloat();
        this.f75467g = parcel.readFloat();
    }
}

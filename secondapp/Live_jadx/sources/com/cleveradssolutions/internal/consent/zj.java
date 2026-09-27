package com.cleveradssolutions.internal.consent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class zj extends AbsSavedState {
    public static final Parcelable.Creator<zj> CREATOR = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43322h;

    public zj(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f43318d = parcel.readInt();
        this.f43319e = parcel.readInt();
        this.f43320f = parcel.readInt() == 1;
        this.f43321g = parcel.readInt() == 1;
        this.f43322h = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f43318d);
        parcel.writeInt(this.f43319e);
        parcel.writeInt(this.f43320f ? 1 : 0);
        parcel.writeInt(this.f43321g ? 1 : 0);
        parcel.writeInt(this.f43322h ? 1 : 0);
    }

    public zj(Parcelable parcelable, zm zmVar) {
        super(parcelable);
        this.f43318d = zmVar.f43347z;
        this.f43319e = zmVar.f43326e;
        this.f43320f = zmVar.f43324c;
        this.f43321g = zmVar.f43344w;
        this.f43322h = zmVar.f43345x;
    }
}

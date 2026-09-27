package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class D implements Parcelable {

    @oy.l
    public static final C CREATOR = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f99022b;

    public D(boolean z10, F f10) {
        this.f99021a = z10;
        this.f99022b = f10;
    }

    public final F a() {
        return this.f99022b;
    }

    public final boolean b() {
        return this.f99021a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableRemoteScreenshotConfig(enabled=" + this.f99021a + ", config=" + this.f99022b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f99021a ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f99022b, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(j0 j0Var) {
        boolean zB = j0Var.b();
        k0 k0VarA = j0Var.a();
        this(zB, k0VarA != null ? new F(k0VarA) : null);
    }
}

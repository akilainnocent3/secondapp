package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5584z implements Parcelable {

    @oy.l
    public static final C5583y CREATOR = new C5583y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99122a;

    public C5584z(boolean z10) {
        this.f99122a = z10;
    }

    public final boolean a() {
        return this.f99122a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableApiCaptorConfig(enabled=" + this.f99122a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f99122a ? (byte) 1 : (byte) 0);
    }

    public C5584z(h0 h0Var) {
        this(h0Var.a());
    }
}

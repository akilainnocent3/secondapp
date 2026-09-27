package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class F implements Parcelable {

    @oy.l
    public static final E CREATOR = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5584z f99023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f99024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f99025c;

    public F(C5584z c5584z, H h10, B b10) {
        this.f99023a = c5584z;
        this.f99024b = h10;
        this.f99025c = b10;
    }

    public final C5584z a() {
        return this.f99023a;
    }

    public final B b() {
        return this.f99025c;
    }

    public final H c() {
        return this.f99024b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableScreenshotConfig(apiCaptorConfig=" + this.f99023a + ", serviceCaptorConfig=" + this.f99024b + ", contentObserverCaptorConfig=" + this.f99025c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f99023a, i10);
        parcel.writeParcelable(this.f99024b, i10);
        parcel.writeParcelable(this.f99025c, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(k0 k0Var) {
        h0 h0VarA = k0Var.a();
        C5584z c5584z = h0VarA != null ? new C5584z(h0VarA) : null;
        l0 l0VarC = k0Var.c();
        H h10 = l0VarC != null ? new H(l0VarC) : null;
        i0 i0VarB = k0Var.b();
        this(c5584z, h10, i0VarB != null ? new B(i0VarB) : null);
    }
}

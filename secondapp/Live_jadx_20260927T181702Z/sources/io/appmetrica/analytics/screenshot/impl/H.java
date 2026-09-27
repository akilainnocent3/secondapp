package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class H implements Parcelable {

    @oy.l
    public static final G CREATOR = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99027b;

    public H(boolean z10, long j10) {
        this.f99026a = z10;
        this.f99027b = j10;
    }

    public final long a() {
        return this.f99027b;
    }

    public final boolean b() {
        return this.f99026a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableServiceCaptorConfig(enabled=" + this.f99026a + ", delaySeconds=" + this.f99027b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f99026a ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f99027b);
    }

    public H(l0 l0Var) {
        this(l0Var.b(), l0Var.a());
    }
}

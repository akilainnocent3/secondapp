package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class B implements Parcelable {

    @oy.l
    public static final A CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f99019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99020c;

    public B(boolean z10, List list, long j10) {
        this.f99018a = z10;
        this.f99019b = list;
        this.f99020c = j10;
    }

    public final long a() {
        return this.f99020c;
    }

    public final boolean b() {
        return this.f99018a;
    }

    public final List c() {
        return this.f99019b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ParcelableContentObserverCaptorConfig(enabled=" + this.f99018a + ", mediaStoreColumnNames=" + this.f99019b + ", detectWindowSeconds=" + this.f99020c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f99018a ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.f99019b);
        parcel.writeLong(this.f99020c);
    }

    public B(i0 i0Var) {
        this(i0Var.b(), i0Var.c(), i0Var.a());
    }
}

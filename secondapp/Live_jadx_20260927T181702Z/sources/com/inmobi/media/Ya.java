package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ya implements Parcelable {

    @oy.l
    public static final Xa CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Za f55814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f55819f;

    public Ya(Za landingPageTelemetryMetaData, String urlType, int i10, long j10) {
        kotlin.jvm.internal.m0.p(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.m0.p(urlType, "urlType");
        this.f55814a = landingPageTelemetryMetaData;
        this.f55815b = urlType;
        this.f55816c = i10;
        this.f55817d = j10;
        this.f55818e = -1;
    }

    public static Ya a(Ya ya2) {
        Za landingPageTelemetryMetaData = ya2.f55814a;
        String urlType = ya2.f55815b;
        int i10 = ya2.f55816c;
        long j10 = ya2.f55817d;
        kotlin.jvm.internal.m0.p(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.m0.p(urlType, "urlType");
        return new Ya(landingPageTelemetryMetaData, urlType, i10, j10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya2 = (Ya) obj;
        return kotlin.jvm.internal.m0.g(this.f55814a, ya2.f55814a) && kotlin.jvm.internal.m0.g(this.f55815b, ya2.f55815b) && this.f55816c == ya2.f55816c && this.f55817d == ya2.f55817d;
    }

    public final int hashCode() {
        return f0.p.a(this.f55817d) + AbstractC3671fi.a(this.f55816c, (this.f55815b.hashCode() + (this.f55814a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=" + this.f55814a + ", urlType=" + this.f55815b + ", counter=" + this.f55816c + ", startTime=" + this.f55817d + gi.j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        kotlin.jvm.internal.m0.p(parcel, "parcel");
        parcel.writeLong(this.f55814a.f55883a);
        parcel.writeString(this.f55814a.f55884b);
        parcel.writeString(this.f55814a.f55885c);
        parcel.writeString(this.f55814a.f55886d);
        parcel.writeString(this.f55814a.f55887e);
        parcel.writeString(this.f55814a.f55888f);
        parcel.writeString(this.f55814a.f55889g);
        parcel.writeByte(this.f55814a.f55890h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f55814a.f55891i);
        parcel.writeString(this.f55815b);
        parcel.writeInt(this.f55816c);
        parcel.writeLong(this.f55817d);
        parcel.writeInt(this.f55818e);
        parcel.writeString(this.f55819f);
    }
}

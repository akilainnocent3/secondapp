package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4052v0 implements Parcelable {

    @oy.l
    @cs.g
    public static final Parcelable.Creator<C4052v0> CREATOR = new C4027u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f57865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f57866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f57869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f57870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f57871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f57873k;

    public C4052v0(long j10, String str, String str2, String str3) {
        this.f57870h = "";
        this.f57871i = androidx.appcompat.widget.c.f6970r;
        this.f57863a = j10;
        this.f57867e = str2;
        this.f57864b = str;
        this.f57868f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4052v0)) {
            return false;
        }
        C4052v0 c4052v0 = (C4052v0) obj;
        return this.f57863a == c4052v0.f57863a && kotlin.jvm.internal.m0.g(this.f57871i, c4052v0.f57871i) && kotlin.jvm.internal.m0.g(this.f57864b, c4052v0.f57864b) && kotlin.jvm.internal.m0.g(this.f57867e, c4052v0.f57867e);
    }

    public final int hashCode() {
        long j10 = this.f57863a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f57867e;
        return this.f57871i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.f57863a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.m0.p(dest, "dest");
        dest.writeLong(this.f57863a);
        dest.writeString(this.f57871i);
        dest.writeString(this.f57867e);
    }

    public C4052v0(Parcel parcel) {
        this.f57870h = "";
        String str = androidx.appcompat.widget.c.f6970r;
        this.f57871i = androidx.appcompat.widget.c.f6970r;
        this.f57863a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !kotlin.jvm.internal.m0.g(string, androidx.appcompat.widget.c.f6970r) && kotlin.jvm.internal.m0.g(string, "others")) {
            str = "others";
        }
        this.f57871i = str;
        this.f57867e = parcel.readString();
    }
}

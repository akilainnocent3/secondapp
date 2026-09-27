package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wm0 implements ss1 {
    public static final Parcelable.Creator<wm0> CREATOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mx0 f157439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mx0 f157440i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f157443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f157444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f157445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f157446g;

    static {
        lx0 lx0Var = new lx0();
        lx0Var.f152192k = "application/id3";
        f157439h = new mx0(lx0Var);
        lx0 lx0Var2 = new lx0();
        lx0Var2.f152192k = "application/x-scte35";
        f157440i = new mx0(lx0Var2);
        CREATOR = new vm0();
    }

    public wm0(Parcel parcel) {
        this.f157441b = (String) ib3.a((Object) parcel.readString());
        this.f157442c = (String) ib3.a((Object) parcel.readString());
        this.f157443d = parcel.readLong();
        this.f157444e = parcel.readLong();
        this.f157445f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }

    @Override // yads.ss1
    public final byte[] b() {
        if (a() != null) {
            return this.f157445f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wm0.class == obj.getClass()) {
            wm0 wm0Var = (wm0) obj;
            if (this.f157443d == wm0Var.f157443d && this.f157444e == wm0Var.f157444e && ib3.a(this.f157441b, wm0Var.f157441b) && ib3.a(this.f157442c, wm0Var.f157442c) && Arrays.equals(this.f157445f, wm0Var.f157445f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f157446g == 0) {
            String str = this.f157441b;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f157442c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f157443d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f157444e;
            this.f157446g = Arrays.hashCode(this.f157445f) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f157446g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f157441b + ", id=" + this.f157444e + ", durationMs=" + this.f157443d + ", value=" + this.f157442c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f157441b);
        parcel.writeString(this.f157442c);
        parcel.writeLong(this.f157443d);
        parcel.writeLong(this.f157444e);
        parcel.writeByteArray(this.f157445f);
    }

    @Override // yads.ss1
    public final mx0 a() {
        String str = this.f157441b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f157440i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f157439h;
            default:
                return null;
        }
    }

    public wm0(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f157441b = str;
        this.f157442c = str2;
        this.f157443d = j10;
        this.f157444e = j11;
        this.f157445f = bArr;
    }
}

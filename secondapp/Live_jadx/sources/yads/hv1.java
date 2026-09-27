package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hv1 implements ss1 {
    public static final Parcelable.Creator<hv1> CREATOR = new gv1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f150320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f150321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f150322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f150323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f150324f;

    public hv1(long j10, long j11, long j12, long j13, long j14) {
        this.f150320b = j10;
        this.f150321c = j11;
        this.f150322d = j12;
        this.f150323e = j13;
        this.f150324f = j14;
    }

    @Override // yads.ss1
    public /* synthetic */ mx0 a() {
        return ya4.a(this);
    }

    @Override // yads.ss1
    public /* synthetic */ byte[] b() {
        return ya4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hv1.class == obj.getClass()) {
            hv1 hv1Var = (hv1) obj;
            if (this.f150320b == hv1Var.f150320b && this.f150321c == hv1Var.f150321c && this.f150322d == hv1Var.f150322d && this.f150323e == hv1Var.f150323e && this.f150324f == hv1Var.f150324f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f150320b;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        long j11 = this.f150321c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f150322d;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f150323e;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f150324f;
        return i13 + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f150320b + ", photoSize=" + this.f150321c + ", photoPresentationTimestampUs=" + this.f150322d + ", videoStartPosition=" + this.f150323e + ", videoSize=" + this.f150324f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f150320b);
        parcel.writeLong(this.f150321c);
        parcel.writeLong(this.f150322d);
        parcel.writeLong(this.f150323e);
        parcel.writeLong(this.f150324f);
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }

    public hv1(Parcel parcel) {
        this.f150320b = parcel.readLong();
        this.f150321c = parcel.readLong();
        this.f150322d = parcel.readLong();
        this.f150323e = parcel.readLong();
        this.f150324f = parcel.readLong();
    }
}

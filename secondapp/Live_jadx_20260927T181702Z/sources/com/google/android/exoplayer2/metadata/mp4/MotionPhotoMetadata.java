package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import lj.n;
import re.h3;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48540f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] G() {
        return of.a.a(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ n2 H() {
        return of.a.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.f48536b == motionPhotoMetadata.f48536b && this.f48537c == motionPhotoMetadata.f48537c && this.f48538d == motionPhotoMetadata.f48538d && this.f48539e == motionPhotoMetadata.f48539e && this.f48540f == motionPhotoMetadata.f48540f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + n.l(this.f48536b)) * 31) + n.l(this.f48537c)) * 31) + n.l(this.f48538d)) * 31) + n.l(this.f48539e)) * 31) + n.l(this.f48540f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void n0(h3.b bVar) {
        of.a.c(this, bVar);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f48536b + ", photoSize=" + this.f48537c + ", photoPresentationTimestampUs=" + this.f48538d + ", videoStartPosition=" + this.f48539e + ", videoSize=" + this.f48540f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f48536b);
        parcel.writeLong(this.f48537c);
        parcel.writeLong(this.f48538d);
        parcel.writeLong(this.f48539e);
        parcel.writeLong(this.f48540f);
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f48536b = j10;
        this.f48537c = j11;
        this.f48538d = j12;
        this.f48539e = j13;
        this.f48540f = j14;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f48536b = parcel.readLong();
        this.f48537c = parcel.readLong();
        this.f48538d = parcel.readLong();
        this.f48539e = parcel.readLong();
        this.f48540f = parcel.readLong();
    }
}

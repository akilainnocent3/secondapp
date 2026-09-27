package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f65349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f65351c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<DownloadProgress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f65349a = j10;
        this.f65351c = j11;
        this.f65350b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f65349a;
    }

    public int getCurrentDownloadRate() {
        return this.f65350b;
    }

    public long getTotal() {
        return this.f65351c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f65349a);
        parcel.writeLong(this.f65351c);
        parcel.writeInt(this.f65350b);
    }

    public DownloadProgress(Parcel parcel) {
        this.f65349a = parcel.readLong();
        this.f65351c = parcel.readLong();
        this.f65350b = parcel.readInt();
    }
}

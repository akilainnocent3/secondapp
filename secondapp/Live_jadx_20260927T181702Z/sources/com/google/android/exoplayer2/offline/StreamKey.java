package com.google.android.exoplayer2.offline;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import eh.o1;
import re.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class StreamKey implements Comparable<StreamKey>, Parcelable, j {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f48597e = o1.R0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f48598f = o1.R0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f48599g = o1.R0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48602d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    public static StreamKey b(Bundle bundle) {
        return new StreamKey(bundle.getInt(f48597e, 0), bundle.getInt(f48598f, 0), bundle.getInt(f48599g, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f48600b - streamKey.f48600b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f48601c - streamKey.f48601c;
        return i11 == 0 ? this.f48602d - streamKey.f48602d : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f48600b == streamKey.f48600b && this.f48601c == streamKey.f48601c && this.f48602d == streamKey.f48602d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f48600b * 31) + this.f48601c) * 31) + this.f48602d;
    }

    @Override // re.j
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f48600b;
        if (i10 != 0) {
            bundle.putInt(f48597e, i10);
        }
        int i11 = this.f48601c;
        if (i11 != 0) {
            bundle.putInt(f48598f, i11);
        }
        int i12 = this.f48602d;
        if (i12 != 0) {
            bundle.putInt(f48599g, i12);
        }
        return bundle;
    }

    public String toString() {
        return this.f48600b + fe.F + this.f48601c + fe.F + this.f48602d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f48600b);
        parcel.writeInt(this.f48601c);
        parcel.writeInt(this.f48602d);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f48600b = i10;
        this.f48601c = i11;
        this.f48602d = i12;
    }

    public StreamKey(Parcel parcel) {
        this.f48600b = parcel.readInt();
        this.f48601c = parcel.readInt();
        this.f48602d = parcel.readInt();
    }
}

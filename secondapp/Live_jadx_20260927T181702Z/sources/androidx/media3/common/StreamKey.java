package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f13595e = b2.k1(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f13596f = b2.k1(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f13597g = b2.k1(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13600d;

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
        return new StreamKey(bundle.getInt(f13595e, 0), bundle.getInt(f13596f, 0), bundle.getInt(f13597g, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f13598b - streamKey.f13598b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f13599c - streamKey.f13599c;
        return i11 == 0 ? this.f13600d - streamKey.f13600d : i11;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        int i10 = this.f13598b;
        if (i10 != 0) {
            bundle.putInt(f13595e, i10);
        }
        int i11 = this.f13599c;
        if (i11 != 0) {
            bundle.putInt(f13596f, i11);
        }
        int i12 = this.f13600d;
        if (i12 != 0) {
            bundle.putInt(f13597g, i12);
        }
        return bundle;
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
            if (this.f13598b == streamKey.f13598b && this.f13599c == streamKey.f13599c && this.f13600d == streamKey.f13600d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f13598b * 31) + this.f13599c) * 31) + this.f13600d;
    }

    public String toString() {
        return this.f13598b + fe.F + this.f13599c + fe.F + this.f13600d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13598b);
        parcel.writeInt(this.f13599c);
        parcel.writeInt(this.f13600d);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f13598b = i10;
        this.f13599c = i11;
        this.f13600d = i12;
    }

    public StreamKey(Parcel parcel) {
        this.f13598b = parcel.readInt();
        this.f13599c = parcel.readInt();
        this.f13600d = parcel.readInt();
    }
}

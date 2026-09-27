package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import eh.o1;
import java.util.Arrays;
import java.util.List;
import lj.n;
import re.h3;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Entry[] f48426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48427c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Entry extends Parcelable {
        @Nullable
        byte[] G();

        @Nullable
        n2 H();

        void n0(h3.b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.f48427c, (Entry[]) o1.o1(this.f48426b, entryArr));
    }

    public Metadata b(@Nullable Metadata metadata) {
        return metadata == null ? this : a(metadata.f48426b);
    }

    public Metadata c(long j10) {
        return this.f48427c == j10 ? this : new Metadata(j10, this.f48426b);
    }

    public Entry d(int i10) {
        return this.f48426b[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f48426b.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f48426b, metadata.f48426b) && this.f48427c == metadata.f48427c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f48426b) * 31) + n.l(this.f48427c);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f48426b));
        if (this.f48427c == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f48427c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f48426b.length);
        for (Entry entry : this.f48426b) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f48427c);
    }

    public Metadata(long j10, Entry... entryArr) {
        this.f48427c = j10;
        this.f48426b = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j10, List<? extends Entry> list) {
        this(j10, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f48426b = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f48426b;
            if (i10 < entryArr.length) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                this.f48427c = parcel.readLong();
                return;
            }
        }
    }
}

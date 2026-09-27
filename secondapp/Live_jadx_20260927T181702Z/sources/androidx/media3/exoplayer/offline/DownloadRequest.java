package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import cj.v6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import u4.c1;
import u4.l1;
import x4.b2;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f14326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f14327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f14328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final byte[] f14329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f14330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f14331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ByteRange f14332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TimeRange f14333j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f14339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f14340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f14341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public byte[] f14342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f14343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public byte[] f14344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public ByteRange f14345h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public TimeRange f14346i = null;

        public b(String str, Uri uri) {
            this.f14338a = str;
            this.f14339b = uri;
        }

        public DownloadRequest a() {
            String str = this.f14338a;
            Uri uri = this.f14339b;
            String str2 = this.f14340c;
            List listZ = this.f14341d;
            if (listZ == null) {
                listZ = v6.z();
            }
            return new DownloadRequest(str, uri, str2, listZ, this.f14342e, this.f14343f, this.f14344g, this.f14345h, this.f14346i, null);
        }

        @qj.a
        public b b(long j10, long j11) {
            this.f14345h = new ByteRange(j10, j11);
            return this;
        }

        @qj.a
        public b c(@Nullable String str) {
            this.f14343f = str;
            return this;
        }

        @qj.a
        public b d(@Nullable byte[] bArr) {
            this.f14344g = bArr;
            return this;
        }

        @qj.a
        public b e(@Nullable byte[] bArr) {
            this.f14342e = bArr;
            return this;
        }

        @qj.a
        public b f(@Nullable String str) {
            this.f14340c = l1.x(str);
            return this;
        }

        @qj.a
        public b g(@Nullable List<StreamKey> list) {
            this.f14341d = list;
            return this;
        }

        @qj.a
        public b h(long j10, long j11) {
            this.f14346i = new TimeRange(j10, j11);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends IOException {
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, ByteRange byteRange, TimeRange timeRange, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2, byteRange, timeRange);
    }

    public DownloadRequest a(String str) {
        return new DownloadRequest(str, this.f14326c, this.f14327d, this.f14328e, this.f14329f, this.f14330g, this.f14331h, this.f14332i, this.f14333j);
    }

    public DownloadRequest b(@Nullable byte[] bArr) {
        return new DownloadRequest(this.f14325b, this.f14326c, this.f14327d, this.f14328e, bArr, this.f14330g, this.f14331h, this.f14332i, this.f14333j);
    }

    public DownloadRequest c(DownloadRequest downloadRequest) {
        List arrayList;
        l0.d(this.f14325b.equals(downloadRequest.f14325b));
        if (this.f14328e.isEmpty() || downloadRequest.f14328e.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.f14328e);
            for (int i10 = 0; i10 < downloadRequest.f14328e.size(); i10++) {
                StreamKey streamKey = downloadRequest.f14328e.get(i10);
                if (!arrayList.contains(streamKey)) {
                    arrayList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f14325b, downloadRequest.f14326c, downloadRequest.f14327d, arrayList, downloadRequest.f14329f, downloadRequest.f14330g, downloadRequest.f14331h, downloadRequest.f14332i, downloadRequest.f14333j);
    }

    public c1 d() {
        return e(new c1.c());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c1 e(c1.c cVar) {
        return cVar.E(this.f14325b).M(this.f14326c).l(this.f14330g).G(this.f14327d).I(this.f14328e).a();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f14325b.equals(downloadRequest.f14325b) && this.f14326c.equals(downloadRequest.f14326c) && Objects.equals(this.f14327d, downloadRequest.f14327d) && this.f14328e.equals(downloadRequest.f14328e) && Arrays.equals(this.f14329f, downloadRequest.f14329f) && Objects.equals(this.f14330g, downloadRequest.f14330g) && Arrays.equals(this.f14331h, downloadRequest.f14331h) && Objects.equals(this.f14332i, downloadRequest.f14332i) && Objects.equals(this.f14333j, downloadRequest.f14333j);
    }

    public int hashCode() {
        int iHashCode = ((this.f14325b.hashCode() * 961) + this.f14326c.hashCode()) * 31;
        String str = this.f14327d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f14328e.hashCode()) * 31) + Arrays.hashCode(this.f14329f)) * 31;
        String str2 = this.f14330g;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14331h)) * 31;
        ByteRange byteRange = this.f14332i;
        int iHashCode4 = (iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        TimeRange timeRange = this.f14333j;
        return iHashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public String toString() {
        return this.f14327d + ":" + this.f14325b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14325b);
        parcel.writeString(this.f14326c.toString());
        parcel.writeString(this.f14327d);
        parcel.writeInt(this.f14328e.size());
        for (int i11 = 0; i11 < this.f14328e.size(); i11++) {
            parcel.writeParcelable(this.f14328e.get(i11), 0);
        }
        parcel.writeByteArray(this.f14329f);
        parcel.writeString(this.f14330g);
        parcel.writeByteArray(this.f14331h);
        parcel.writeParcelable(this.f14332i, 0);
        parcel.writeParcelable(this.f14333j, 0);
    }

    public DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2, @Nullable ByteRange byteRange, @Nullable TimeRange timeRange) {
        int iI1 = b2.i1(uri, str2);
        if (iI1 == 0 || iI1 == 2 || iI1 == 1) {
            l0.k(str3 == null, "customCacheKey must be null for type: %s", iI1);
            this.f14332i = null;
            this.f14333j = timeRange;
        } else {
            this.f14332i = byteRange;
            this.f14333j = null;
        }
        this.f14325b = str;
        this.f14326c = uri;
        this.f14327d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f14328e = Collections.unmodifiableList(arrayList);
        this.f14329f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f14330g = str3;
        this.f14331h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : b2.f144214f;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class TimeRange implements Parcelable {
        public static final Parcelable.Creator<TimeRange> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f14337c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<TimeRange> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public TimeRange createFromParcel(Parcel parcel) {
                return new TimeRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public TimeRange[] newArray(int i10) {
                return new TimeRange[i10];
            }
        }

        public TimeRange(long j10, long j11) {
            l0.d(j11 >= 0 || j11 == -9223372036854775807L);
            this.f14336b = j10;
            this.f14337c = j11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) obj;
            return this.f14336b == timeRange.f14336b && this.f14337c == timeRange.f14337c;
        }

        public int hashCode() {
            return (((int) this.f14336b) * 961) + ((int) this.f14337c);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f14336b);
            parcel.writeLong(this.f14337c);
        }

        public TimeRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f14335c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<ByteRange> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteRange[] newArray(int i10) {
                return new ByteRange[i10];
            }
        }

        public ByteRange(long j10, long j11) {
            l0.d(j10 >= 0);
            l0.d(j11 >= 0 || j11 == -1);
            this.f14334b = j10;
            this.f14335c = j11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.f14334b == byteRange.f14334b && this.f14335c == byteRange.f14335c;
        }

        public int hashCode() {
            return (((int) this.f14334b) * 961) + ((int) this.f14335c);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f14334b);
            parcel.writeLong(this.f14335c);
        }

        public ByteRange(Parcel parcel) {
            this(parcel.readLong(), parcel.readLong());
        }
    }

    public DownloadRequest(Parcel parcel) {
        this.f14325b = (String) b2.o(parcel.readString());
        this.f14326c = Uri.parse((String) b2.o(parcel.readString()));
        this.f14327d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f14328e = Collections.unmodifiableList(arrayList);
        this.f14329f = parcel.createByteArray();
        this.f14330g = parcel.readString();
        this.f14331h = (byte[]) b2.o(parcel.createByteArray());
        this.f14332i = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
        this.f14333j = (TimeRange) parcel.readParcelable(TimeRange.class.getClassLoader());
    }
}

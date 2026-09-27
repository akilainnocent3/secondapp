package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import cj.v6;
import eh.o1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import re.x2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f48584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f48585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f48586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final byte[] f48587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f48588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f48589h;

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
        public final String f48590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f48591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f48592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f48593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public byte[] f48594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f48595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public byte[] f48596g;

        public b(String str, Uri uri) {
            this.f48590a = str;
            this.f48591b = uri;
        }

        public DownloadRequest a() {
            String str = this.f48590a;
            Uri uri = this.f48591b;
            String str2 = this.f48592c;
            List listZ = this.f48593d;
            if (listZ == null) {
                listZ = v6.z();
            }
            return new DownloadRequest(str, uri, str2, listZ, this.f48594e, this.f48595f, this.f48596g, null);
        }

        @qj.a
        public b b(@Nullable String str) {
            this.f48595f = str;
            return this;
        }

        @qj.a
        public b c(@Nullable byte[] bArr) {
            this.f48596g = bArr;
            return this;
        }

        @qj.a
        public b d(@Nullable byte[] bArr) {
            this.f48594e = bArr;
            return this;
        }

        @qj.a
        public b e(@Nullable String str) {
            this.f48592c = str;
            return this;
        }

        @qj.a
        public b f(@Nullable List<StreamKey> list) {
            this.f48593d = list;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends IOException {
    }

    public /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public DownloadRequest a(String str) {
        return new DownloadRequest(str, this.f48584c, this.f48585d, this.f48586e, this.f48587f, this.f48588g, this.f48589h);
    }

    public DownloadRequest b(@Nullable byte[] bArr) {
        return new DownloadRequest(this.f48583b, this.f48584c, this.f48585d, this.f48586e, bArr, this.f48588g, this.f48589h);
    }

    public DownloadRequest c(DownloadRequest downloadRequest) {
        List arrayList;
        eh.a.a(this.f48583b.equals(downloadRequest.f48583b));
        if (this.f48586e.isEmpty() || downloadRequest.f48586e.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.f48586e);
            for (int i10 = 0; i10 < downloadRequest.f48586e.size(); i10++) {
                StreamKey streamKey = downloadRequest.f48586e.get(i10);
                if (!arrayList.contains(streamKey)) {
                    arrayList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f48583b, downloadRequest.f48584c, downloadRequest.f48585d, arrayList, downloadRequest.f48587f, downloadRequest.f48588g, downloadRequest.f48589h);
    }

    public x2 d() {
        return new x2.c().D(this.f48583b).L(this.f48584c).l(this.f48588g).F(this.f48585d).H(this.f48586e).a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f48583b.equals(downloadRequest.f48583b) && this.f48584c.equals(downloadRequest.f48584c) && o1.g(this.f48585d, downloadRequest.f48585d) && this.f48586e.equals(downloadRequest.f48586e) && Arrays.equals(this.f48587f, downloadRequest.f48587f) && o1.g(this.f48588g, downloadRequest.f48588g) && Arrays.equals(this.f48589h, downloadRequest.f48589h);
    }

    public final int hashCode() {
        int iHashCode = ((this.f48583b.hashCode() * 961) + this.f48584c.hashCode()) * 31;
        String str = this.f48585d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f48586e.hashCode()) * 31) + Arrays.hashCode(this.f48587f)) * 31;
        String str2 = this.f48588g;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f48589h);
    }

    public String toString() {
        return this.f48585d + ":" + this.f48583b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48583b);
        parcel.writeString(this.f48584c.toString());
        parcel.writeString(this.f48585d);
        parcel.writeInt(this.f48586e.size());
        for (int i11 = 0; i11 < this.f48586e.size(); i11++) {
            parcel.writeParcelable(this.f48586e.get(i11), 0);
        }
        parcel.writeByteArray(this.f48587f);
        parcel.writeString(this.f48588g);
        parcel.writeByteArray(this.f48589h);
    }

    public DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2) {
        int iP0 = o1.P0(uri, str2);
        if (iP0 == 0 || iP0 == 2 || iP0 == 1) {
            eh.a.b(str3 == null, "customCacheKey must be null for type: " + iP0);
        }
        this.f48583b = str;
        this.f48584c = uri;
        this.f48585d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f48586e = Collections.unmodifiableList(arrayList);
        this.f48587f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f48588g = str3;
        this.f48589h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : o1.f81147f;
    }

    public DownloadRequest(Parcel parcel) {
        this.f48583b = (String) o1.o(parcel.readString());
        this.f48584c = Uri.parse((String) o1.o(parcel.readString()));
        this.f48585d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f48586e = Collections.unmodifiableList(arrayList);
        this.f48587f = parcel.createByteArray();
        this.f48588g = parcel.readString();
        this.f48589h = (byte[]) o1.o(parcel.createByteArray());
    }
}

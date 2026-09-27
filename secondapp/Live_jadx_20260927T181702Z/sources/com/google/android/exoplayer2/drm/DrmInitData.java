package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import eh.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeData[] f48281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f48283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48284e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f48286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f48287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f48288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final byte[] f48289f;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return c() && !schemeData.c() && d(schemeData.f48286c);
        }

        @CheckResult
        public SchemeData b(@Nullable byte[] bArr) {
            return new SchemeData(this.f48286c, this.f48287d, this.f48288e, bArr);
        }

        public boolean c() {
            return this.f48289f != null;
        }

        public boolean d(UUID uuid) {
            return re.k.f125809d2.equals(this.f48286c) || uuid.equals(this.f48286c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return o1.g(this.f48287d, schemeData.f48287d) && o1.g(this.f48288e, schemeData.f48288e) && o1.g(this.f48286c, schemeData.f48286c) && Arrays.equals(this.f48289f, schemeData.f48289f);
        }

        public int hashCode() {
            if (this.f48285b == 0) {
                int iHashCode = this.f48286c.hashCode() * 31;
                String str = this.f48287d;
                this.f48285b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f48288e.hashCode()) * 31) + Arrays.hashCode(this.f48289f);
            }
            return this.f48285b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f48286c.getMostSignificantBits());
            parcel.writeLong(this.f48286c.getLeastSignificantBits());
            parcel.writeString(this.f48287d);
            parcel.writeString(this.f48288e);
            parcel.writeByteArray(this.f48289f);
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f48286c = (UUID) eh.a.g(uuid);
            this.f48287d = str;
            this.f48288e = (String) eh.a.g(str2);
            this.f48289f = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f48286c = new UUID(parcel.readLong(), parcel.readLong());
            this.f48287d = parcel.readString();
            this.f48288e = (String) o1.o(parcel.readString());
            this.f48289f = parcel.createByteArray();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static boolean c(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f48286c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static DrmInitData e(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f48283d;
            for (SchemeData schemeData : drmInitData.f48281b) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f48283d;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f48281b) {
                if (schemeData2.c() && !c(arrayList, size, schemeData2.f48286c)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = re.k.f125809d2;
        if (uuid.equals(schemeData.f48286c)) {
            return uuid.equals(schemeData2.f48286c) ? 0 : 1;
        }
        return schemeData.f48286c.compareTo(schemeData2.f48286c);
    }

    @CheckResult
    public DrmInitData d(@Nullable String str) {
        return o1.g(this.f48283d, str) ? this : new DrmInitData(str, false, this.f48281b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (o1.g(this.f48283d, drmInitData.f48283d) && Arrays.equals(this.f48281b, drmInitData.f48281b)) {
                return true;
            }
        }
        return false;
    }

    public SchemeData f(int i10) {
        return this.f48281b[i10];
    }

    public DrmInitData g(DrmInitData drmInitData) {
        String str;
        String str2 = this.f48283d;
        eh.a.i(str2 == null || (str = drmInitData.f48283d) == null || TextUtils.equals(str2, str));
        String str3 = this.f48283d;
        if (str3 == null) {
            str3 = drmInitData.f48283d;
        }
        return new DrmInitData(str3, (SchemeData[]) o1.o1(this.f48281b, drmInitData.f48281b));
    }

    public int hashCode() {
        if (this.f48282c == 0) {
            String str = this.f48283d;
            this.f48282c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f48281b);
        }
        return this.f48282c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48283d);
        parcel.writeTypedArray(this.f48281b, 0);
    }

    public DrmInitData(@Nullable String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, boolean z10, SchemeData... schemeDataArr) {
        this.f48283d = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f48281b = schemeDataArr;
        this.f48284e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.f48283d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) o1.o((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f48281b = schemeDataArr;
        this.f48284e = schemeDataArr.length;
    }
}
